package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (party_slot_eq,<party_id>,<slot_no>,<value>),
 */
public class PartySlotEq implements Conditable{

    private Variable partyId;
    private Variable slotNo;
    private Variable value;

    public PartySlotEq(Variable partyId,Variable slotNo,Variable value) {
        this.partyId = partyId;
        this.slotNo = slotNo;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_slot_eq,%s,%s,%s),",partyId,slotNo,value);
    }
}
