package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class AllEnemiesDefeated implements Operation ,Conditable{

    

    public AllEnemiesDefeated() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(all_enemies_defeated),");
    }
}
