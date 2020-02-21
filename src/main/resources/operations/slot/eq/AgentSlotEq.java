package com.tcf.ms.command.core.operations.slot.eq;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentSlotEq implements Operation, Conditable {
    /**
     * 阵营
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

    public AgentSlotEq(Variable agentId, Variable slotNo, Variable value) {
        this.agentId = agentId;
        this.slotNo = slotNo;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_slot_eq,%s,%s,%s),",agentId,slotNo,value);
    }
}
