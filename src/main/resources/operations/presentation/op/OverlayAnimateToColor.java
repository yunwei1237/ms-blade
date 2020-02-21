package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *
 * 将组件渐变成指定颜色
 */
public class OverlayAnimateToColor implements Operation {
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
     * 颜色值
     * color in RGB format like 0xRRGGBB
     */
    private Variable color;

    public OverlayAnimateToColor(Variable overlayId, Variable duration, Variable color) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.color = color;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_color,%s,%s,%s),",overlayId,duration,color);
    }
}
