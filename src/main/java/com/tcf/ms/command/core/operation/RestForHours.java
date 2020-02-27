package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (rest_for_hours,<rest_period>,[time_speed],[remain_attackable]),
 */
public class RestForHours implements Operation{

    private Variable restPeriod;
    private Variable timeSpeed;
    private Variable remainAttackable;

    public RestForHours(Variable restPeriod,Variable timeSpeed,Variable remainAttackable) {
        this.restPeriod = restPeriod;
        this.timeSpeed = timeSpeed;
        this.remainAttackable = remainAttackable;     
    }

    @Override
    public String toScriptString() {
        return String.format("(rest_for_hours,%s,%s,%s),",restPeriod,timeSpeed,remainAttackable);
    }
}
