package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetAverageGameDifficulty implements Operation {

    private Variable destination;

    public GetAverageGameDifficulty(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(get_average_game_difficulty,%s),",destination);
    }
}
