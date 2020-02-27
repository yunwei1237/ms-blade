package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (modify_visitors_at_site,<scene_id>),
 */
public class ModifyVisitorsAtSite implements Operation{

    private Variable sceneId;

    public ModifyVisitorsAtSite(Variable sceneId) {
        this.sceneId = sceneId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(modify_visitors_at_site,%s),",sceneId);
    }
}
