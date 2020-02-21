package com.tcf.ms.command.core.operations.consequence;

import com.tcf.ms.command.Operation;

public class SetPartyBattleMode implements Operation {
    @Override
    public String toScriptString() {
        return "(set_party_battle_mode),";
    }
}
