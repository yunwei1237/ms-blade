package com.tcf.ms.command.core.base.var;

/**
 * 局部变量
 */
public class LocalVariable extends StringVariable {

    public LocalVariable(String name) {
        super(name);
    }

    @Override
    public String toScriptString() {
        return String.format("\":%s\"",varName);
    }
}
