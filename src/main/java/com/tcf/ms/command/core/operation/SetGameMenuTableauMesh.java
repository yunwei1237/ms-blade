package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetGameMenuTableauMesh implements Operation {

    private Variable tableauMaterialId;
    private Variable value;
    private Variable positionRegisterNo;

    public SetGameMenuTableauMesh(Variable tableauMaterialId,Variable value,Variable positionRegisterNo) {
        this.tableauMaterialId = tableauMaterialId;
        this.value = value;
        this.positionRegisterNo = positionRegisterNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_game_menu_tableau_mesh,%s,%s,%s),",tableauMaterialId,value,positionRegisterNo);
    }
}
