package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartySetExtraText implements Operation {

    

    public PartySetExtraText() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_extra_text),");
    }
}