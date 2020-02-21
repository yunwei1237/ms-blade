package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ResetItemProbabilities implements Operation {

    

    public ResetItemProbabilities() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(reset_item_probabilities),");
    }
}
