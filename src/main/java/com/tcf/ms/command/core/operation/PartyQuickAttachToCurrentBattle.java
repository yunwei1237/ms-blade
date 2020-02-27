package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_quick_attach_to_current_battle, <party_id>, <side (0:players side, 1:enemy side)>),
 */
public class PartyQuickAttachToCurrentBattle implements Operation{

    private Variable partyId;
    private Variable side;

    public PartyQuickAttachToCurrentBattle(Variable partyId,Variable side) {
        this.partyId = partyId;
        this.side = side;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_quick_attach_to_current_battle,%s,%s),",partyId,side);
    }
}
