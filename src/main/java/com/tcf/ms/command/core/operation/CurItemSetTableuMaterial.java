package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CurItemSetTableuMaterial implements Operation {

    private Variable tableauMaterialId;
    private Variable instanceCode;

    public CurItemSetTableuMaterial(Variable tableauMaterialId,Variable instanceCode) {
        this.tableauMaterialId = tableauMaterialId;
        this.instanceCode = instanceCode;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_item_set_tableu_material,%s,%s),",tableauMaterialId,instanceCode);
    }
}
