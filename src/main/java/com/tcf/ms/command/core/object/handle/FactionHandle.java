package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

public class FactionHandle implements CanVariable {

    private StringVariable variable;

    public Variable getVar() {
        return this.variable;
    }

    public void setVar(StringVariable variable) {
        this.variable = variable;
    }
}
