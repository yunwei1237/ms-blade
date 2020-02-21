package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AgentPlaySound implements Operation {

    private Variable agentId;
    private Variable soundId;

    public AgentPlaySound(Variable agentId,Variable soundId) {
        this.agentId = agentId;
        this.soundId = soundId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(agent_play_sound,%s,%s),",agentId,soundId);
    }
}
