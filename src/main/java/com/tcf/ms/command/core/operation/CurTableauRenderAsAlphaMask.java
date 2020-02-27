package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (cur_tableau_render_as_alpha_mask)
 */
public class CurTableauRenderAsAlphaMask implements Operation{

    

    public CurTableauRenderAsAlphaMask() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(cur_tableau_render_as_alpha_mask),");
    }
}
