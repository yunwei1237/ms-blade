package com.tcf.ms.command.core.command;

/**
 * if脚本
 */
public interface IfOperation {
    /**
     * elseif的功能
     * @param condition  条件
     * @param action 操作
     * @return
     */
    IfOperation ElseIf(ConditionOperation condition, ActionOperation action);

    /**
     * else的功能
     * @param action
     * @return
     */
    void Else(ActionOperation action);
}
