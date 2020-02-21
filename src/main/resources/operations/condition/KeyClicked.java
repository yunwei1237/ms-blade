package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class KeyClicked implements Operation , Conditable {
    /**
     * 按键id
     */
    private Variable keyId;

    public KeyClicked(Variable keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toScriptString() {
        return String.format("(key_clicked,%s),",keyId);
    }
}
