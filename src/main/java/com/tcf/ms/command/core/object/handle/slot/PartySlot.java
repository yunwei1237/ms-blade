package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.operation.*;

public class PartySlot extends AbstractSlotOperation {
    private Party party;

    public PartySlot(ScriptSpan scriptSpan, Party party) {
        super(scriptSpan);
        this.party = party;
    }

    @Override
    public <T> T get(String slotName, Class< ? extends CanVariable> clazz) {
        return getAny(slotName, party,new PartyGetSlot(getObjVar(slotName), party.getVar(),Variable.constant(slotName)),clazz);
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.set(slotName,value,new PartySetSlot(party.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new PartySlotEq(party.getVar(),Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new PartySlotGe(party.getVar(),Variable.constant(slotName),value.getVar());
    }
}
