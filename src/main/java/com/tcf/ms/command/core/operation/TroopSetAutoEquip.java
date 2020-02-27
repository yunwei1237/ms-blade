package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_set_auto_equip,<troop_id>,<value>), disables otr enables auto-equipping
 */
public class TroopSetAutoEquip implements Operation{

    private Variable troopId;
    private Variable value;

    public TroopSetAutoEquip(Variable troopId,Variable value) {
        this.troopId = troopId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_set_auto_equip,%s,%s),",troopId,value);
    }
}
