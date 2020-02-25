package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.object.handle.slot.PartySlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;

public class AgentHandle implements CanVariable {

    private StringVariable variable;

    public StringVariable getVar() {
        return this.variable;
    }

    public void setVar(StringVariable variable) {
        this.variable = variable;
    }

    public AgentHandle(StringVariable variable) {
        this.variable = variable;
    }

    public AgentHandle(Agent agent) {
        this.variable = agent.getVar();
    }

    public SlotOperation slot(){
        return new AgentSlot(this.variable);
    }
}
