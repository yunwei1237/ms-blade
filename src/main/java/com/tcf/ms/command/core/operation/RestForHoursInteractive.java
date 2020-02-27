package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (rest_for_hours_interactive,<rest_period>,[time_speed],[remain_attackable]),
 */
public class RestForHoursInteractive implements Operation{

    private Variable restPeriod;
    private Variable timeSpeed;
    private Variable remainAttackable;

    public RestForHoursInteractive(Variable restPeriod,Variable timeSpeed,Variable remainAttackable) {
        this.restPeriod = restPeriod;
        this.timeSpeed = timeSpeed;
        this.remainAttackable = remainAttackable;     
    }

    @Override
    public String toScriptString() {
        return String.format("(rest_for_hours_interactive,%s,%s,%s),",restPeriod,timeSpeed,remainAttackable);
    }
}
