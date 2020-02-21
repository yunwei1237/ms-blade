package com.tcf.ms.command.core.operations.presentation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class StartBackgroundPresentation implements Operation {
    /**
     * 界面id
     */
    private Variable presentationId;

    public StartBackgroundPresentation(Variable presentationId) {
        this.presentationId = presentationId;
    }

    @Override
    public String toScriptString() {
        return String.format("(start_background_presentation,%s),",presentationId);
    }
}
