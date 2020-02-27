package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (talk_info_set_relation_bar, <value>) :set relation bar to a value between -100 to 100, enter an invalid value to hide the bar.
 */
public class TalkInfoSetRelationBar implements Operation{

    private Variable value;

    public TalkInfoSetRelationBar(Variable value) {
        this.value = value;     
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_set_relation_bar,%s),",value);
    }
}
