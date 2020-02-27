package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_faction_note_from_sreg,<faction_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
 */
public class AddFactionNoteFromSreg implements Operation{

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
