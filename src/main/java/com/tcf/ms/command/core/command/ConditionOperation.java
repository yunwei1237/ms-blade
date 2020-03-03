package com.tcf.ms.command.core.command;


import com.tcf.ms.command.Operation;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.function.Supplier;

/**
 * 条件相关的脚本
 */
public interface ConditionOperation extends Operation {

    /**
     * 相等
     *
     * 如：1 = 2  ==>  eq(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable eq(Variable var1, Variable var2);
    /**
     * 不相等
     *
     * 如：1 != 2 ==> neq(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable neq(Variable var1, Variable var2);
    /**
     * 大于等于
     *
     * 如：1 >= 2  ==> ge(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable ge(Variable var1, Variable var2);
    /**
     * 大于
     *
     * 如：1 > 2  ==> gt(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable gt(Variable var1, Variable var2);
    /**
     * 小于等于
     *
     * 如：1 <= 2  ==> le(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable le(Variable var1, Variable var2);
    /**
     * 小于
     *
     * 如：1 < 2  ==> lt(Variable.local(1),Variable.local(2))
     * @param var1
     * @param var2
     * @return
     */
    Conditable lt(Variable var1, Variable var2);

    /**
     * 区间判断
     *
     * 如：18 <= age < 25   ==> between(Variable.local(18),Variable.local("age"),Variable.local(25))
     * @param var1 对象
     * @param var2  大于等于（包含）
     * @param var3  小于（不包含）
     * @return
     */
    Conditable between(Variable var1, Variable var2, Variable var3);

    /**
     * 并且
     *
     * 注：只是简单地将每一个条件进行取反
     * @param conditable
     * @return
     */
    void and(Conditable...conditable);

    /**
     * 或者
     *
     * 注：只是简单地将每一个条件进行取反
     * @param conditable
     * @return
     */
    void or(Conditable...conditable);

    /**
     * 取反
     *
     * 注：只是简单地将每一个条件进行取反
     * @param conditable
     * @return
     */
    void not(Conditable...conditable);

    /**
     * 分组操作,可以进行复杂条件操作
     */
    void group(Supplier<ConditableGroup> function);
}
