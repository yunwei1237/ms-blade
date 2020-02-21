package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetSceneBoundaries implements Operation {

    private Variable positionMin;
    private Variable positionMax;

    public GetSceneBoundaries(Variable positionMin,Variable positionMax) {
        this.positionMin = positionMin;
        this.positionMax = positionMax;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_scene_boundaries,%s,%s),",positionMin,positionMax);
    }
}
