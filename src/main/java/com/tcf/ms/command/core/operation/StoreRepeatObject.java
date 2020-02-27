package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   stores the index of a repeated dialog option for repeat_for_factions, etc...
 */
public class StoreRepeatObject implements Operation{

    

    public StoreRepeatObject() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_repeat_object),");
    }
}
