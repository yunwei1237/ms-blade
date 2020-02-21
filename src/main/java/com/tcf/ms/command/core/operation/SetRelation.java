package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetRelation implements Operation {

    private Variable factionId;
    private Variable factionId2;
    private Variable value;

    public SetRelation(Variable factionId,Variable factionId2,Variable value) {
        this.factionId = factionId;
        this.factionId2 = factionId2;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_relation,%s,%s,%s),",factionId,factionId2,value);
    }
}
