package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class InflictCasualtiesToPartyGroup implements Operation {

    

    public InflictCasualtiesToPartyGroup() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(inflict_casualties_to_party_group),");
    }
}
