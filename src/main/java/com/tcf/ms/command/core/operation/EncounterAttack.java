package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class EncounterAttack implements Operation {

    

    public EncounterAttack() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(encounter_attack),");
    }
}
