package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class GameKeyIsDown implements Operation ,Conditable{

    

    public GameKeyIsDown() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(game_key_is_down),");
    }
}
