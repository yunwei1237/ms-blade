package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToHighlightColor implements Operation {

    

    public OverlayAnimateToHighlightColor() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_highlight_color),");
    }
}
