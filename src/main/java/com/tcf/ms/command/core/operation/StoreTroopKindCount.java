package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   deprecated, use party_count_members_of_type instead
 */
@Deprecated
public class StoreTroopKindCount implements Operation{

    

    public StoreTroopKindCount() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(store_troop_kind_count),");
    }
}
