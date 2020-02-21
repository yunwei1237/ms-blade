package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenExchangeMembers implements Operation {

    

    public ChangeScreenExchangeMembers() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_exchange_members),");
    }
}
