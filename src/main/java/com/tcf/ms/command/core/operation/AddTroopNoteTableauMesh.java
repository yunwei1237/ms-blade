package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_troop_note_tableau_mesh,<troop_id>,<tableau_material_id>),
 */
public class AddTroopNoteTableauMesh implements Operation{

    private Variable troopId;
    private Variable tableauMaterialId;

    public AddTroopNoteTableauMesh(Variable troopId,Variable tableauMaterialId) {
        this.troopId = troopId;
        this.tableauMaterialId = tableauMaterialId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_troop_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }
}
