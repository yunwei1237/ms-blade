package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   (map_free),
 */
public class MapFree implements Conditable{

    

    public MapFree() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(map_free),");
    }
}
