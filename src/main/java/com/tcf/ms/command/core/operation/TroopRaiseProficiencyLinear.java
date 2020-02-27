package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   raises weapon proficiencies linearly without being limited by weapon master skill  (troop_raise_proficiency,<troop_id>,<proficiency_no>,<value>),
 */
public class TroopRaiseProficiencyLinear implements Operation{

    private Variable troopId;
    private Variable proficiencyNo;
    private Variable value;

    public TroopRaiseProficiencyLinear(Variable troopId,Variable proficiencyNo,Variable value) {
        this.troopId = troopId;
        this.proficiencyNo = proficiencyNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(troop_raise_proficiency_linear,%s,%s,%s),",troopId,proficiencyNo,value);
    }
}
