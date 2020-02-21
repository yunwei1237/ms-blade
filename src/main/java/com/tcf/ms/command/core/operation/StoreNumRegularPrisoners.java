package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StoreNumRegularPrisoners implements Operation {

    

    public StoreNumRegularPrisoners() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_num_regular_prisoners),");
    }
}
