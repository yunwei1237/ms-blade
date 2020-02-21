package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddCompanionParty implements Operation {

    private Variable troopIdHero;

    public AddCompanionParty(Variable troopIdHero) {
        this.troopIdHero = troopIdHero;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_companion_party,%s),",troopIdHero);
    }
}
