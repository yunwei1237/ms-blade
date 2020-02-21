package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyPrisonerStackGetSize implements Operation {

    

    public PartyPrisonerStackGetSize() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_prisoner_stack_get_size),");
    }
}
