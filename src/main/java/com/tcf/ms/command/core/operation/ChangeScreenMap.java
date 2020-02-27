package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 
 */
public class ChangeScreenMap implements Operation{

    

    public ChangeScreenMap() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_map),");
    }
}
