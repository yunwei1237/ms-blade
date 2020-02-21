package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SceneGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 兵种
     */
    private Variable sceneId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public SceneGetSlot(Variable destination, Variable sceneId, Variable slotNo) {
        this.destination = destination;
        this.sceneId = sceneId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_get_slot,%s,%s,%s),",destination,sceneId,slotNo);
    }
}
