package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class CurTableauClearOverrideItems implements Operation {

    

    public CurTableauClearOverrideItems() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_clear_override_items),");
    }
}
