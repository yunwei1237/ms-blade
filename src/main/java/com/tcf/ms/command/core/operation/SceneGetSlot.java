package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (scene_get_slot,<destination>,<scene_id>,<slot_no>),
 */
public class SceneGetSlot implements Operation{

    private Variable destination;
    private Variable sceneId;
    private Variable slotNo;

    public SceneGetSlot(Variable destination,Variable sceneId,Variable slotNo) {
        this.destination = destination;
        this.sceneId = sceneId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_get_slot,%s,%s,%s),",destination,sceneId,slotNo);
    }
}
