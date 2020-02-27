package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (distribute_party_among_party_group, <party_to_be_distributed>, <group_root_party>),
 */
public class DistributePartyAmongPartyGroup implements Operation{

    private Variable partyToBeDistributed;
    private Variable groupRootParty;

    public DistributePartyAmongPartyGroup(Variable partyToBeDistributed,Variable groupRootParty) {
        this.partyToBeDistributed = partyToBeDistributed;
        this.groupRootParty = groupRootParty;     
    }

    @Override
    public String toScriptString() {
        return String.format("(distribute_party_among_party_group,%s,%s),",partyToBeDistributed,groupRootParty);
    }
}
