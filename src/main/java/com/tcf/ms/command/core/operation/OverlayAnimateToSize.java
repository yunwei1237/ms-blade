package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToSize implements Operation {

    

    public OverlayAnimateToSize() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_size),");
    }
}
