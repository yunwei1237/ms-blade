package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

@Deprecated
public class InMetaMission implements Operation ,Conditable{

    

    public InMetaMission() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(in_meta_mission),");
    }
}
