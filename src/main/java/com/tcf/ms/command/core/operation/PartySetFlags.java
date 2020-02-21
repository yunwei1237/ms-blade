package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartySetFlags implements Operation {

    

    public PartySetFlags() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_flags),");
    }
}
