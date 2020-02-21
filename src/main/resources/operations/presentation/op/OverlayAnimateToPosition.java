package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *
 * 将组件渐变到指定位置
 */
public class OverlayAnimateToPosition implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 持续时间
     * 1000为1秒
     * 6000为1分
     */
    private Variable duration;
    /**
     * 坐标值
     * 使用坐标值的x为宽度，y为高度
     */
    private Variable positionNo;

    public OverlayAnimateToPosition(Variable overlayId, Variable duration, Variable positionNo) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_position,%s,%s,%s),",overlayId,duration,positionNo);
    }
}
