package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (item_get_type, <destination>, <item_id>),  returned values are listed at header_items.py (values starting with itp_type_)
 */
public class ItemGetType implements Operation{

    private Variable destination;
    private Variable itemId;

    public ItemGetType(Variable destination,Variable itemId) {
        this.destination = destination;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(item_get_type,%s,%s),",destination,itemId);
    }
}
