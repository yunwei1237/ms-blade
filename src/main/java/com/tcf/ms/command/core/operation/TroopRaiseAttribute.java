package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class TroopRaiseAttribute implements Operation {

    private Variable troopId;
    private Variable attributeId;
    private Variable value;

    public TroopRaiseAttribute(Variable troopId,Variable attributeId,Variable value) {
        this.troopId = troopId;
        this.attributeId = attributeId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_raise_attribute,%s,%s,%s),",troopId,attributeId,value);
    }
}
