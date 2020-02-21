package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToAlpha implements Operation {

    

    public OverlayAnimateToAlpha() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_alpha),");
    }
}
