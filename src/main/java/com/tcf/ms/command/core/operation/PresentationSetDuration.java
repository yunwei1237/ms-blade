package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (presentation_set_duration, <duration-in-1/100-seconds>),  there must be an active presentation
 */
public class PresentationSetDuration implements Operation{

    private Variable duration;

    public PresentationSetDuration(Variable duration) {
        this.duration = duration;     
    }

    @Override
    public String toScriptString() {
        return String.format("(presentation_set_duration,%s),",duration);
    }
}
