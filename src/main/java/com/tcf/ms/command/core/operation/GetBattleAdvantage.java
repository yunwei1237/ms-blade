package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (get_battle_advantage, <destination>),
 */
public class GetBattleAdvantage implements Operation{

    private Variable destination;

    public GetBattleAdvantage(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_battle_advantage,%s),",destination);
    }
}
