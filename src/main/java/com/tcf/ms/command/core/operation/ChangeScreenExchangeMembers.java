package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_exchange_members, [0,1 = exchange_leader]),
 */
public class ChangeScreenExchangeMembers implements Operation{

    private Variable exchangeLeader;

    public ChangeScreenExchangeMembers(Variable exchangeLeader) {
        this.exchangeLeader = exchangeLeader;     
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_exchange_members,%s),",exchangeLeader);
    }
}
