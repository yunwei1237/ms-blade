package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (reset_price_rates),
 */
public class ResetPriceRates implements Operation{

    

    public ResetPriceRates() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_price_rates),");
    }
}
