package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ContextMenuAddItem implements Operation {

    

    public ContextMenuAddItem() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(context_menu_add_item),");
    }
}
