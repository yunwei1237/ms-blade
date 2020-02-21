package com.tcf.ms.command.core.operations.consequence;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class AddXpAsReward implements Operation {
    /**
     * 金钱
     */
    private Variable value;

    public AddXpAsReward(Variable value) {
        this.value = value;
    }

    @Override
    public String toScriptString() {
        return String.format("(add_xp_as_reward,%s),",value);
    }
}
