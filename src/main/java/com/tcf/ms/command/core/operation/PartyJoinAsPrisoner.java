package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_join_as_prisoner),
 */
public class PartyJoinAsPrisoner implements Operation{

    

    public PartyJoinAsPrisoner() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_join_as_prisoner),");
    }
}
