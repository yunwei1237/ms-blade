package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (map_get_random_position_around_position,<dest_position_no>,<source_position_no>,<radius>),
 */
public class MapGetRandomPositionAroundPosition implements Operation{

    private Variable destPositionNo;
    private Variable sourcePositionNo;
    private Variable radius;

    public MapGetRandomPositionAroundPosition(Variable destPositionNo,Variable sourcePositionNo,Variable radius) {
        this.destPositionNo = destPositionNo;
        this.sourcePositionNo = sourcePositionNo;
        this.radius = radius;     
    }

    @Override
    public String toScriptString() {
        return String.format("(map_get_random_position_around_position,%s,%s,%s),",destPositionNo,sourcePositionNo,radius);
    }
}
