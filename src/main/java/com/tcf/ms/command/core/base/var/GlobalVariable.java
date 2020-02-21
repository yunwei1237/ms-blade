package com.tcf.ms.command.core.base.var;

/**
 * 全局变量
 */
public class GlobalVariable extends StringVariable {

    public GlobalVariable(String name) {
        super(name);
    }

    @Override
    public String toScriptString() {
        return String.format("\"$%s\"",varName);
    }
}
