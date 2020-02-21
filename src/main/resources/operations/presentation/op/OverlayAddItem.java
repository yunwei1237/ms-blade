package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 为下拉框添加选项
 */
public class OverlayAddItem implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 字符串id
     */
    private Variable stringId;

    public OverlayAddItem(Variable overlayId, Variable stringId) {
        this.overlayId = overlayId;
        this.stringId = stringId;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_add_item,%s,%s),",overlayId,stringId);
    }
}
