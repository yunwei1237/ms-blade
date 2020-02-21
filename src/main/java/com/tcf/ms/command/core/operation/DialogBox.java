package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class DialogBox implements Operation {

    

    public DialogBox() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(dialog_box),");
    }
}
