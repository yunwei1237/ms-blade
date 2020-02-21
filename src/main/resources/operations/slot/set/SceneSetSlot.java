package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SceneSetSlot implements Operation {
    /**
     * 场景
     */
    private Variable sceneId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public SceneSetSlot(Variable sceneId, Variable slotNo, Variable value) {
        this.sceneId = sceneId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_set_slot,%s,%s,%s),",sceneId,slotNo,value);
    }
}
