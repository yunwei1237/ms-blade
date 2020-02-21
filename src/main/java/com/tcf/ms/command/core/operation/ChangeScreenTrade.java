package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenTrade implements Operation {

    

    public ChangeScreenTrade() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_trade),");
    }
}
