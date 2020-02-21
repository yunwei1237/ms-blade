package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyRemovePrisoners implements Operation {

    

    public PartyRemovePrisoners() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_remove_prisoners),");
    }
}
