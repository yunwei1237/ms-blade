package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class MapGetWaterPositionAroundPosition implements Operation ,Conditable{

    private Variable destPositionNo;
    private Variable sourcePositionNo;
    private Variable radius;

    public MapGetWaterPositionAroundPosition(Variable destPositionNo,Variable sourcePositionNo,Variable radius) {
        this.destPositionNo = destPositionNo;
        this.sourcePositionNo = sourcePositionNo;
        this.radius = radius;     
    }

    @Override
    public String toScriptString() {
        return String.format("(map_get_water_position_around_position,%s,%s,%s),",destPositionNo,sourcePositionNo,radius);
    }
}
