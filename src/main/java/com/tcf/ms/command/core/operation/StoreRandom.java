package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

@Deprecated
public class StoreRandom implements Operation {

    

    public StoreRandom() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random),");
    }
}
