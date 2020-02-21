package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddQuestNoteFromSreg implements Operation {

    private Variable questId;
    private Variable noteSlotNo;
    private Variable stringId;
    private Variable value;

    public AddQuestNoteFromSreg(Variable questId,Variable noteSlotNo,Variable stringId,Variable value) {
        this.questId = questId;
        this.noteSlotNo = noteSlotNo;
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_quest_note_from_sreg,%s,%s,%s,%s),",questId,noteSlotNo,stringId,value);
    }
}
