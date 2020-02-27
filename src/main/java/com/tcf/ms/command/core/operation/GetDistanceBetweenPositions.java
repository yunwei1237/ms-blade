package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   gets distance in centimeters.  (get_distance_between_positions,<destination>,<position_no_1>,<position_no_2>),
 */
public class GetDistanceBetweenPositions implements Operation{

    private Variable destination;
    private Variable positionNo1;
    private Variable positionNo2;

    public GetDistanceBetweenPositions(Variable destination,Variable positionNo1,Variable positionNo2) {
        this.destination = destination;
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_distance_between_positions,%s,%s,%s),",destination,positionNo1,positionNo2);
    }
}
