package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_party_name,<string_register>,<party_id>),
 */
public class StrStorePartyName implements Operation{

    private Variable stringRegister;
    private Variable partyId;

    public StrStorePartyName(Variable stringRegister,Variable partyId) {
        this.stringRegister = stringRegister;
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_party_name,%s,%s),",stringRegister,partyId);
    }
}
