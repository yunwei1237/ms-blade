package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_upgrade_with_xp, <party_id>, <xp_amount>, <upgrade_path>),  upgrade_path can be: 0 = choose random, 1 = choose first, 2 = choose second
 */
public class PartyUpgradeWithXp implements Operation{

    private Variable partyId;
    private Variable xpAmount;
    private Variable upgradePath;

    public PartyUpgradeWithXp(Variable partyId,Variable xpAmount,Variable upgradePath) {
        this.partyId = partyId;
        this.xpAmount = xpAmount;
        this.upgradePath = upgradePath;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_upgrade_with_xp,%s,%s,%s),",partyId,xpAmount,upgradePath);
    }
}
