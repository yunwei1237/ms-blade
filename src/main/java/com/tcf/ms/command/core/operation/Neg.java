package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class Neg implements Operation , Conditable {
    private Operation operation;

    public Neg(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toScriptString() {
        if(operation instanceof Conditable) {
            String str = operation.toScriptString();
            //用于取反
            if(str.startsWith("(neg|")){
                return str.replace("(neg|", "(");
            }
            return str.replace("(", "(neg|");
        }
        throw new RuntimeException("Neg Not Supporte " + operation.getClass().getName());
    }
}
