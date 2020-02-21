package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

public class HeroCanJoinAsPrisoner implements Operation ,Conditable{

    private Variable partyId;

    public HeroCanJoinAsPrisoner(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(hero_can_join_as_prisoner,%s),",partyId);
    }
}
