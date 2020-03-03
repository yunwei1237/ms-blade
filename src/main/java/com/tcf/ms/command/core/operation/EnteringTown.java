package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (entering_town,<town_id>),
 */
public class EnteringTown implements Conditable{

    private Variable townId;

    public EnteringTown(Variable townId) {
        this.townId = townId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(entering_town,%s),",townId);
    }
}
