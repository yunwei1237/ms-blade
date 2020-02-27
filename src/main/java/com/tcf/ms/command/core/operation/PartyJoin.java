package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_join),
 */
public class PartyJoin implements Operation{

    

    public PartyJoin() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_join),");
    }
}
