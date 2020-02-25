package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.base.BladeException;

/**
 * 代表是reg变量
 */
public class RegVariable extends NumberVariable {

    public RegVariable(int value) {
        super(value);
        if(value < 0 || value > 65){
            throw new BladeException("reg变量的最值范围为0到65，您的取值为：" + value);
        }
    }

    @Override
    public String toScriptString() {
        return String.format("reg%s",this.number);
    }
}
