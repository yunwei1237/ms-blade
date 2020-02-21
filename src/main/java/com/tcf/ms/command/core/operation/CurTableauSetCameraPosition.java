package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauSetCameraPosition implements Operation {

    private Variable positionNo;

    public CurTableauSetCameraPosition(Variable positionNo) {
        this.positionNo = positionNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_set_camera_position,%s),",positionNo);
    }
}
