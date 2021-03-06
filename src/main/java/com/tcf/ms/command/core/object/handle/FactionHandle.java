package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.object.handle.slot.FactionSlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;

public class FactionHandle implements CanVariable {

    private StringVariable variable;

    public StringVariable getVar() {
        return this.variable;
    }

    public void setVar(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new FactionSlot(this.variable);
    }
}
