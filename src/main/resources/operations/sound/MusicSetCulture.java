package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class MusicSetCulture implements Operation {
    /**
     * 变量
     */
    private Variable musicSetCulture;

    public MusicSetCulture(Variable musicSetCulture) {
        this.musicSetCulture = musicSetCulture;
    }

    @Override
    public String toScriptString() {
        return String.format("(music_set_situation,%s),",musicSetCulture);
    }
}
