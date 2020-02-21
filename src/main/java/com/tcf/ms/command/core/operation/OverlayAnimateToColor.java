package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToColor implements Operation {

    

    public OverlayAnimateToColor() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_color),");
    }
}
