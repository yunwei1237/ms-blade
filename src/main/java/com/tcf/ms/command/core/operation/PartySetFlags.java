package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (party_set_flag, <party_id>, <flag>, <clear_or_set>),  sets flags like pf_default_behavior. see header_parties.py for flags.
 */
public class PartySetFlags implements Operation{

    private Variable partyId;
    private Variable flag;
    private Variable clearOrSet;

    public PartySetFlags(Variable partyId,Variable flag,Variable clearOrSet) {
        this.partyId = partyId;
        this.flag = flag;
        this.clearOrSet = clearOrSet;     
    }

    @Override
    public String toScriptString() {
        return String.format("(party_set_flags,%s,%s,%s),",partyId,flag,clearOrSet);
    }
}
