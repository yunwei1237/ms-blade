package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ConversationScreenActive implements Operation {

    

    public ConversationScreenActive() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(conversation_screen_active),");
    }
}
