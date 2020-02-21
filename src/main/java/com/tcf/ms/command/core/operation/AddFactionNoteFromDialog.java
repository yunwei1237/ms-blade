package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddFactionNoteFromDialog implements Operation {

    private Variable factionId;
    private Variable noteSlotNo;
    private Variable value;

    public AddFactionNoteFromDialog(Variable factionId,Variable noteSlotNo,Variable value) {
        this.factionId = factionId;
        this.noteSlotNo = noteSlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_faction_note_from_dialog,%s,%s,%s),",factionId,noteSlotNo,value);
    }
}
