package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyQuickAttachToCurrentBattle implements Operation {

    

    public PartyQuickAttachToCurrentBattle() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_quick_attach_to_current_battle),");
    }
}
