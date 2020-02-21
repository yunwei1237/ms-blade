package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenGiveMembers implements Operation {

    

    public ChangeScreenGiveMembers() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_give_members),");
    }
}
