package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class PartyCanJoinAsPrisoner implements Operation , Conditable {
    /**
     * 按键id
     */
    private Variable partyId;

    /**
     * 默认为玩家部队
     */
    public PartyCanJoinAsPrisoner() {
    }

    @Override
    public String toScriptString() {
        return "(party_can_join_as_prisoner),";
    }
}
