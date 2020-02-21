package com.tcf.ms.command.core.operations.party;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class HeroCanJoinAsPrisoner implements Operation , Conditable {
    /**
     * 按键id
     */
    private Variable partyId;

    /**
     * 默认为玩家部队
     */
    public HeroCanJoinAsPrisoner() {
    }

    /**
     * 指定部队
     * @param partyId
     */
    public HeroCanJoinAsPrisoner(Variable partyId) {
        this.partyId = partyId;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(partyId) ? "(hero_can_join_as_prisoner),":String.format("(hero_can_join_as_prisoner,%s),",partyId);
    }
}
