package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.object.handle.slot.SceneSlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;

public class SceneHandle implements CanVariable {

    private StringVariable variable;

    public SceneHandle(StringVariable variable) {
        this.variable = variable;
    }

    @Override
    public StringVariable getVar() {
        return null;
    }

    @Override
    public void setVar(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new SceneSlot(this.variable);
    }
}
