package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_partner_quest,<destination>),
 */
public class StorePartnerQuest implements Operation{

    private Variable destination;

    public StorePartnerQuest(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_partner_quest,%s),",destination);
    }
}
