package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.Context;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.*;

public class TroopSlot extends AbstractSlotOperation {
    private StringVariable variable;

    public TroopSlot(StringVariable variable) {
        this.variable = variable;
        this.slots = Context.slots.get("troop");
    }

    @Override
    public OperationWithResult get(String slotName) {
        return getAny(slotName,new TroopGetSlot(getObjVar(slotName), this.variable,Variable.constant(slotName)));
    }

    @Override
    public Operation set(String slotName, CanVariable value) {
        return this.set(slotName,value,new TroopSetSlot(this.variable,Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new TroopSlotEq(this.variable,Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new TroopSlotGe(this.variable,Variable.constant(slotName),value.getVar());
    }
}
