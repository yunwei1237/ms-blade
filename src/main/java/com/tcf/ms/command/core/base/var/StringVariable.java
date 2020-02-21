package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.command.var.StringVariableOperation;
import com.tcf.ms.command.core.command.var.StringVariableScript;
import lombok.Data;

/**
 * 字符串型变量
 */
public abstract class StringVariable extends Variable {

    /**
     * 用于保存变量名，不以与value同时存在
     */
    protected String varName;

    protected StringVariable(String varName) {
        this.varName = varName;
    }

    @Override
    public void setVar(StringVariable variable) {
        this.varName = variable.varName;
    }

    @Override
    public String toScriptString() {
        return String.format("%s",this.varName);
    }

    /**
     * 获得操作变量的对象
     * @return
     */
    public StringVariableOperation ops(){
        return new StringVariableScript(this);
    }
}
