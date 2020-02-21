package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class ConversationScreenIsActive implements Operation ,Conditable{

    

    public ConversationScreenIsActive() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(conversation_screen_is_active),");
    }
}
