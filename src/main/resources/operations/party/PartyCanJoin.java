package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class PartyCanJoin implements Operation , Conditable {

    @Override
    public String toScriptString() {
        return "(party_can_join),";
    }
}
