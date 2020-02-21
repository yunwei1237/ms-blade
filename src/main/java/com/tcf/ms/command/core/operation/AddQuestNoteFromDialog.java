package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddQuestNoteFromDialog implements Operation {

    private Variable questId;
    private Variable noteSlotNo;
    private Variable value;

    public AddQuestNoteFromDialog(Variable questId,Variable noteSlotNo,Variable value) {
        this.questId = questId;
        this.noteSlotNo = noteSlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_quest_note_from_dialog,%s,%s,%s),",questId,noteSlotNo,value);
    }
}
