package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_quest_note_from_dialog,<quest_id>,<note_slot_no>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
 */
public class AddQuestNoteFromDialog implements Operation{

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
