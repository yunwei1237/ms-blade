package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   x, y, z  (set_position_delta,<value>,<value>,<value>),
 */
public class SetPositionDelta implements Operation{

    private Variable value;
    private Variable value2;
    private Variable value3;

    public SetPositionDelta(Variable value,Variable value2,Variable value3) {
        this.value = value;
        this.value2 = value2;
        this.value3 = value3;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_position_delta,%s,%s,%s),",value,value2,value3);
    }
}
