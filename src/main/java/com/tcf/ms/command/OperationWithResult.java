package com.tcf.ms.command;

import com.tcf.ms.command.core.CanVariable;

public interface OperationWithResult extends Operation {
    /**
     * 获得对象的值
     * @return
     */
    <T> T get(Class<? extends CanVariable> clazz);
}
