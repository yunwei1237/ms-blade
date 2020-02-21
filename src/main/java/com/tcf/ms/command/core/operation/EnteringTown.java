package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class EnteringTown implements Operation ,Conditable{

    private Variable townId;

    public EnteringTown(Variable townId) {
        this.townId = townId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(entering_town,%s),",townId);
    }
}
