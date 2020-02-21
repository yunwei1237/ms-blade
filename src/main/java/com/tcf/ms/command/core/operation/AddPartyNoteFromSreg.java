package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddPartyNoteFromSreg implements Operation {

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
