package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class SceneSlotGe implements Operation ,Conditable{

    private Variable sceneId;
    private Variable slotNo;
    private Variable value;

    public SceneSlotGe(Variable sceneId,Variable slotNo,Variable value) {
        this.sceneId = sceneId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_slot_ge,%s,%s,%s),",sceneId,slotNo,value);
    }
}
