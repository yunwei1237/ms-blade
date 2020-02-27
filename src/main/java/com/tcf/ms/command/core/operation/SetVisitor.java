package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_visitor,<entry_no>,<troop_id>,[<dna>]),
 */
public class SetVisitor implements Operation{

    private Variable entryNo;
    private Variable troopId;
    private Variable dna;

    public SetVisitor(Variable entryNo,Variable troopId,Variable dna) {
        this.entryNo = entryNo;
        this.troopId = troopId;
        this.dna = dna;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_visitor,%s,%s,%s),",entryNo,troopId,dna);
    }
}
