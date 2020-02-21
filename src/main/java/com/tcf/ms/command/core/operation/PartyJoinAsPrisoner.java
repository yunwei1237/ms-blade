package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyJoinAsPrisoner implements Operation {

    

    public PartyJoinAsPrisoner() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_join_as_prisoner),");
    }
}
