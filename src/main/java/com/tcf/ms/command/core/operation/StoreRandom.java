package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   deprecated, use store_random_in_range instead.
 */
@Deprecated
public class StoreRandom implements Operation{

    

    public StoreRandom() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_random),");
    }
}
