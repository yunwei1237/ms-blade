package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class GameKeyClicked implements Operation ,Conditable{

    

    public GameKeyClicked() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(game_key_clicked),");
    }
}
