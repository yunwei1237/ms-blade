package com.tcf.ms.command.core.object;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

public class Agent implements CanVariable {

    private StringVariable variable;

    @Override
    public StringVariable getVar() {
        return this.variable;
    }

    @Override
    public void setVar(StringVariable variable) {
        this.variable = variable;
    }
}
