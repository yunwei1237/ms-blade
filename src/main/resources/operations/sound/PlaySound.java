package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class PlaySound implements Operation {
    /**
     * 变量
     */
    private Variable soundId;
    /**
     * 选项
     * # 0 = default,
     *   1 = fade out current track,
     *   2 = stop current track
     */
    private Variable options;


    public PlaySound(Variable soundId,Variable options) {
        this.soundId = soundId;
        this.options = options;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(options) ? String.format("(play_sound,%s),",soundId) : String.format("(play_sound,%s,%s),",soundId,options);
    }
}
