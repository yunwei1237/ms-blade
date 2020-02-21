package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TroopRaiseProficiencyLinear implements Operation {

    

    public TroopRaiseProficiencyLinear() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_raise_proficiency_linear),");
    }
}
