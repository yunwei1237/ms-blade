package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_give_members),
 */
public class ChangeScreenGiveMembers implements Operation{

    

    public ChangeScreenGiveMembers() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_give_members),");
    }
}
