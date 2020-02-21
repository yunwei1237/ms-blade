package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenTradePrisoners implements Operation {

    

    public ChangeScreenTradePrisoners() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_trade_prisoners),");
    }
}
