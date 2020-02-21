package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class FactionSetColor implements Operation {

    private Variable factionId;
    private Variable value;

    public FactionSetColor(Variable factionId,Variable value) {
        this.factionId = factionId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_set_color,%s,%s),",factionId,value);
    }
}
