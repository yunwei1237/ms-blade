package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class PartyCanJoin implements Operation ,Conditable{

    

    public PartyCanJoin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_can_join),");
    }
}
