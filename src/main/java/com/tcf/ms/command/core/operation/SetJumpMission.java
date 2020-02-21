package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetJumpMission implements Operation {

    private Variable missionTemplateId;

    public SetJumpMission(Variable missionTemplateId) {
        this.missionTemplateId = missionTemplateId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_jump_mission,%s),",missionTemplateId);
    }
}
