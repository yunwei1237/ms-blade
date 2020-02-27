package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (end_current_battle),
 */
public class EndCurrentBattle implements Operation{

    

    public EndCurrentBattle() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(end_current_battle),");
    }
}
