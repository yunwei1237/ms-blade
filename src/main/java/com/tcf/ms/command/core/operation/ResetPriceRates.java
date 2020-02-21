package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetPriceRates implements Operation {

    

    public ResetPriceRates() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_price_rates),");
    }
}
