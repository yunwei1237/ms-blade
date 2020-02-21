package com.tcf.ms.command.core.command.var;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 变量操作符
 */
public interface VariableOperation {

    /**
     * 赋值给另一个变量
     * @param variable 目标变量
     * @return 目标变量
     */
    void assign(StringVariable variable, Variable value);

    /**
     * 将加运算的结果保存到当前变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void add(StringVariable variable, Variable value1, Variable value2);

    /**
     * 将减运算的结果保存到当前变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void sub(StringVariable variable, Variable value1, Variable value2);

    /**
     * 将乘运算结果保存到当前变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void mul(StringVariable variable, Variable value1, Variable value2);

    /**
     * 将除运算结果保存到当前变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void div(StringVariable variable, Variable value1, Variable value2);

    /**
     * 取模（求余）
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void mod(StringVariable variable, Variable value1, Variable value2);

    /**
     * 求平方根
     * @param variable
     * @param value
     * @return
     */
    void sqrt(StringVariable variable, Variable value);


    /**
     * 求value1的value2次方
     * @param variable 底
     * @param value1 底
     * @param value2 幂
     * @return
     */
    void pow(StringVariable variable, Variable value1, Variable value2);


    /**
     * 求value的sin值
     * @param variable
     * @param value
     * @return
     */
    void sin(StringVariable variable, Variable value);

    /**
     * 求value的cos值
     * @param variable
     * @param value
     * @return
     */
    void cos(StringVariable variable, Variable value);

    /**
     * 求value的tan值
     * @param variable
     * @param value
     * @return
     */
    void tan(StringVariable variable, Variable value);

    /**
     * 二进制操作,将两个变量【与（&）】运算后，保存到variable变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void and(StringVariable variable, Variable value1, Variable value2);

    /**
     * 二进制操作,将两个变量【或（|）】运算后，保存到variable变量中
     * @param variable
     * @param value1
     * @param value2
     * @return
     */
    void or(StringVariable variable, Variable value1, Variable value2);

    /**
     * 自加，如：i += 18
     * @param variable
     * @param value
     * @return
     */
    void add(StringVariable variable, Variable value);
    /**
     * 自减，如：i -= 18
     * @param variable
     * @param value
     * @return
     */
    void sub(StringVariable variable, Variable value);
    /**
     * 自乘，如：i *= 18
     * @param variable
     * @param value
     * @return
     */
    void mul(StringVariable variable, Variable value);
    /**
     * 自除，如：i /= 18
     * @param variable
     * @param value
     * @return
     */
    void div(StringVariable variable, Variable value);
    /**
     * 自模，如：i %= 18
     * @param variable
     * @param value
     * @return
     */
    void mod(StringVariable variable, Variable value);

    /**
     * 限定范围，如果小于lowerBound,结果为lowerBound，如果大于upperBound，结果为upperBound，否则，结果不变
     * @param variable
     * @param lowerBound 最小值
     * @param upperBound 最大值
     * @return
     */
    void clamp(StringVariable variable, Variable lowerBound, Variable upperBound);

    /**
     * 二进制操作，将当前变量与参数【与（&）】运算后，保存到variable变量中
     * @param variable
     * @param value
     * @return
     */
    void and(StringVariable variable, Variable value);
    /**
     * 二进制操作，将当前变量与参数【或（|）】运算后，保存到variable变量中
     * @param variable
     * @param value
     * @return
     */
    void or(StringVariable variable, Variable value);

    /**
     * 求最大值
     * @param variable
     * @param value
     * @return
     */
    void min(StringVariable variable, Variable value);

    /**
     * 求最小值
     * @param variable
     * @param value
     * @return
     */
    void max(StringVariable variable, Variable value);

    /**
     * 生成随机数据，不建议使用，可才使用带参数的
     *
     * @see VariableOperation#random(com.tcf.ms.command.core.base.var.StringVariable, com.tcf.ms.command.core.base.var.Variable, com.tcf.ms.command.core.base.var.Variable)
     * @return
     */
    void random();

    /**
     * 生成指定范围的随机数据
     * @param variable
     * @param lower 最小值（包含）
     * @param upper 最大值（不包含）
     * @return
     */
    void random(StringVariable variable, Variable lower, Variable upper);

}
