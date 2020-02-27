package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_add_override_item, <item_kind_id>),
 */
public class CurTableauAddOverrideItem implements Operation{

    private Variable itemKindId;

    public CurTableauAddOverrideItem(Variable itemKindId) {
        this.itemKindId = itemKindId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_add_override_item,%s),",itemKindId);
    }
}
