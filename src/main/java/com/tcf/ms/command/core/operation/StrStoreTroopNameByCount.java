package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_troop_name_by_count,<string_register>,<troop_id>,<number>),
 */
public class StrStoreTroopNameByCount implements Operation{

    private Variable stringRegister;
    private Variable troopId;
    private Variable number;

    public StrStoreTroopNameByCount(Variable stringRegister,Variable troopId,Variable number) {
        this.stringRegister = stringRegister;
        this.troopId = troopId;
        this.number = number;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_troop_name_by_count,%s,%s,%s),",stringRegister,troopId,number);
    }
}
