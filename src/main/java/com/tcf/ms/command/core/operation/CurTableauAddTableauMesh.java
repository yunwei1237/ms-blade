package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurTableauAddTableauMesh implements Operation {

    private Variable tableauMaterialId;
    private Variable value;
    private Variable positionRegisterNo;

    public CurTableauAddTableauMesh(Variable tableauMaterialId,Variable value,Variable positionRegisterNo) {
        this.tableauMaterialId = tableauMaterialId;
        this.value = value;
        this.positionRegisterNo = positionRegisterNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_tableau_mesh,%s,%s,%s),",tableauMaterialId,value,positionRegisterNo);
    }
}
