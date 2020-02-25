package com.tcf.ms.command.core.base;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;

public class OperationResult implements OperationWithResult {
    private StringVariable variable;
    private Operation operation;

    public OperationResult(StringVariable variable, Operation operation) {
        this.variable = variable;
        this.operation = operation;
    }

    @Override
    public <T> T get(Class<? extends CanVariable> clazz) {
        CanVariable canVariable;
        try {
            canVariable = clazz.newInstance();
            canVariable.setVar(variable);
            return (T) canVariable;
        } catch (Exception e) {
            throw new BladeException("获得对象时出错",e);
        }
    }

    @Override
    public String toScriptString() {
        return operation.toScriptString();
    }
}
