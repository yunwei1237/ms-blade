package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class PartyGetBattleOpponent implements Operation {

    

    public PartyGetBattleOpponent() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(party_get_battle_opponent),");
    }
}
