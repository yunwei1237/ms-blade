package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class AgentSlotEq implements Operation ,Conditable{

    private Variable agentId;
    private Variable slotNo;
    private Variable value;

    public AgentSlotEq(Variable agentId,Variable slotNo,Variable value) {
        this.agentId = agentId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_slot_eq,%s,%s,%s),",agentId,slotNo,value);
    }
}
