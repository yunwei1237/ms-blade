package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StoreRandomHorse implements Operation {

    

    public StoreRandomHorse() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random_horse),");
    }
}
