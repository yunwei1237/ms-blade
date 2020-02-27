package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   fails if the key is not clicked on the specific frame (key_clicked, <key_id>),
 */
public class KeyClicked implements Conditable{

    private Variable keyId;

    public KeyClicked(Variable keyId) {
        this.keyId = keyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(key_clicked,%s),",keyId);
    }
}
