package com.tcf.ms.command.core.command;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.object.handle.AgentHandle;
import com.tcf.ms.command.core.object.handle.PartyHandle;

import java.util.function.Function;

/**
 * 操作相关的脚本
 */
public interface ActionOperation extends Operation {
    /**
     * if条件判断
     * @param condition  条件
     * @param action 操作
     * @return
     */
    IfOperation If(ConditionOperation condition, ActionOperation action);

    /**
     * 范围循环，
     * @param destion
     * @param lower  包含
     * @param upper 不包含
     * @param function
     * @return
     */
    void fori(Variable destion, Variable lower, Variable upper, Function<Variable, ActionOperation> function);

    /**
     * 范围循环，逆向
     * @param destion
     * @param lower 包含
     * @param upper 不包含
     * @param function
     * @return
     */
    void foriReverse(Variable destion, Variable lower, Variable upper, Function<Variable, ActionOperation> function);

    /**
     * 队伍循环（城镇，城堡，村庄，队伍）
     * @param function
     * @return
     */
    void forParties(Function<PartyHandle, ActionOperation> function);

    /**
     * 战场人员循环（英雄，士兵，马匹）
     * @param function
     * @return
     */
    void forAgents(Function<AgentHandle, ActionOperation> function);

    /**
     * 用于执行本脚本外的语句
     * @param operation
     * @return 执行没有返回值的操作
     */
    void action(Operation operation);

    /**
     * 用于执行本脚本外的语句，可同时执行
     * @param operations
     * @return 执行没有返回值的操作
     */
    void actions(Operation...operations);
    /**
     * 用于执行本脚本外的语句
     * @param operation
     * @return 如果操作有结果值，就返回，如果没有就返回null
     */
    OperationWithResult actionWithResult(OperationWithResult operation);
}
