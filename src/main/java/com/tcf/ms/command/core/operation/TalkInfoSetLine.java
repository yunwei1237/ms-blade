package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TalkInfoSetLine implements Operation {

    

    public TalkInfoSetLine() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_set_line),");
    }
}
