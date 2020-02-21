package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurMapIconSetTableauMaterial implements Operation {

    private Variable tableauMaterialId;
    private Variable instanceCode;

    public CurMapIconSetTableauMaterial(Variable tableauMaterialId,Variable instanceCode) {
        this.tableauMaterialId = tableauMaterialId;
        this.instanceCode = instanceCode;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_map_icon_set_tableau_material,%s,%s),",tableauMaterialId,instanceCode);
    }
}
