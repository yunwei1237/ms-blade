package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (party_is_in_town,<party_id_1>,<party_id_2>),
 */
public class PartyIsInTown implements Conditable{

    private Variable partyId1;
    private Variable partyId2;

    public PartyIsInTown(Variable partyId1,Variable partyId2) {
        this.partyId1 = partyId1;
        this.partyId2 = partyId2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_is_in_town,%s,%s),",partyId1,partyId2);
    }
}
