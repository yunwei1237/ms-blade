package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.base.BladeException;

import java.util.List;

/**
 * 代表text变量
 */
public class TextVariable extends Variable {
    private String str;
    private Variable[] variables;

    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("字符串变量不能被赋值");
    }

    public TextVariable(String str,Variable ...variables) {
        this.str = str;
        this.variables = variables;
    }

    @Override
    public String toScriptString() {
        return String.format(this.str,this.variables);
    }
}
