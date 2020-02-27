package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_fog_distance, <distance_in_meters>, [fog_color]),
 */
public class SetFogDistance implements Operation{

    private Variable distanceInMeters;
    private Variable fogColor;

    public SetFogDistance(Variable distanceInMeters,Variable fogColor) {
        this.distanceInMeters = distanceInMeters;
        this.fogColor = fogColor;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_fog_distance,%s,%s),",distanceInMeters,fogColor);
    }
}
