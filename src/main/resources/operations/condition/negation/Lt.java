package com.tcf.ms.command.core.operations.condition.negation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class Lt implements Operation, Conditable {
    /**
     * 第一个数字
     */
    private Variable value1;
    /**
     * 第二个数字
     */
    private Variable value2;

    public Lt(Variable value1, Variable value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toScriptString() {
        return String.format("(lt,%s,%s),",value1,value2);
    }
}
