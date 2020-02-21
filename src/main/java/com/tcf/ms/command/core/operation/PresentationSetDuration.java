package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PresentationSetDuration implements Operation {

    

    public PresentationSetDuration() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(presentation_set_duration),");
    }
}
