package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenViewCharacter implements Operation {

    

    public ChangeScreenViewCharacter() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_view_character),");
    }
}
