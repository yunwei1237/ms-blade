package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.base.Context;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.*;

public class QuestSlot extends AbstractSlotOperation {
    private StringVariable variable;

    public QuestSlot(StringVariable variable) {
        this.variable = variable;
        this.slots = Context.slots.get("quest");
    }

    @Override
    public OperationWithResult get(String slotName) {
        return getAny(slotName,new QuestGetSlot(getObjVar(slotName), this.variable,Variable.constant(slotName)));
    }

    @Override
    public Operation set(String slotName, CanVariable value) {
        return this.set(slotName,value,new QuestSetSlot(this.variable,Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new QuestSlotEq(this.variable,Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new QuestSlotGe(this.variable,Variable.constant(slotName),value.getVar());
    }
}
