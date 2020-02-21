package com.tcf.ms.command.core.operations.presentation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class PresentationSetDuration implements Operation {
    /**
     * 显示时间
     * 单位：1/100-seconds
     * 100代表一秒
     * 6000代表一分钟
     */
    private Variable duration;

    public PresentationSetDuration(Variable duration) {
        this.duration = duration;
    }

    @Override
    public String toScriptString() {
        return String.format("(presentation_set_duration,%s),",duration);
    }
}
