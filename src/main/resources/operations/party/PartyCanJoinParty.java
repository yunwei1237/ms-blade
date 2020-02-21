package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class PartyCanJoinParty implements Operation , Conditable {
    /**
     * 要加入的部队
     */
    private Variable joinerPartyId;
    /**
     * 主部队
     */
    private Variable hostPartyId;
    /**
     * 是否作为俘虏加入
     */
    private Variable flipPrisoners;


    public PartyCanJoinParty(Variable joinerPartyId, Variable hostPartyId) {
        this(joinerPartyId,hostPartyId,null);
    }

    public PartyCanJoinParty(Variable joinerPartyId, Variable hostPartyId, Variable flipPrisoners) {
        this.joinerPartyId = joinerPartyId;
        this.hostPartyId = hostPartyId;
        this.flipPrisoners = flipPrisoners;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(flipPrisoners)?String.format("(party_can_join_party,%s,%s),",joinerPartyId,hostPartyId) : String.format("(party_can_join_party,%s,%s,%s),",joinerPartyId,hostPartyId,flipPrisoners);
    }
}
