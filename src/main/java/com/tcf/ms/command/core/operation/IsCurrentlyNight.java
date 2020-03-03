package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (is_currently_night),
 */
public class IsCurrentlyNight implements Conditable{

    

    public IsCurrentlyNight() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(is_currently_night),");
    }
}
