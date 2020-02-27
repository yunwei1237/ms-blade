package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_clear_override_items),
 */
public class CurTableauClearOverrideItems implements Operation{

    

    public CurTableauClearOverrideItems() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_clear_override_items),");
    }
}
