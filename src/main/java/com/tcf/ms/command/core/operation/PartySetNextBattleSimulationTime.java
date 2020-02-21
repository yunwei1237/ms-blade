package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PartySetNextBattleSimulationTime implements Operation {

    private Variable partyId;
    private Variable nextSimulationTimeInHours;

    public PartySetNextBattleSimulationTime(Variable partyId,Variable nextSimulationTimeInHours) {
        this.partyId = partyId;
        this.nextSimulationTimeInHours = nextSimulationTimeInHours;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_next_battle_simulation_time,%s,%s),",partyId,nextSimulationTimeInHours);
    }
}
