package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class CurItemSetTableauMaterial implements Operation {

    

    public CurItemSetTableauMaterial() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_item_set_tableau_material),");
    }
}
