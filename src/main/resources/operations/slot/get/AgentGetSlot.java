package com.tcf.ms.command.core.operations.slot.get;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentGetSlot implements Operation {
    /**
     * 变量
     */
    private Variable destination;
    /**
     * 兵种
     */
    private Variable agentId;
    /**
     * slot编号
     */
    private Variable slotNo;


    public AgentGetSlot(Variable destination, Variable agentId, Variable slotNo) {
        this.destination = destination;
        this.agentId = agentId;
        this.slotNo = slotNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_get_slot,%s,%s,%s),",destination,agentId,slotNo);
    }
}
