package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (stop_all_sounds, [options]),   0 = default, 1 = fade out current track, 2 = stop current track
 */
public class StopAllSounds implements Operation{

    private Variable options;

    public StopAllSounds(Variable options) {
        this.options = options;     
    }

    @Override
    public String toScriptString() {
        return String.format("(stop_all_sounds,%s),",options);
    }
}
