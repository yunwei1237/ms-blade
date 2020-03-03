package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.Conditable;

/**
 *   (all_enemies_defeated),
 */
public class AllEnemiesDefeated implements Conditable{

    

    public AllEnemiesDefeated() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(all_enemies_defeated),");
    }
}
