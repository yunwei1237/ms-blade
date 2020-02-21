package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class MusicSetCulture implements Operation {

    private Variable cultureType;

    public MusicSetCulture(Variable cultureType) {
        this.cultureType = cultureType;     
    }

    @Override
    public String toScriptString() {
        return String.format("(music_set_culture,%s),",cultureType);
    }
}
