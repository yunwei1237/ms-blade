package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetBattleAdvantage implements Operation {

    private Variable value;

    public SetBattleAdvantage(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_battle_advantage,%s),",value);
    }
}
