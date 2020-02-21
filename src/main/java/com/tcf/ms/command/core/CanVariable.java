package com.tcf.ms.command.core;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 将转换成变量的功能
 */
public interface CanVariable {
    /**
     * 将一个对象转换成变量对象
     * @return
     */
    Variable getVar();

    /**
     * 设置变量到一个对象中
     * @param variable
     */
    void setVar(StringVariable variable);
}
