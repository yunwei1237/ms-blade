package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.command.var.StringVariableOperation;
import com.tcf.ms.command.core.command.var.StringVariableScript;

/**
 * 数字型变量
 */
public class NumberVariable extends Variable {
    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("数字型变量无法替换值");
    }

    /**
     * 用于保存变量的字面量，不以与name同时存在
     */
    protected Integer number;

    public NumberVariable(int number) {
        this.number = number;
    }

    @Override
    public String toScriptString() {
        return String.format("%s",number);
    }

}
