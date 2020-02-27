package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (faction_set_name, <faction_id>, <string_id>),
 */
public class FactionSetName implements Operation{

    private Variable factionId;
    private Variable stringId;

    public FactionSetName(Variable factionId,Variable stringId) {
        this.factionId = factionId;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(faction_set_name,%s,%s),",factionId,stringId);
    }
}
