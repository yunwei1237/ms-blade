package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenQuit implements Operation {

    

    public ChangeScreenQuit() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_quit),");
    }
}
