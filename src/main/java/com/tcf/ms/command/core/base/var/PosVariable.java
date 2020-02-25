package com.tcf.ms.command.core.base.var;

import com.tcf.ms.command.core.base.BladeException;

/**
 * 代表pos变量，位置变量
 */
public class PosVariable extends NumberVariable {

    public PosVariable(int value) {
        super(value);
        if(value < 0 || value > 63){
            throw new BladeException("reg变量的最值范围为0到63，您的取值为：" + value);
        }
    }

    @Override
    public String toScriptString() {
        return String.format("pos%s",this.number);
    }
}
