package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 
 */
public class SetActiveTroop implements Operation{

    

    public SetActiveTroop() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(set_active_troop),");
    }
}
