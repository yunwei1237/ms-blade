package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (play_sound,<sound_id>,[options]),
 */
public class PlaySound implements Operation{

    private Variable soundId;
    private Variable options;

    public PlaySound(Variable soundId,Variable options) {
        this.soundId = soundId;
        this.options = options;     
    }

    @Override
    public String toScriptString() {
        return String.format("(play_sound,%s,%s),",soundId,options);
    }
}
