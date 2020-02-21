package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class EncounteredPartyIsAttacker implements Operation , Conditable {
    @Override
    public String toScriptString() {
        return "(encountered_party_is_attacker),";
    }
}
