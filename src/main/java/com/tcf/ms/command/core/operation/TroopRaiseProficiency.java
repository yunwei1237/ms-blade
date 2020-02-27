package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (troop_raise_proficiency,<troop_id>,<proficiency_no>,<value>),
 */
public class TroopRaiseProficiency implements Operation{

    private Variable troopId;
    private Variable proficiencyNo;
    private Variable value;

    public TroopRaiseProficiency(Variable troopId,Variable proficiencyNo,Variable value) {
        this.troopId = troopId;
        this.proficiencyNo = proficiencyNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_raise_proficiency,%s,%s,%s),",troopId,proficiencyNo,value);
    }
}
