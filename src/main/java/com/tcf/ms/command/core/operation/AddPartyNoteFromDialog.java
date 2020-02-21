package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddPartyNoteFromDialog implements Operation {

    private Variable partyId;
    private Variable noteSlotNo;
    private Variable value;

    public AddPartyNoteFromDialog(Variable partyId,Variable noteSlotNo,Variable value) {
        this.partyId = partyId;
        this.noteSlotNo = noteSlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_party_note_from_dialog,%s,%s,%s),",partyId,noteSlotNo,value);
    }
}
