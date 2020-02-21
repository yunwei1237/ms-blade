package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetPriceRateForItem implements Operation {

    private Variable itemId;
    private Variable valuePercentage;

    public SetPriceRateForItem(Variable itemId,Variable valuePercentage) {
        this.itemId = itemId;
        this.valuePercentage = valuePercentage;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_price_rate_for_item,%s,%s),",itemId,valuePercentage);
    }
}
