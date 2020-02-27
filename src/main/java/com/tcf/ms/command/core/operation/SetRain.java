package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_rain,<rain-type>,<strength>), (rain_type: 1= rain, 2=snow ; strength: 0 - 100)
 */
public class SetRain implements Operation{

    private Variable rain;
    private Variable strength;

    public SetRain(Variable rain,Variable strength) {
        this.rain = rain;
        this.strength = strength;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_rain,%s,%s),",rain,strength);
    }
}
