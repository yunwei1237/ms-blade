package com.tcf.ms.command.core.operations.presentation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StartPresentation implements Operation {
    /**
     * 界面id
     */
    private Variable presentationId;

    public StartPresentation(Variable presentationId) {
        this.presentationId = presentationId;
    }

    @Override
    public String toScriptString() {
        return String.format("(start_presentation,%s),",presentationId);
    }
}
