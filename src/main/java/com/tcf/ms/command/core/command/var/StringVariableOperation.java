package com.tcf.ms.command.core.command.var;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 变量操作符
 */
@Deprecated
public interface StringVariableOperation {

    /**
     * 赋值给另一个变量
     * @param variable 目标变量
     * @return 目标变量
     */
    StringVariableOperation assign(StringVariable variable);

    /**
     * 将加运算的结果保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation add(Variable variable1, Variable variable2);

    /**
     * 将减运算的结果保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation sub(Variable variable1,Variable variable2);

    /**
     * 将乘运算结果保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation mul(Variable variable1,Variable variable2);

    /**
     * 将除运算结果保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation div(Variable variable1,Variable variable2);
    StringVariableOperation mod(Variable variable1,Variable variable2);

    /**
     * 将变量求平方根后再保存到当前变量中
     * @return
     */
    StringVariableOperation sqrt();

    /**
     * 将变量求平方根后，保存到指定变量中
     * @param variable
     * @return
     */
    StringVariableOperation sqrt(StringVariable variable);

    /**
     * 求n次方，然后保存到当前变量中
     * @param variable1 底
     * @param variable2 幂
     * @return
     */
    StringVariableOperation pow(Variable variable1,Variable variable2);

    /**
     * 求当前变量的sin值，保存到当前变量中
     * @return
     */
    StringVariableOperation sin();

    /**
     * 求当前变量的sin值，保存到新的变量中
     * @param variable
     * @return
     */
    StringVariableOperation sin(Variable variable);

    /**
     * 求当前变量的cos值，保存到当前变量中
     * @return
     */
    StringVariableOperation cos();

    /**
     * 求当前变量的cos值，保存到新的变量中
     * @param variable
     * @return
     */
    StringVariableOperation cos(Variable variable);

    /**
     * 求当前变量的tan值，保存到当前变量中
     * @return
     */
    StringVariableOperation tan();

    /**
     * 求当前变量的tan值，保存到新的变量中
     * @param variable
     * @return
     */
    StringVariableOperation tan(Variable variable);

    /**
     * 二进制操作,将两个变量【与（&）】运算后，保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation and(Variable variable1,Variable variable2);

    /**
     * 二进制操作,将两个变量【或（|）】运算后，保存到当前变量中
     * @param variable1
     * @param variable2
     * @return
     */
    StringVariableOperation or(Variable variable1,Variable variable2);

    /**
     * 自加，如：i += 18
     * @param variable
     * @return
     */
    StringVariableOperation add(Variable variable);
    /**
     * 自减，如：i -= 18
     * @param variable
     * @return
     */
    StringVariableOperation sub(Variable variable);
    /**
     * 自乘，如：i *= 18
     * @param variable
     * @return
     */
    StringVariableOperation mul(Variable variable);
    /**
     * 自除，如：i /= 18
     * @param variable
     * @return
     */
    StringVariableOperation div(Variable variable);
    /**
     * 自模，如：i %= 18
     * @param variable
     * @return
     */
    StringVariableOperation mod(Variable variable);

    /**
     * 限定范围，如果小于lowerBound,结果为lowerBound，如果大于upperBound，结果为upperBound，否则，结果不变
     * @param lowerBound 最小值
     * @param upperBound 最大值
     * @return
     */
    StringVariableOperation clamp(Variable lowerBound,Variable upperBound);

    /**
     * 求绝对值
     * @return
     */
    StringVariableOperation abs();

    /**
     * 二进制操作，将当前变量与参数【与（&）】运算后，保存到当前变量中
     * @param variable
     * @return
     */
    StringVariableOperation and(Variable variable);
    /**
     * 二进制操作，将当前变量与参数【或（|）】运算后，保存到当前变量中
     * @param variable
     * @return
     */
    StringVariableOperation or(Variable variable);

    StringVariableOperation min(Variable variable);

    StringVariableOperation max(Variable variable);

    /**
     * 生成随机数据，不建议使用，可才使用带参数的
     *
     * @see StringVariableOperation#random(com.tcf.ms.command.core.base.var.Variable, com.tcf.ms.command.core.base.var.Variable)
     * @return
     */
    StringVariableOperation random();

    /**
     * 生成指定范围的随机数据
     * @param lower 最小值（包含）
     * @param upper 最大值（不包含）
     * @return
     */
    StringVariableOperation random(Variable lower,Variable upper);

}
