package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.command.var.StringVariableOperation;
import com.tcf.ms.command.core.command.var.StringVariableScript;

/**
 * 数字型变量
 */
public class NumberVariable extends Variable {

    /**
     * 用于保存变量的字面量，不以与name同时存在
     */
    private Integer number;

    public NumberVariable(int number) {
        this.number = number;
    }

    @Override
    public String toScriptString() {
        return String.format("%s",number);
    }

}
