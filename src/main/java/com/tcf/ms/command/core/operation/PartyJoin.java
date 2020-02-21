package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyJoin implements Operation {

    

    public PartyJoin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_join),");
    }
}
