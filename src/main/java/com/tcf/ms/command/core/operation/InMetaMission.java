package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.Conditable;

/**
 *   deprecated, do not use.
 */
@Deprecated
public class InMetaMission implements Conditable{

    

    public InMetaMission() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(in_meta_mission),");
    }
}
