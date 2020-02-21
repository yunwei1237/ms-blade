package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddTroopNoteFromSreg implements Operation {

    private Variable troopId;
    private Variable noteSlotNo;
    private Variable stringId;
    private Variable value;

    public AddTroopNoteFromSreg(Variable troopId,Variable noteSlotNo,Variable stringId,Variable value) {
        this.troopId = troopId;
        this.noteSlotNo = noteSlotNo;
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_troop_note_from_sreg,%s,%s,%s,%s),",troopId,noteSlotNo,stringId,value);
    }
}
