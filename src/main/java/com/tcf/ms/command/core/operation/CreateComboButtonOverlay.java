package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateComboButtonOverlay implements Operation {

    private Variable destination;

    public CreateComboButtonOverlay(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(create_combo_button_overlay,%s),",destination);
    }
}
