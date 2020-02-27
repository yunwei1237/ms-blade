package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_conversation_agent,<destination>),
 */
public class StoreConversationAgent implements Operation{

    private Variable destination;

    public StoreConversationAgent(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_conversation_agent,%s),",destination);
    }
}
