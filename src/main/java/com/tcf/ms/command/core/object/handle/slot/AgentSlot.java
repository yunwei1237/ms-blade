package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.*;

public class AgentSlot extends AbstractSlotOperation {
    private Agent agent;

    public AgentSlot(ScriptSpan scriptSpan, Agent agent) {
        super(scriptSpan);
        this.agent = agent;
    }

    @Override
    public <T> T get(String slotName, Class< ? extends CanVariable> clazz) {
        return getAny(slotName, agent,new AgentGetSlot(getObjVar(slotName), agent.getVar(),Variable.constant(slotName)),clazz);
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.set(slotName,value,new AgentSetSlot(agent.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new AgentSlotEq(agent.getVar(),Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new AgentSlotGe(agent.getVar(),Variable.constant(slotName),value.getVar());
    }
}
