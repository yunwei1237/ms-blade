package com.tcf.ms.command.core.operations.consequence;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class AddXpToTroop implements Operation {
    /**
     * 经验值
     */
    private Variable value;
    /**
     * 兵种，默认玩家
     */
    private Variable troopId;

    public AddXpToTroop(Variable value) {
        this(value,null);
    }

    public AddXpToTroop(Variable value, Variable troopId) {
        this.value = value;
        this.troopId = troopId;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(value) ? String.format("(add_xp_to_troop,%s),",value) : String.format("(add_xp_to_troop,%s,%s),",value,troopId);
    }
}
