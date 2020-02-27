package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_party_creation_random_limits, <min_value>, <max_value>), (values should be between 0, 100)
 */
public class SetPartyCreationRandomLimits implements Operation{

    private Variable minValue;
    private Variable maxValue;

    public SetPartyCreationRandomLimits(Variable minValue,Variable maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_party_creation_random_limits,%s,%s),",minValue,maxValue);
    }
}
