package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_get_slot,<destination>,<agent_id>,<slot_no>),
 */
public class AgentGetSlot implements Operation{

    private Variable destination;
    private Variable agentId;
    private Variable slotNo;

    public AgentGetSlot(Variable destination,Variable agentId,Variable slotNo) {
        this.destination = destination;
        this.agentId = agentId;
        this.slotNo = slotNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_slot,%s,%s,%s),",destination,agentId,slotNo);
    }
}
