package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddFactionNoteFromSreg implements Operation {

    private Variable factionId;
    private Variable noteSlotNo;
    private Variable stringId;
    private Variable value;

    public AddFactionNoteFromSreg(Variable factionId,Variable noteSlotNo,Variable stringId,Variable value) {
        this.factionId = factionId;
        this.noteSlotNo = noteSlotNo;
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_faction_note_from_sreg,%s,%s,%s,%s),",factionId,noteSlotNo,stringId,value);
    }
}
