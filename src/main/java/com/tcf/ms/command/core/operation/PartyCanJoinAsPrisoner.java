package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (party_can_join_as_prisoner),
 */
public class PartyCanJoinAsPrisoner implements Conditable{

    

    public PartyCanJoinAsPrisoner() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_can_join_as_prisoner),");
    }
}
