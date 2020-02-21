package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetItemProbabilityInMerchandise implements Operation {

    private Variable itmId;
    private Variable value;

    public SetItemProbabilityInMerchandise(Variable itmId,Variable value) {
        this.itmId = itmId;
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_item_probability_in_merchandise,%s,%s),",itmId,value);
    }
}
