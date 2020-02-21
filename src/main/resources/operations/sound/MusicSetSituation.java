package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class MusicSetSituation implements Operation {
    /**
     * 变量
     */
    private Variable situationType;

    public MusicSetSituation(Variable situationType) {
        this.situationType = situationType;
    }

    @Override
    public String toScriptString() {
        return String.format("(music_set_situation,%s),",situationType);
    }
}
