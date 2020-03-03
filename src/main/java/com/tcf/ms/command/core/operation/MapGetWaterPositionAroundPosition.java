package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (map_get_water_position_around_position,<dest_position_no>,<source_position_no>,<radius>),
 */
public class MapGetWaterPositionAroundPosition implements Conditable{

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
