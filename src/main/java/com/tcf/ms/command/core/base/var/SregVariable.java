package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.base.BladeException;

/**
 * 代表sreg变量
 */
public class SregVariable extends NumberVariable {

    public SregVariable(int value) {
        super(value);
        if(value < 0 || value > 67){
            throw new BladeException("sreg的变量范围为0到67,您的取值为：" + value);
        }
    }

    @Override
    public String toScriptString() {
        return String.format("s%s",this.number);
    }
}
