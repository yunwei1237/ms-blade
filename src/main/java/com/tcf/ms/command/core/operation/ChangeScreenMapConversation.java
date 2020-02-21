package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenMapConversation implements Operation {

    

    public ChangeScreenMapConversation() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_map_conversation),");
    }
}
