package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_friend_count,<destination>),
 */
public class StoreFriendCount implements Operation{

    private Variable destination;

    public StoreFriendCount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_friend_count,%s),",destination);
    }
}
