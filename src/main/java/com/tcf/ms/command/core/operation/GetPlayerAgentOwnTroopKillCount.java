package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (get_player_agent_own_troop_kill_count,<destination>,[get_wounded]),  Set second value to non-zero to getGroup wounded count
 */
public class GetPlayerAgentOwnTroopKillCount implements Operation{

    private Variable destination;
    private Variable getWounded;

    public GetPlayerAgentOwnTroopKillCount(Variable destination,Variable getWounded) {
        this.destination = destination;
        this.getWounded = getWounded;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_player_agent_own_troop_kill_count,%s,%s),",destination,getWounded);
    }
}
