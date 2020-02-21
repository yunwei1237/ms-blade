package com.tcf.ms.command.core.operations.presentation.create;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateComboButtonOverlay implements Operation {
    /**
     * 下拉框组件
     */
    private Variable destination;

    public CreateComboButtonOverlay(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(create_combo_button_overlay,%s),",destination);
    }
}
