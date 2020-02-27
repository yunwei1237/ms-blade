package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (leave_encounter),
 */
public class LeaveEncounter implements Operation{

    

    public LeaveEncounter() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(leave_encounter),");
    }
}
