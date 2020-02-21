package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class ThisOrNext implements Operation , Conditable {
    /**
     * 操作
     */
    private Operation operation;

    public ThisOrNext(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toScriptString() {
        if(operation instanceof Conditable) {
            String str = operation.toScriptString();
            if(str.startsWith("(this_or_next|")){
                return str;
            }
            return str.replace("(", "(this_or_next|");
        }
        throw new RuntimeException("ThisOrNext Not Supporte " + operation.getClass().getName());
    }
}