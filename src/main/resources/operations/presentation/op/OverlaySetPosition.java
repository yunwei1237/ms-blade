package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class OverlaySetPosition implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 坐标
     * 使用坐标的x和y作为组件的left(左边距)和top(上边距)
     */
    private Variable positionNo;

    public OverlaySetPosition(Variable overlayId, Variable positionNo) {
        this.overlayId = overlayId;
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_position,%s,%s),",overlayId,positionNo);
    }
}
