package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class EnteringTown implements Operation , Conditable {
    /**
     * 城镇id
     */
    private Variable townId;

    public EnteringTown(Variable townId) {
        this.townId = townId;
    }

    @Override
    public String toScriptString() {
        return String.format("(entering_town,%s),",townId);
    }
}
