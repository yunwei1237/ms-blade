package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_fixed_point_multiplier, <value>),  sets the precision of the values that are named as value_fixed_point or destination_fixed_point.  Default is 1 (every fixed point value will be regarded as an integer)
 */
public class SetFixedPointMultiplier implements Operation{

    private Variable value;

    public SetFixedPointMultiplier(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_fixed_point_multiplier,%s),",value);
    }
}
