package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_exchange_with_party, <party_id>),
 */
public class ChangeScreenExchangeWithParty implements Operation{

    private Variable partyId;

    public ChangeScreenExchangeWithParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_exchange_with_party,%s),",partyId);
    }
}
