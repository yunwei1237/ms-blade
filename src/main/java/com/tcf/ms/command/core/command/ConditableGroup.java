package com.tcf.ms.command.core.command;

import cn.hutool.core.util.IdUtil;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.*;

import java.util.List;

/**
 * 代表是一个条件组，可以嵌套使用
 *

 */
public class ConditableGroup extends ConditionScript implements Conditable {

    /**
     * 用于标识分组的唯一性
     */
    public String uuid = IdUtil.objectId();
    
    /*
        continue_变量代表是一个条件的结果的状态

        continue_变量后边跟的数值，使用了对象的hash值，确保变量的唯一性

        0:代表初始值
        1:代表条件都满足
     */

    /**
     * 条件不成功
     */
    public static int FALSE = 0;
    /**
     * 条件成功
     */
    public static int TRUE = 1;


    private ConditableGroup group;

    /**
     * 必须先调用该方法，然后再生成构建复杂条件
     * @param group
     */
    protected void create(ConditableGroup group){
        this.group = group;
    }

    /**
     * 获得创建好的条件分组
     * @return
     */
    public ConditableGroup getGroup(){
        this.group.merge();
        return this.group;
    }

    /**
     * 就是将ConditableGroup对象展开成List<Operation>集合
     * 如果是分组就进行展开，如果不是分组就不做任何改变
     */
    private void merge(){
        List<Operation> operations = this.getOperations();
        for (int i = 0; i < operations.size(); i++) {
            Operation operation = operations.get(i);
            if(operation instanceof ConditableGroup){
                ((ConditableGroup) operation).merge();
                //展开时，去除分组对象，就像使用了一组命令替换了分组对象
                removeOperation(i);
                appendOperations(i,((ConditableGroup) operation).getOperations());
            }
        }
    }

    /**
     * 与，分组形式
     * 主要的思想是在条件之前创建一个临时变量，在条件执行成功时修改执行状态，如果状态等于成功，那说明所有条件都执行成功
     *
     * boolean isOk = false;
     * if(条件1成功 && 条件2成功 && 条件3成功){
     *     .....
     *     isOk = true;
     * }
     *
     * 如果isOk等于true，说明条件执行成功
     * @param conditables
     * @return
     */
    protected ConditableGroup andGroup(Conditable...conditables){
        ConditableGroup conditableGroup = new ConditableGroup();
        conditableGroup.appendOperation(new Assign(Variable.local("continue_" + conditableGroup.uuid),Variable.number(FALSE)));
        conditableGroup.appendOperation(new TryBegin());
        for (Conditable conditable : conditables) {
            conditableGroup.appendOperation(conditable);
        }
        conditableGroup.appendOperation(new Assign(Variable.local("continue_" + conditableGroup.uuid),Variable.number(TRUE)));
        conditableGroup.appendOperation(new TryEnd());
        conditableGroup.appendOperation(new Eq(Variable.local("continue_" + conditableGroup.uuid),Variable.number(TRUE)));
        return conditableGroup;
    }

    /**
     * 或，分组形式
     *
     * 主要是思想是在条件之前创建一个临时临时变量，在每一个分支的最后一条语句中修改执行状态，如果所有分支执行完成后状态发生了改变，就说明，至少有一个条件执行成功
     *
     * boolean isOk = false;
     * if(条件1成功){
     *     ...
     *     isOk = true;
     * }else if(条件2成功){
     *     ...
     *     isOk = true;
     * }else if(条件3成功){
     *     ...
     *     isOk = true;
     * }
     *
     * 如果isOk等于true，说明条件执行成功
     *
     * @param conditables
     * @return
     */
    protected ConditableGroup orGroup(Conditable...conditables){
        ConditableGroup conditableGroup = new ConditableGroup();
        conditableGroup.appendOperation(new Assign(Variable.local("continue_" + conditableGroup.uuid),Variable.number(FALSE)));
        conditableGroup.appendOperation(new TryBegin());
        for (int i = 0; i < conditables.length - 1; i++) {
            Conditable conditable = conditables[i];
            conditableGroup.appendOperation(conditable);
            conditableGroup.appendOperation(new Assign(Variable.local("continue_" + conditableGroup.uuid),Variable.number(TRUE)));
            conditableGroup.appendOperation(new ElseTry());
        }
        conditableGroup.appendOperation(conditables[conditables.length - 1]);
        conditableGroup.appendOperation(new Assign(Variable.local("continue_" + conditableGroup.uuid),Variable.number(TRUE)));
        conditableGroup.appendOperation(new TryEnd());
        conditableGroup.appendOperation(new Eq(Variable.local("continue_" + conditableGroup.uuid),Variable.number(TRUE)));
        return conditableGroup;
    }

    /**
     * 非，分组形式
     *
     * 主要的思想是所有条件执行结束后，将最后的状态进行取反
     *
     * 与操作时
     * boolean isOk = false;
     * if(条件成功){
     *     ...
     *     isOk = true;
     * }
     * 将isOk取反
     *
     *
     * 或操作时
     * boolean isOk = false;
     * if(条件1成功){
     *     ...
     *     isOk=true;
     * }else if(条件2成功){
     *     ...
     *     isOk = true;
     * }else if(条件3成功){
     *     ...
     *     isOk = true;
     * }
     * 将isOk进行取反
     * @param conditable
     * @return
     */
    protected ConditableGroup notGroup(Conditable conditable){
        ConditableGroup conditableGroup = new ConditableGroup();
        if(conditable instanceof ConditableGroup){
            ((ConditableGroup) conditable).merge();
            List<Operation> operations = ((ConditableGroup) conditable).getOperations();
            conditableGroup.appendOperations(operations);
            Operation lastOperation = operations.get(operations.size() - 1);
            //删除最后一行数据
            conditableGroup.removeOperation(operations.size() - 1);
            //将最后的eq语句进行最反
            conditableGroup.appendOperation(new Neg(lastOperation));
        }else {
            conditableGroup.appendOperation(new Neg(conditable));
        }
        return conditableGroup;
    }

    @Override
    public String toScriptString() {
        this.merge();
        return super.toScriptString();
    }
}
