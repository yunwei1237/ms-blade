package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class StopAllSounds implements Operation {
    /**
     * 选项
     * # 0 = default,
     *   1 = fade out current track,
     *   2 = stop current track
     */
    private Variable options;

    public StopAllSounds() {
    }

    public StopAllSounds(Variable options) {
        this.options = options;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(options) ? String.format("(stop_all_sounds,%s),") : String.format("(play_sound,%s,%s),",options);
    }
}
