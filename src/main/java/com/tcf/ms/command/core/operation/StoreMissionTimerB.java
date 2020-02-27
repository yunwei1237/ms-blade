package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_mission_timer_b,<destination>),
 */
public class StoreMissionTimerB implements Operation{

    private Variable destination;

    public StoreMissionTimerB(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_mission_timer_b,%s),",destination);
    }
}
