package com.tcf.ms.command.core.operations.presentation.op;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *
 * 只能使用在滑块，组合按钮，复选框组件
 */
public class OverlaySetVal implements Operation {
    /**
     * 组件id
     */
    private Variable overlayId;
    /**
     * 值
     */
    private Variable value;

    public OverlaySetVal(Variable overlayId, Variable value) {
        this.overlayId = overlayId;
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(overlay_set_val,%s,%s),",overlayId,value);
    }
}
