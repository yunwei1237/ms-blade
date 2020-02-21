package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class StoreRepeatObject implements Operation {

    

    public StoreRepeatObject() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_repeat_object),");
    }
}
