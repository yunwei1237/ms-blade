package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class ConversationScreenIsActive implements Operation, Conditable {
    @Override
    public String toScriptString() {
        return "(conversation_screen_active),";
    }
}
