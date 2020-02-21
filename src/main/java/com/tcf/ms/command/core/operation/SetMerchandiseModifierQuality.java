package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class SetMerchandiseModifierQuality implements Operation {

    private Variable value;

    public SetMerchandiseModifierQuality(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_merchandise_modifier_quality,%s),",value);
    }
}
