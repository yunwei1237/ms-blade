package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_party_name_link,<string_register>,<party_id>),
 */
public class StrStorePartyNameLink implements Operation{

    private Variable stringRegister;
    private Variable partyId;

    public StrStorePartyNameLink(Variable stringRegister,Variable partyId) {
        this.stringRegister = stringRegister;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_party_name_link,%s,%s),",stringRegister,partyId);
    }
}
