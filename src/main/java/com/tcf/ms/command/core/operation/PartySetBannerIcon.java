package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetBannerIcon implements Operation {

    private Variable partyId;
    private Variable mapIconId;

    public PartySetBannerIcon(Variable partyId,Variable mapIconId) {
        this.partyId = partyId;
        this.mapIconId = mapIconId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_banner_icon,%s,%s),",partyId,mapIconId);
    }
}
