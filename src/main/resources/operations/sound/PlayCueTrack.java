package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 立即播放
 */
public class PlayCueTrack implements Operation {
    /**
     * 变量
     */
    private Variable trackId;

    public PlayCueTrack(Variable trackId) {
        this.trackId = trackId;
    }

    @Override
    public String toScriptString() {
        return String.format("(play_cue_track,%s),",trackId);
    }
}
