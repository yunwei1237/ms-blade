package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class IsBetween implements Operation , Conditable {
    /**
     * 第一个数字
     */
    private Variable value;
    /**
     * 开始数据值
     */
    private Variable lowerBound;
    /**
     * 结束数值
     */
    private Variable upperBound;

    public IsBetween(Variable value, Variable lowerBound, Variable upperBound) {
        this.value = value;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toScriptString() {
        return String.format("(is_between,%s,%s),",value,lowerBound,upperBound);
    }
}
