package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_icon, <party_id>, <map_icon_id>),
 */
public class PartySetIcon implements Operation{

    private Variable partyId;
    private Variable mapIconId;

    public PartySetIcon(Variable partyId,Variable mapIconId) {
        this.partyId = partyId;
        this.mapIconId = mapIconId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_icon,%s,%s),",partyId,mapIconId);
    }
}
