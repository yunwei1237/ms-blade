package com.tcf.ms.command.core.operations.slot.eq;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class SceneSlotEq implements Operation , Conditable {
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

    public SceneSlotEq(Variable sceneId, Variable slotNo, Variable value) {
        this.sceneId = sceneId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_slot_eq,%s,%s,%s),",sceneId,slotNo,value);
    }
}
