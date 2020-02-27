package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_map_conversation),
 */
public class ChangeScreenMapConversation implements Operation{

    

    public ChangeScreenMapConversation() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_map_conversation),");
    }
}
