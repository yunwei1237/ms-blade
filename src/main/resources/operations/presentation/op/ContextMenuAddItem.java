package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 为右键菜单添加选项
 */
public class ContextMenuAddItem implements Operation {
    /**
     * 字符串id
     */
    private Variable stringId;
    /**
     * 值
     */
    private Variable value;

    public ContextMenuAddItem(Variable stringId, Variable value) {
        this.stringId = stringId;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_add_item,%s,%s),",stringId,value);
    }
}
