package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (talk_info_set_line, <line_no>, <string_no>)
 */
public class TalkInfoSetLine implements Operation{

    private Variable lineNo;
    private Variable stringNo;

    public TalkInfoSetLine(Variable lineNo,Variable stringNo) {
        this.lineNo = lineNo;
        this.stringNo = stringNo;     
    }

    @Override
    public String toScriptString() {
        return String.format("(talk_info_set_line,%s,%s),",lineNo,stringNo);
    }
}
