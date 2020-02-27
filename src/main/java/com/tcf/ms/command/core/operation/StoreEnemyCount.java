package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (store_enemy_count,<destination>),
 */
public class StoreEnemyCount implements Operation{

    private Variable destination;

    public StoreEnemyCount(Variable destination) {
        this.destination = destination;     
    }

    @Override
    public String toScriptString() {
        return String.format("(store_enemy_count,%s),",destination);
    }
}
