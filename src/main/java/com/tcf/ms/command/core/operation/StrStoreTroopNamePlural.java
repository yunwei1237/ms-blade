package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_troop_name_plural,<string_register>,<troop_id>),
 */
public class StrStoreTroopNamePlural implements Operation{

    private Variable stringRegister;
    private Variable troopId;

    public StrStoreTroopNamePlural(Variable stringRegister,Variable troopId) {
        this.stringRegister = stringRegister;
        this.troopId = troopId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_troop_name_plural,%s,%s),",stringRegister,troopId);
    }
}
