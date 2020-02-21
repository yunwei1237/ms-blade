package com.tcf.ms.command.core.operations.game;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class GetAverageGameDifficulty implements Operation {
    /**
     * 变量
     */
    private Variable destination;

    public GetAverageGameDifficulty(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(get_average_game_difficulty,%s),",destination);
    }
}
