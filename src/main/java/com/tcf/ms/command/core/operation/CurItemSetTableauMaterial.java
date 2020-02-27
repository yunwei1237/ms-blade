package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_item_set_tableu_material, <tableau_material_id>, <instance_code>),  only call inside ti_on_init_item in module_items
 */
public class CurItemSetTableauMaterial implements Operation{

    private Variable tableauMaterialId;
    private Variable instanceCode;

    public CurItemSetTableauMaterial(Variable tableauMaterialId,Variable instanceCode) {
        this.tableauMaterialId = tableauMaterialId;
        this.instanceCode = instanceCode;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_item_set_tableau_material,%s,%s),",tableauMaterialId,instanceCode);
    }
}
