package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (inflict_casualties_to_party, <parent_party_id>, <attack_rounds>, <party_id_to_add_causalties_to>), 
 */
public class InflictCasualtiesToPartyGroup implements Operation{

    private Variable parentPartyId;
    private Variable attackRounds;
    private Variable partyIdToAddCausaltiesTo;

    public InflictCasualtiesToPartyGroup(Variable parentPartyId,Variable attackRounds,Variable partyIdToAddCausaltiesTo) {
        this.parentPartyId = parentPartyId;
        this.attackRounds = attackRounds;
        this.partyIdToAddCausaltiesTo = partyIdToAddCausaltiesTo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(inflict_casualties_to_party_group,%s,%s,%s),",parentPartyId,attackRounds,partyIdToAddCausaltiesTo);
    }
}
