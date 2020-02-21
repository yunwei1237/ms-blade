package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionIsBehindPosition implements Operation {
    /**
     * 变量
     */
    private Variable positionNo1;
    private Variable positionNo2;

    public PositionIsBehindPosition(Variable positionNo1, Variable positionNo2) {
        this.positionNo1 = positionNo1;
        this.positionNo2 = positionNo2;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_is_behind_position,%s,%s),",positionNo1,positionNo2);
    }
}
