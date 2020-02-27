package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   fails if the key is not currently down (key_is_down, <key_id>),
 */
public class KeyIsDown implements Conditable{

    private Variable keyId;

    public KeyIsDown(Variable keyId) {
        this.keyId = keyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(key_is_down,%s),",keyId);
    }
}
