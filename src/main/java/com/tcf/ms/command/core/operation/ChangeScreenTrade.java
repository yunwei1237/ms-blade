package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_trade),
 */
public class ChangeScreenTrade implements Operation{

    

    public ChangeScreenTrade() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_trade),");
    }
}
