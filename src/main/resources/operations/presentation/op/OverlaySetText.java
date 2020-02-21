package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetText implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 字符串id
     */
    private Variable stringId;

    public OverlaySetText(Variable overlayId, Variable stringId) {
        this.overlayId = overlayId;
        this.stringId = stringId;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_text,%s,%s),",overlayId,stringId);
    }
}
