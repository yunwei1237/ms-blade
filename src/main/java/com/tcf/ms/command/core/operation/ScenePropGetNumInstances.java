package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (scene_prop_get_num_instances,<destination>, <scene_prop_id>),
 */
public class ScenePropGetNumInstances implements Operation{

    private Variable destination;
    private Variable scenePropId;

    public ScenePropGetNumInstances(Variable destination,Variable scenePropId) {
        this.destination = destination;
        this.scenePropId = scenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_prop_get_num_instances,%s,%s),",destination,scenePropId);
    }
}
