package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   fails if the game key is not currently down (key_is_down, <game_key_id>),
 */
public class GameKeyIsDown implements Conditable{

    private Variable gameKeyId;

    public GameKeyIsDown(Variable gameKeyId) {
        this.gameKeyId = gameKeyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(game_key_is_down,%s),",gameKeyId);
    }
}
