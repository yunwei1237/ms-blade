package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class DisableMenuOption implements Operation {

    

    public DisableMenuOption() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(disable_menu_option),");
    }
}
