package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_item_name,<string_register>,<item_id>),
 */
public class StrStoreItemName implements Operation{

    private Variable stringRegister;
    private Variable itemId;

    public StrStoreItemName(Variable stringRegister,Variable itemId) {
        this.stringRegister = stringRegister;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_item_name,%s,%s),",stringRegister,itemId);
    }
}
