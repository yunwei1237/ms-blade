package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StrStoreItemNameByCount implements Operation {

    private Variable stringRegister;
    private Variable itemId;

    public StrStoreItemNameByCount(Variable stringRegister,Variable itemId) {
        this.stringRegister = stringRegister;
        this.itemId = itemId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_item_name_by_count,%s,%s),",stringRegister,itemId);
    }
}
