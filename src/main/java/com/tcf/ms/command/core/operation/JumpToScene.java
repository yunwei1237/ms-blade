package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class JumpToScene implements Operation {

    private Variable sceneId;
    private Variable entryNo;

    public JumpToScene(Variable sceneId,Variable entryNo) {
        this.sceneId = sceneId;
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(jump_to_scene,%s,%s),",sceneId,entryNo);
    }
}
