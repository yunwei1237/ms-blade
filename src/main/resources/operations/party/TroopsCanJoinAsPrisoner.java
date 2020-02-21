package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopsCanJoinAsPrisoner implements Operation , Conditable {
    /**
     * 按键id
     */
    private Variable value;

    public TroopsCanJoinAsPrisoner(Variable value) {
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(troops_can_join_as_prisoner,%s),",value);
    }
}
