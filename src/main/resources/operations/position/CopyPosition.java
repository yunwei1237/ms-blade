package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class CopyPosition implements Operation {
    /**
     * 变量
     */
    private Variable positionNo1;
    private Variable positionNo2;

    public CopyPosition(Variable positionNo1, Variable positionNo2) {
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;
    }

    @Override
    public String toScriptString() {
        return String.format("(copy_position,%s,%s),",positionNo1,positionNo2);
    }
}
