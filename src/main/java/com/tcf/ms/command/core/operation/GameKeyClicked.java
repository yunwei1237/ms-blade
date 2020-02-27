package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   fails if the game key is not clicked on the specific frame (key_clicked, <game_key_id>),
 */
public class GameKeyClicked implements Conditable{

    private Variable gameKeyId;

    public GameKeyClicked(Variable gameKeyId) {
        this.gameKeyId = gameKeyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(game_key_clicked,%s),",gameKeyId);
    }
}
