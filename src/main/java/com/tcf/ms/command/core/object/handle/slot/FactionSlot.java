package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.base.Context;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.FactionGetSlot;
import com.tcf.ms.command.core.operation.FactionSetSlot;
import com.tcf.ms.command.core.operation.FactionSlotEq;
import com.tcf.ms.command.core.operation.FactionSlotGe;

public class FactionSlot extends AbstractSlotOperation {
    private StringVariable variable;

    public FactionSlot(StringVariable variable) {
        this.variable = variable;
        this.slots = Context.slots.get("faction");
    }

    @Override
    public OperationWithResult get(String slotName) {
        return getAny(slotName,new FactionGetSlot(getObjVar(slotName),this.variable,Variable.constant(slotName)));
    }

    @Override
    public Operation set(String slotName, CanVariable value) {
        return this.set(slotName,value,new FactionSetSlot(this.variable,Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new FactionSlotEq(this.variable,Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new FactionSlotGe(this.variable,Variable.constant(slotName),value.getVar());
    }
}
