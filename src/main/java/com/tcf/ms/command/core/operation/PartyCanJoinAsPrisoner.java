package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class PartyCanJoinAsPrisoner implements Operation ,Conditable{

    

    public PartyCanJoinAsPrisoner() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_can_join_as_prisoner),");
    }
}
