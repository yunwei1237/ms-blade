package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (spawn_horse,<item_kind_id>, <item_modifier>)  (stores agent_id in reg0)   spawn_scene_prop                       = 11304      (spawn_scene_prop, <scene_prop_id>)  (stores prop_instance_id in reg0) not yet.
 */
public class SpawnHorse implements Operation{

    private Variable itemKindId;
    private Variable itemModifier;

    public SpawnHorse(Variable itemKindId,Variable itemModifier) {
        this.itemKindId = itemKindId;
        this.itemModifier = itemModifier;     
    }

    @Override
    public String toScriptString() {
        return String.format("(spawn_horse,%s,%s),",itemKindId,itemModifier);
    }
}
