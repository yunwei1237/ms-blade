package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauSetCameraParameters implements Operation {

    private Variable isPerspective;
    private Variable cameraWidthTimes1000;
    private Variable cameraHeightTimes1000;
    private Variable cameraNearTimes1000;
    private Variable cameraFarTimes1000;

    public CurTableauSetCameraParameters(Variable isPerspective,Variable cameraWidthTimes1000,Variable cameraHeightTimes1000,Variable cameraNearTimes1000,Variable cameraFarTimes1000) {
        this.isPerspective = isPerspective;
        this.cameraWidthTimes1000 = cameraWidthTimes1000;
        this.cameraHeightTimes1000 = cameraHeightTimes1000;
        this.cameraNearTimes1000 = cameraNearTimes1000;
        this.cameraFarTimes1000 = cameraFarTimes1000;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_set_camera_parameters,%s,%s,%s,%s,%s),",isPerspective,cameraWidthTimes1000,cameraHeightTimes1000,cameraNearTimes1000,cameraFarTimes1000);
    }
}
