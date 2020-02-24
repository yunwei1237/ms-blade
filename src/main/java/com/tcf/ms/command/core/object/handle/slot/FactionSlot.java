package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.FactionGetSlot;
import com.tcf.ms.command.core.operation.FactionSetSlot;
import com.tcf.ms.command.core.operation.FactionSlotEq;
import com.tcf.ms.command.core.operation.FactionSlotGe;

public class FactionSlot extends AbstractSlotOperation {
    private Faction faction;

    public FactionSlot(ScriptSpan scriptSpan, Faction faction) {
        super(scriptSpan);
        this.faction = faction;
    }

    @Override
    public <T> T get(String slotName, Class< ? extends CanVariable> clazz) {
        return getAny(slotName,faction,new FactionGetSlot(getObjVar(slotName),faction.getVar(),Variable.constant(slotName)),clazz);
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.set(slotName,value,new FactionSetSlot(faction.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new FactionSlotEq(faction.getVar(),Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new FactionSlotGe(faction.getVar(),Variable.constant(slotName),value.getVar());
    }
}
