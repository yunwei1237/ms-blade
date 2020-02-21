package com.tcf.ms.command.core.operations.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public class GameKeyClicked implements Operation , Conditable {
    /**
     * 游戏按键id
     */
    private Variable keyId;

    public GameKeyClicked(Variable keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toScriptString() {
        return String.format("(game_key_clicked,%s),",keyId);
    }
}