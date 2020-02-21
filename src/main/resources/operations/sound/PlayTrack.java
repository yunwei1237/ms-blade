package com.tcf.ms.command.core.operations.sound;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Objects;

public class PlayTrack implements Operation {
    /**
     * 变量
     */
    private Variable trackId;
    /**
     * 选项
     * # 0 = default,
     *   1 = fade out current track,
     *   2 = stop current track
     */
    private Variable options;


    public PlayTrack(Variable trackId, Variable options) {
        this.trackId = trackId;
        this.options = options;
    }

    @Override
    public String toScriptString() {
        return Objects.isNull(options) ? String.format("(play_track,%s),",trackId) : String.format("(play_track,%s,%s),",trackId,options);
    }
}
