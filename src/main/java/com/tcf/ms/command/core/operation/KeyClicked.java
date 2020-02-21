package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class KeyClicked implements Operation ,Conditable{

    private Variable gameKeyId;

    public KeyClicked(Variable gameKeyId) {
        this.gameKeyId = gameKeyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(key_clicked,%s),",gameKeyId);
    }
}
