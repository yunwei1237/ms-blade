package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

@Deprecated
public class StoreTroopKindCount implements Operation {

    

    public StoreTroopKindCount() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_kind_count),");
    }
}
