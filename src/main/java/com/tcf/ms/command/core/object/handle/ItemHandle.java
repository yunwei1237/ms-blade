package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.object.handle.slot.ItemSlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ItemHandle implements CanVariable {

    private StringVariable variable;

    public StringVariable getVar() {
        return this.variable;
    }

    public void setVar(StringVariable variable) {
        this.variable = variable;
    }

    public ItemHandle(StringVariable variable) {
        this.variable = variable;
    }

    public ItemHandle(Item item) {
        this.variable = item.getVar();
    }

    public SlotOperation slot(){
        return new ItemSlot(this.variable);
    }
}
