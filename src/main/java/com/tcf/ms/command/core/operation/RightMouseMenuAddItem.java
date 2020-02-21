package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RightMouseMenuAddItem implements Operation {

    private Variable stringId;
    private Variable value;

    public RightMouseMenuAddItem(Variable stringId,Variable value) {
        this.stringId = stringId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(right_mouse_menu_add_item,%s,%s),",stringId,value);
    }
}
