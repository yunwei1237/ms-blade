package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (agent_set_slot,<agent_id>,<slot_no>,<value>),
 */
public class AgentSetSlot implements Operation{

    private Variable agentId;
    private Variable slotNo;
    private Variable value;

    public AgentSetSlot(Variable agentId,Variable slotNo,Variable value) {
        this.agentId = agentId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_slot,%s,%s,%s),",agentId,slotNo,value);
    }
}
