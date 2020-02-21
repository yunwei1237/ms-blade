package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import lombok.Data;

import java.util.Objects;

/**
 * 用于代表一个变量
 */

@Data
public abstract class Variable implements Operation, CanVariable {

    @Override
    public String toString() {
        return toScriptString();
    }

    @Override
    public Variable getVar() {
        return this;
    }

    /**
     * 代表一个数字型的常量
     * @param number
     * @return
     */
    public static NumberVariable number(int number){
        return  new NumberVariable(number);
    }

    /**
     * 本地变量，以字符串形式存在
     * @param varName
     * @return
     */
    public static LocalVariable local(String varName){
        return  new LocalVariable(varName);
    }

    /**
     * 全局变量，以字符串形式存在
     * @param varName
     * @return
     */
    public static GlobalVariable global(String varName){
        return  new GlobalVariable(varName);
    }

    /**
     * 常量，以字符串形式存在
     * @param varName
     * @return
     */
    public static ConstantVariable constant(String varName){
        return  new ConstantVariable(varName);
    }
}
