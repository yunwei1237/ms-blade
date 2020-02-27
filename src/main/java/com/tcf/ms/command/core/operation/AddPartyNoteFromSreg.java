package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_party_note_from_sreg,<party_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
 */
public class AddPartyNoteFromSreg implements Operation{

    private Variable partyId;
    private Variable noteSlotNo;
    private Variable stringId;
    private Variable value;

    public AddPartyNoteFromSreg(Variable partyId,Variable noteSlotNo,Variable stringId,Variable value) {
        this.partyId = partyId;
        this.noteSlotNo = noteSlotNo;
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_party_note_from_sreg,%s,%s,%s,%s),",partyId,noteSlotNo,stringId,value);
    }
}
