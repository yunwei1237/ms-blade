package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_price_rate_for_item_type,<item_type_id>,<value_percentage>),
 */
public class SetPriceRateForItemType implements Operation{

    private Variable itemTypeId;
    private Variable valuePercentage;

    public SetPriceRateForItemType(Variable itemTypeId,Variable valuePercentage) {
        this.itemTypeId = itemTypeId;
        this.valuePercentage = valuePercentage;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_price_rate_for_item_type,%s,%s),",itemTypeId,valuePercentage);
    }
}
