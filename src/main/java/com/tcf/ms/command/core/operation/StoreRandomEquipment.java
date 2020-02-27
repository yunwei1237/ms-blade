package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_random_equipment,<destination>)
 */
public class StoreRandomEquipment implements Operation{

    private Variable destination;

    public StoreRandomEquipment(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_equipment,%s),",destination);
    }
}
