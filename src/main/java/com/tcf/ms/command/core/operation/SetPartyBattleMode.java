package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class SetPartyBattleMode implements Operation {

    

    public SetPartyBattleMode() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(set_party_battle_mode),");
    }
}
