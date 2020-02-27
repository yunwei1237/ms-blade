package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (conversation_screen_active),  used in mission template triggers only
 */
public class ConversationScreenIsActive implements Conditable{

    

    public ConversationScreenIsActive() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(conversation_screen_is_active),");
    }
}
