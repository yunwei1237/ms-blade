package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyAttachToParty implements Operation {

    

    public PartyAttachToParty() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_attach_to_party),");
    }
}
