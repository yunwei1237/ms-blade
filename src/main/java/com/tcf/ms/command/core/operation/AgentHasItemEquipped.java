package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (agent_has_item_equipped,<agent_id>,<item_id>),
 */
public class AgentHasItemEquipped implements Conditable{

    private Variable agentId;
    private Variable itemId;

    public AgentHasItemEquipped(Variable agentId,Variable itemId) {
        this.agentId = agentId;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_has_item_equipped,%s,%s),",agentId,itemId);
    }
}
