package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetSize implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 坐标
     * 使用坐标的x和y作为组件的宽度和高度
     */
    private Variable positionNo;

    public OverlaySetSize(Variable overlayId, Variable positionNo) {
        this.overlayId = overlayId;
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_size,%s,%s),",overlayId,positionNo);
    }
}
