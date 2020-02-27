package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_progress_overlay, <destination>, <min_value>, <max_value>),  returns overlay id
 */
public class CreateProgressOverlay implements Operation{

    private Variable destination;
    private Variable minValue;
    private Variable maxValue;

    public CreateProgressOverlay(Variable destination,Variable minValue,Variable maxValue) {
        this.destination = destination;
        this.minValue = minValue;
        this.maxValue = maxValue;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_progress_overlay,%s,%s,%s),",destination,minValue,maxValue);
    }
}
