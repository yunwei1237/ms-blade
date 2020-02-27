package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_show_messages,<value>),  0 disables window messages 1 re-enables them.
 */
public class SetShowMessages implements Operation{

    private Variable value;

    public SetShowMessages(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_show_messages,%s),",value);
    }
}
