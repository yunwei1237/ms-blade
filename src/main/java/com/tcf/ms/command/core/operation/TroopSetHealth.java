package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_health,<troop_id>,<relative health (0-100)>),
 */
public class TroopSetHealth implements Operation{

    

    public TroopSetHealth() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_health),");
    }
}
