package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopAddMerchandise implements Operation {

    private Variable troopId;
    private Variable itemTypeId;
    private Variable value;

    public TroopAddMerchandise(Variable troopId,Variable itemTypeId,Variable value) {
        this.troopId = troopId;
        this.itemTypeId = itemTypeId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_add_merchandise,%s,%s,%s),",troopId,itemTypeId,value);
    }
}
