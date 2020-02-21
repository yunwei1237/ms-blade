package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StoreRepeatObject implements Operation {
    /**
     * 城镇id
     */
    private Variable object;

    public StoreRepeatObject(Variable object) {
        this.object = object;
    }

    @Override
    public String toScriptString() {
        return String.format("(store_repeat_object, %s),",object);
    }
}
