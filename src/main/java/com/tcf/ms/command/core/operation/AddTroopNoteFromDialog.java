package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_troop_note_from_dialog,<troop_id>,<note_slot_no>, <value>),  There are maximum of 8 slots. value = 1 -> shows when the note is added
 */
public class AddTroopNoteFromDialog implements Operation{

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
