package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenReturn implements Operation {

    

    public ChangeScreenReturn() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_return),");
    }
}
