package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class TalkInfoSetRelationBar implements Operation {

    

    public TalkInfoSetRelationBar() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_set_relation_bar),");
    }
}
