package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (replace_scene_props, <old_scene_prop_id>,<new_scene_prop_id>), ---------------------------  Mission Consequence types ---------------------------
 */
public class ReplaceSceneProps implements Operation{

    private Variable oldScenePropId;
    private Variable newScenePropId;

    public ReplaceSceneProps(Variable oldScenePropId,Variable newScenePropId) {
        this.oldScenePropId = oldScenePropId;
        this.newScenePropId = newScenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(replace_scene_props,%s,%s),",oldScenePropId,newScenePropId);
    }
}
