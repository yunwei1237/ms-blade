package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToPosition implements Operation {

    

    public OverlayAnimateToPosition() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_position),");
    }
}
