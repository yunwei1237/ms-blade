package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StoreRandomEquipment implements Operation {

    

    public StoreRandomEquipment() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_equipment),");
    }
}
