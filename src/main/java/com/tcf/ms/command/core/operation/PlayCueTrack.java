package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (play_cue_track,<track_id>),  starts immediately
 */
public class PlayCueTrack implements Operation{

    private Variable trackId;

    public PlayCueTrack(Variable trackId) {
        this.trackId = trackId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(play_cue_track,%s),",trackId);
    }
}
