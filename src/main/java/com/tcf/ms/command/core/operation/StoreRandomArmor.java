package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StoreRandomArmor implements Operation {

    

    public StoreRandomArmor() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_armor),");
    }
}
