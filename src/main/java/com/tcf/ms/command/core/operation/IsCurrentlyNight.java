package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class IsCurrentlyNight implements Operation ,Conditable{

    

    public IsCurrentlyNight() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(is_currently_night),");
    }
}
