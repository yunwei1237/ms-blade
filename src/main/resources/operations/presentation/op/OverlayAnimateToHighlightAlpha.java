package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *
 * 将组件渐变成指定透明度
 */
public class OverlayAnimateToHighlightAlpha implements Operation {
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
     * 透明值
     * color in RGB format like 0xRRGGBB
     */
    private Variable alpha;

    public OverlayAnimateToHighlightAlpha(Variable overlayId, Variable duration, Variable alpha) {
        this.overlayId = overlayId;
        this.duration = duration;
        this.alpha = alpha;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_animate_to_highlight_alpha,%s,%s,%s),",overlayId,duration,alpha);
    }
}
