package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_buy_mercenaries),
 */
public class ChangeScreenBuyMercenaries implements Operation{

    

    public ChangeScreenBuyMercenaries() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_buy_mercenaries),");
    }
}
