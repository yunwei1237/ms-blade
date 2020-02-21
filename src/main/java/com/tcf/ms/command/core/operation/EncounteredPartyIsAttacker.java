package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class EncounteredPartyIsAttacker implements Operation ,Conditable{

    

    public EncounteredPartyIsAttacker() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(encountered_party_is_attacker),");
    }
}
