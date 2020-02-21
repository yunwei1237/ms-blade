package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyPrisonerStackGetTroopId implements Operation {

    

    public PartyPrisonerStackGetTroopId() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_prisoner_stack_get_troop_id),");
    }
}
