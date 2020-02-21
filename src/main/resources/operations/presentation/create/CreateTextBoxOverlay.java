package com.tcf.ms.command.core.operations.presentation.create;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateTextBoxOverlay implements Operation {
    /**
     * 输入框组件
     */
    private Variable destination;

    public CreateTextBoxOverlay(Variable destination) {
        this.destination = destination;
    }

    @Override
    public String toScriptString() {
        return String.format("(create_text_box_overlay,%s),",destination);
    }
}
