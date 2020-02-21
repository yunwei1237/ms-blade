package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SetRain implements Operation {

    

    public SetRain() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(set_rain),");
    }
}
