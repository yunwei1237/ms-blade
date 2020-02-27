package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (music_set_situation, <situation_type>),
 */
public class MusicSetSituation implements Operation{

    private Variable situationType;

    public MusicSetSituation(Variable situationType) {
        this.situationType = situationType;     
    }

    @Override
    public String toScriptString() {
        return String.format("(music_set_situation,%s),",situationType);
    }
}
