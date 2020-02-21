package com.tcf.ms.command.core;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;

/**
 * 将一个变量转换成对象
 */
public interface CanObject {
    /**
     * 将一个变量转换成可操作对象
     * @param var
     * @param <T>
     * @return
     */
    <T> T getObj(StringVariable var);
}
