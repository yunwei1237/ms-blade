package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class LeaveEncounter implements Operation {

    

    public LeaveEncounter() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(leave_encounter),");
    }
}
