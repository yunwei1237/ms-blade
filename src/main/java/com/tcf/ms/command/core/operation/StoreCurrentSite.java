package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   deprecated, use store_current_scene instead
 */
@Deprecated
public class StoreCurrentSite implements Operation{

    

    public StoreCurrentSite() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_current_site),");
    }
}
