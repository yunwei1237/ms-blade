package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class KeyIsDown implements Operation, Conditable {
    /**
     * 按键id
     */
    private Variable keyId;

    public KeyIsDown(Variable keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toScriptString() {
        return String.format("(key_is_down,%s),",keyId);
    }
}
