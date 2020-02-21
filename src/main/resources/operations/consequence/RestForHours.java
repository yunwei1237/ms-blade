package com.tcf.ms.command.core.operations.consequence;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class RestForHours implements Operation {
    /**
     * 休息时间
     */
    private Variable restPeriod;
    /**
     * 时间速率
     */
    private Variable timeSpeed;
    /**
     * 还有多久可以被攻击
     */
    private Variable remainAttackable;

    public RestForHours(Variable restPeriod) {
        this(restPeriod,null,null);
    }

    public RestForHours(Variable restPeriod, Variable timeSpeed) {
        this(restPeriod,timeSpeed,null);
    }

    public RestForHours(Variable restPeriod, Variable timeSpeed, Variable remainAttackable) {
        this.restPeriod = restPeriod;
        this.timeSpeed = timeSpeed;
        this.remainAttackable = remainAttackable;
    }

    @Override
    public String toScriptString() {
        if(restPeriod != null && timeSpeed != null && remainAttackable != null){
            return String.format("(rest_for_hours,%s,%s,%s),",restPeriod,timeSpeed,remainAttackable);
        }else if(restPeriod != null && timeSpeed != null && remainAttackable == null){
            return String.format("(rest_for_hours,%s,%s),",restPeriod,timeSpeed);
        }else {
            return String.format("(rest_for_hours,%s),",restPeriod);
        }
    }
}
