package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_conversation_troop,<destination>),
 */
public class StoreConversationTroop implements Operation{

    private Variable destination;

    public StoreConversationTroop(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_conversation_troop,%s),",destination);
    }
}
