package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenTraining implements Operation {

    

    public ChangeScreenTraining() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_training),");
    }
}
