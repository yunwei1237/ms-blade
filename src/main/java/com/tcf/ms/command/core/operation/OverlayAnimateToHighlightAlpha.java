package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class OverlayAnimateToHighlightAlpha implements Operation {

    

    public OverlayAnimateToHighlightAlpha() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_highlight_alpha),");
    }
}
