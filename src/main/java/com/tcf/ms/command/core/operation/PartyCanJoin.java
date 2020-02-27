package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (party_can_join),
 */
public class PartyCanJoin implements Conditable{

    

    public PartyCanJoin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_can_join),");
    }
}
