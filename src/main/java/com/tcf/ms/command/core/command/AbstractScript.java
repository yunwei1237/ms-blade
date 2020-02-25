package com.tcf.ms.command.core.command;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ArrayUtil;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationExecutable;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 代表所有脚本的父类
 */
public abstract class AbstractScript implements OperationExecutable {

    /**
     * 所有的操作功能
     */
    private List<Operation> operations = new ArrayList<>();

    /**
     * 追加操作到当前脚本中
     * @param operation
     */
    protected void appendOperation(Operation operation){
        if(operation != null)
            this.operations.add(operation);
    }

    /**
     * 追加多条操作到当前脚本中
     * @param operations
     */
    protected void appendOperations(List<Operation> operations){
        if(CollectionUtil.isNotEmpty(operations))
            CollectionUtil.addAll(this.operations,operations);
    }

    /**
     * 追加多条操作到当前脚本中
     * @param operations
     */
    protected void appendOperations(Operation...operations){
        if(ArrayUtil.isNotEmpty(operations))
            CollectionUtil.addAll(this.operations,operations);
    }

    /**
     * 插入多条操作到脚本指定位置
     * @param index
     * @param operations
     */
    protected void appendOperations(int index,List<Operation> operations){
        if(CollectionUtil.isNotEmpty(operations))
            for (int i = operations.size() - 1; i >= 0; i--) {
                this.operations.add(index,operations.get(i));
            }
    }

    protected void removeOperation(int index){
        this.operations.remove(index);
    }

    /**
     * 插入多条脚本到脚本指定位置
     * @param index
     * @param operations
     */
    protected void appendOperations(int index,Operation...operations){
        if(ArrayUtil.isNotEmpty(operations))
            for (int i = operations.length - 1; i >= 0; i--) {
                CollectionUtil.addAll(this.operations, operations);
            }
    }



    protected List<Operation> getOperations(){
        return this.operations;
    }

    @Override
    public void execute() {

    }

    @Override
    public String toScriptString() {
        //翻译脚本
        this.execute();
        //输出脚本
        StringBuffer buffer = new StringBuffer();
        if(operations.size() == 0){
            return buffer.toString();
        }

        for (int i = 0; i < operations.size() - 1; i++) {
            String line = operations.get(i).toScriptString();
            if(StringUtils.isNotBlank(line)) {
                buffer.append(line + "\n");
            }
        }
        String lastLine = operations.get(operations.size() - 1).toScriptString();
        if(StringUtils.isNotBlank(lastLine)) {
            buffer.append(lastLine);
        }
        return buffer.toString();
    }
}
