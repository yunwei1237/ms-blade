package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.base.Context;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.*;

public class PartyTemplateSlot extends AbstractSlotOperation {
    private StringVariable variable;

    public PartyTemplateSlot(StringVariable variable) {
        this.variable = variable;
        this.slots = Context.slots.get("partyTemplate");
    }

    @Override
    public OperationWithResult get(String slotName) {
        return getAny(slotName,new PartyTemplateGetSlot(getObjVar(slotName), this.variable,Variable.constant(slotName)));
    }

    @Override
    public Operation set(String slotName, CanVariable value) {
        return this.set(slotName,value,new PartyTemplateSetSlot(this.variable,Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new PartyTemplateSlotEq(this.variable,Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new PartyTemplateSlotGe(this.variable,Variable.constant(slotName),value.getVar());
    }
}
