package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyAddLeader implements Operation {

    

    public PartyAddLeader() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_add_leader),");
    }
}
