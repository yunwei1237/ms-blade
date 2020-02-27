package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (shuffle_range,<reg_no>,<reg_no>),
 */
public class ShuffleRange implements Operation{

    private Variable regNo;
    private Variable regNo2;

    public ShuffleRange(Variable regNo,Variable regNo2) {
        this.regNo = regNo;
        this.regNo2 = regNo2;     
    }

    @Override
    public String toScriptString() {
        return String.format("(shuffle_range,%s,%s),",regNo,regNo2);
    }
}
