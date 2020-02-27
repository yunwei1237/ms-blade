package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (troops_can_join,<value>),
 */
public class TroopsCanJoin implements Conditable{

    private Variable value;

    public TroopsCanJoin(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troops_can_join,%s),",value);
    }
}
