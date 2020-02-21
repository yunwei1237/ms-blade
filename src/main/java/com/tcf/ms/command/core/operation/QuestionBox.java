package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class QuestionBox implements Operation {

    

    public QuestionBox() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(question_box),");
    }
}
