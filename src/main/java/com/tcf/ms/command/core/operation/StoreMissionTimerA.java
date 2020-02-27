package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_mission_timer_a,<destination>),
 */
public class StoreMissionTimerA implements Operation{

    private Variable destination;

    public StoreMissionTimerA(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_mission_timer_a,%s),",destination);
    }
}
