package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddTroopNoteFromDialog implements Operation {

    private Variable troopId;
    private Variable noteSlotNo;
    private Variable value;

    public AddTroopNoteFromDialog(Variable troopId,Variable noteSlotNo,Variable value) {
        this.troopId = troopId;
        this.noteSlotNo = noteSlotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_troop_note_from_dialog,%s,%s,%s),",troopId,noteSlotNo,value);
    }
}
