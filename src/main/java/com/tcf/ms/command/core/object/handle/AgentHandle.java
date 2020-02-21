package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.object.Troop;

public class AgentHandle implements CanVariable {
    private StringVariable variable;

    @Override
    public void setVar(StringVariable variable) {
        this.variable = variable;
    }

    public AgentHandle(StringVariable variable) {
        this.variable = variable;
    }

    public AgentHandle(Troop troop) {
        this.variable = troop.getVar();
    }

    @Override
    public Variable getVar() {
        return this.variable;
    }
}
