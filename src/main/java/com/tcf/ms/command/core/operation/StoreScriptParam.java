package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_script_param,<destination>,<script_param_no>), --(Within a script) stores <script_param_no>th script parameter.
 */
public class StoreScriptParam implements Operation{

    private Variable destination;
    private Variable scriptParamNo;

    public StoreScriptParam(Variable destination,Variable scriptParamNo) {
        this.destination = destination;
        this.scriptParamNo = scriptParamNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_script_param,%s,%s),",destination,scriptParamNo);
    }
}
