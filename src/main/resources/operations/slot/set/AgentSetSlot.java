package com.tcf.ms.command.core.operations.slot.set;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSetSlot implements Operation {
    /**
     * 场景中的人员
     */
    private Variable agentId;
    /**
     * slot编号
     */
    private Variable slotNo;
    /**
     * 值
     */
    private Variable value;

    public AgentSetSlot(Variable agentId, Variable slotNo, Variable value) {
        this.agentId = agentId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_set_slot,%s,%s,%s),",agentId,slotNo,value);
    }
}
