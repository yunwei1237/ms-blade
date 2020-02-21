package com.tcf.ms.command.core.operations.position;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PositionSetZToGroundLevel implements Operation {
    /**
     * 变量
     */
    private Variable positionNo;

    public PositionSetZToGroundLevel(Variable positionNo) {
        this.positionNo = positionNo;
    }

    @Override
    public String toScriptString() {
        return String.format("(position_set_z_to_ground_level,%s),",positionNo);
    }
}
