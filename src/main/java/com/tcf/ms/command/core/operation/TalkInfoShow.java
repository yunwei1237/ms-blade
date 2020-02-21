package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TalkInfoShow implements Operation {

    

    public TalkInfoShow() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_show),");
    }
}
