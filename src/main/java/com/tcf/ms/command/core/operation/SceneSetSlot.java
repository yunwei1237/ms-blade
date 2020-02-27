package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (scene_set_slot,<scene_id>,<slot_no>,<value>),
 */
public class SceneSetSlot implements Operation{

    private Variable sceneId;
    private Variable slotNo;
    private Variable value;

    public SceneSetSlot(Variable sceneId,Variable slotNo,Variable value) {
        this.sceneId = sceneId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_set_slot,%s,%s,%s),",sceneId,slotNo,value);
    }
}
