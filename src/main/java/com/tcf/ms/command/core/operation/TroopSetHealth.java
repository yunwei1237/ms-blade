package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TroopSetHealth implements Operation {

    

    public TroopSetHealth() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_health),");
    }
}
