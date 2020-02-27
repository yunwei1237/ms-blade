package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (hero_can_join, [party_id]),
 */
public class HeroCanJoin implements Conditable{

    private Variable partyId;

    public HeroCanJoin(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(hero_can_join,%s),",partyId);
    }
}
