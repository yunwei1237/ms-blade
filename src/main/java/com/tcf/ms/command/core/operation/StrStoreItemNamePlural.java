package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_item_name_plural,<string_register>,<item_id>),
 */
public class StrStoreItemNamePlural implements Operation{

    private Variable stringRegister;
    private Variable itemId;

    public StrStoreItemNamePlural(Variable stringRegister,Variable itemId) {
        this.stringRegister = stringRegister;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_item_name_plural,%s,%s),",stringRegister,itemId);
    }
}
