package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddPartyNoteTableauMesh implements Operation {

    private Variable troopId;
    private Variable tableauMaterialId;

    public AddPartyNoteTableauMesh(Variable troopId,Variable tableauMaterialId) {
        this.troopId = troopId;
        this.tableauMaterialId = tableauMaterialId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_party_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }
}