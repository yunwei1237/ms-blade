package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_partner_faction,<destination>),
 */
public class StorePartnerFaction implements Operation{

    private Variable destination;

    public StorePartnerFaction(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_partner_faction,%s),",destination);
    }
}
