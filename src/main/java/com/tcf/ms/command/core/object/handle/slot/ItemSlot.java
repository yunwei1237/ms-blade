package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.Context;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.operation.*;

public class ItemSlot extends AbstractSlotOperation {
    private StringVariable variable;

    public ItemSlot(StringVariable variable) {
        this.variable = variable;
        this.slots = Context.slots.get("item");
    }

    @Override
    public OperationWithResult get(String slotName) {
        return getAny(slotName,new ItemGetSlot(getObjVar(slotName), this.variable,Variable.constant(slotName)));
    }

    @Override
    public Operation set(String slotName, CanVariable value) {
        return this.set(slotName,value,new ItemSetSlot(this.variable,Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new ItemSlotEq(this.variable,Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new ItemSlotGe(this.variable,Variable.constant(slotName),value.getVar());
    }
}
