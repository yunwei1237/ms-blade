package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.*;

public class TroopSlot extends AbstractSlotOperation {
    private Troop troop;

    public TroopSlot(ScriptSpan scriptSpan, Troop troop) {
        super(scriptSpan);
        this.troop = troop;
    }

    @Override
    public <T> T get(String slotName, Class< ? extends CanVariable> clazz) {
        return getAny(slotName, troop,new TroopGetSlot(getObjVar(slotName), troop.getVar(),Variable.constant(slotName)),clazz);
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.set(slotName,value,new TroopSetSlot(troop.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new TroopSlotEq(troop.getVar(),Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new TroopSlotGe(troop.getVar(),Variable.constant(slotName),value.getVar());
    }
}
