package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (jump_to_menu,<menu_id>),
 */
public class JumpToMenu implements Operation{

    private Variable menuId;

    public JumpToMenu(Variable menuId) {
        this.menuId = menuId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(jump_to_menu,%s),",menuId);
    }
}
