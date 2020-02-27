package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (right_mouse_menu_add_item, <string_id>, <value>),  must be called only inside script_game_right_mouse_menu_get_buttons
 */
public class ContextMenuAddItem implements Operation{

    private Variable stringId;
    private Variable value;

    public ContextMenuAddItem(Variable stringId,Variable value) {
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(context_menu_add_item,%s,%s),",stringId,value);
    }
}
