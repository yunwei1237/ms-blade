package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;

public class SceneHandle implements CanVariable {

    private StringVariable variable;

    private ScriptSpan scriptSpan;

    public SceneHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SceneHandle(StringVariable variable, ScriptSpan scriptSpan) {
        this.variable = variable;
        this.scriptSpan = scriptSpan;
    }

    @Override
    public Variable getVar() {
        return null;
    }

    @Override
    public void setVar(StringVariable variable) {

    }
}
