package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (scene_prop_get_instance,<destination>, <scene_prop_id>, <instance_no>),
 */
public class ScenePropGetInstance implements Operation{

    private Variable destination;
    private Variable scenePropId;
    private Variable instanceNo;

    public ScenePropGetInstance(Variable destination,Variable scenePropId,Variable instanceNo) {
        this.destination = destination;
        this.scenePropId = scenePropId;
        this.instanceNo = instanceNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_prop_get_instance,%s,%s,%s),",destination,scenePropId,instanceNo);
    }
}
