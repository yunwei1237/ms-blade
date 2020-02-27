package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (add_xp_as_reward,<value>),
 */
public class AddXpAsReward implements Operation{

    private Variable value;

    public AddXpAsReward(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(add_xp_as_reward,%s),",value);
    }
}
