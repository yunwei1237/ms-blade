package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateGameButtonOverlay implements Operation {

    private Variable destination;
    private Variable stringId;

    public CreateGameButtonOverlay(Variable destination,Variable stringId) {
        this.destination = destination;
        this.stringId = stringId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_game_button_overlay,%s,%s),",destination,stringId);
    }
}
