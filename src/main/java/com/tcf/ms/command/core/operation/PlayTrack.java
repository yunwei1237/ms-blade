package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (play_track,<track_id>, [options]),   0 = default, 1 = fade out current track, 2 = stop current track
 */
public class PlayTrack implements Operation{

    private Variable trackId;
    private Variable options;

    public PlayTrack(Variable trackId,Variable options) {
        this.trackId = trackId;
        this.options = options;     
    }

    @Override
    public String toScriptString() {
        return String.format("(play_track,%s,%s),",trackId,options);
    }
}
