package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (encountered_party_is_attacker),
 */
public class EncounteredPartyIsAttacker implements Conditable{

    

    public EncounteredPartyIsAttacker() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(encountered_party_is_attacker),");
    }
}
