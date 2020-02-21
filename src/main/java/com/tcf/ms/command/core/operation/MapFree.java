package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class MapFree implements Operation ,Conditable{

    

    public MapFree() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(map_free),");
    }
}
