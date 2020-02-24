package com.tcf.ms.command.core.object.handle.slot;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.object.Quest;
import com.tcf.ms.command.core.operation.*;

public class QuestSlot extends AbstractSlotOperation {
    private Quest quest;

    public QuestSlot(ScriptSpan scriptSpan, Quest quest) {
        super(scriptSpan);
        this.quest = quest;
    }

    @Override
    public <T> T get(String slotName, Class< ? extends CanVariable> clazz) {
        return getAny(slotName, quest,new QuestGetSlot(getObjVar(slotName), quest.getVar(),Variable.constant(slotName)),clazz);
    }

    @Override
    public void set(String slotName, CanVariable value) {
        this.set(slotName,value,new QuestSetSlot(quest.getVar(),Variable.constant(slotName),value.getVar()));
    }

    @Override
    public Conditable eq(String slotName, CanVariable value) {
        return new QuestSlotEq(quest.getVar(),Variable.constant(slotName),value.getVar());
    }

    @Override
    public Conditable ge(String slotName, CanVariable value) {
        return new QuestSlotGe(quest.getVar(),Variable.constant(slotName),value.getVar());
    }
}
