package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (talk_info_show, <hide_or_show>) :0=hide 1=show
 */
public class TalkInfoShow implements Operation{

    private Variable hideOrShow;

    public TalkInfoShow(Variable hideOrShow) {
        this.hideOrShow = hideOrShow;     
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_show,%s),",hideOrShow);
    }
}
