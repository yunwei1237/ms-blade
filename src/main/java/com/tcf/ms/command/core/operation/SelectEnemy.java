package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (select_enemy,<value>),
 */
public class SelectEnemy implements Operation{

    private Variable value;

    public SelectEnemy(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(select_enemy,%s),",value);
    }
}
