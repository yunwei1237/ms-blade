package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (entry_point_get_position,<position_no>,<entry_no>),
 */
public class EntryPointGetPosition implements Operation{

    private Variable positionNo;
    private Variable entryNo;

    public EntryPointGetPosition(Variable positionNo,Variable entryNo) {
        this.positionNo = positionNo;
        this.entryNo = entryNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(entry_point_get_position,%s,%s),",positionNo,entryNo);
    }
}
