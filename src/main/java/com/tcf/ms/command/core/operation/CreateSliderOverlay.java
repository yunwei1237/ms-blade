package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (create_slider_overlay, <destination>, <min_value>, <max_value>),  returns overlay id
 */
public class CreateSliderOverlay implements Operation{

    private Variable destination;
    private Variable minValue;
    private Variable maxValue;

    public CreateSliderOverlay(Variable destination,Variable minValue,Variable maxValue) {
        this.destination = destination;
        this.minValue = minValue;
        this.maxValue = maxValue;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_slider_overlay,%s,%s,%s),",destination,minValue,maxValue);
    }
}
