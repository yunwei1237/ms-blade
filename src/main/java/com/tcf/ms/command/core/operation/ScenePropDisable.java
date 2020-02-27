package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (scene_prop_disable,<scene_prop_id>),
 */
public class ScenePropDisable implements Operation{

    private Variable scenePropId;

    public ScenePropDisable(Variable scenePropId) {
        this.scenePropId = scenePropId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(scene_prop_disable,%s),",scenePropId);
    }
}
