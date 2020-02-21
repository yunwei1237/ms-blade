package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.FactionGetSlot;
import com.tcf.ms.command.core.operation.FactionSetSlot;

public class FactionSlot extends AbstractSlotOperation {
    private Faction faction;

    public FactionSlot(ScriptSpan scriptSpan, Faction faction) {
        super(scriptSpan);
        this.faction = faction;
    }

    @Override
    public <T> T get(String slotName, Class< T extends CanVariable> clazz) {
        Slot slot = this.checkAndGetSlot(slotName);
        //获得值
        StringVariable variable = Variable.local("faction_var");
        //阵营
        Variable factionId = faction.getVar();
        //slot名称
        Variable slotNameVar = Variable.constant(slotName);
        this.scriptSpan.out(new FactionGetSlot(variable,factionId,slotNameVar));

        CanVariable canVariable = null;
        try {
            canVariable = (CanVariable) clazz.newInstance();
            canVariable.setVar(variable);
            return (T)slot.getSlotObj();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.checkAndGetSlot(slotName);
        this.setSlot(slotName,value);
        scriptSpan.out(new FactionSetSlot(faction.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return null;
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return null;
    }
}
