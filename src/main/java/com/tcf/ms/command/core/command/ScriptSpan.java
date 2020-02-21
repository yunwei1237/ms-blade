package com.tcf.ms.command.core.command;


import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.LocalVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.object.handle.AgentHandle;
import com.tcf.ms.command.core.object.handle.PartyHandle;
import com.tcf.ms.command.core.operation.TryEnd;
import com.tcf.ms.command.core.operation.TryForParties;
import com.tcf.ms.command.core.operation.TryForRange;
import com.tcf.ms.command.core.operation.TryForRangeBackwards;

import java.util.function.Function;

/**
 * 代表脚本片段
 */
public class ScriptSpan extends AbstractScript implements ExtendActionOperation{

    @Override
    public void fori(String destination, String lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.local(lower),Variable.local(upper),function);
    }

    @Override
    public void fori(String destination, String lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.local(lower),Variable.number(upper),function);
    }

    @Override
    public void fori(String destination, String lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.local(lower),upper,function);
    }

    @Override
    public void fori(String destination, int lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.number(lower),Variable.local(upper),function);
    }

    @Override
    public void fori(String destination, int lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.number(lower),Variable.number(upper),function);
    }

    @Override
    public void fori(String destination, int lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),Variable.number(lower),upper,function);
    }

    @Override
    public void fori(String destination, Variable lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),lower,Variable.local(upper),function);
    }

    @Override
    public void fori(String destination, Variable lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),lower,Variable.number(upper),function);
    }

    @Override
    public void fori(String destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.fori(Variable.local(destination),lower,upper,function);
    }

    @Override
    public void fori(Variable destination, String lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.local(lower),Variable.local(upper),function);
    }

    @Override
    public void fori(Variable destination, String lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.local(lower),Variable.number(upper),function);
    }

    @Override
    public void fori(Variable destination, String lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.local(lower),upper,function);
    }

    @Override
    public void fori(Variable destination, int lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.number(lower),Variable.local(upper),function);
    }

    @Override
    public void fori(Variable destination, int lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.number(lower),Variable.number(upper),function);
    }

    @Override
    public void fori(Variable destination, int lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,Variable.number(lower),upper,function);
    }

    @Override
    public void fori(Variable destination, Variable lower, String upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,lower,Variable.local(upper),function);
    }

    @Override
    public void fori(Variable destination, Variable lower, int upper, Function<Variable, ActionOperation> function) {
        this.fori(destination,lower,Variable.number(upper),function);
    }

    @Override
    public IfOperation If(ConditionOperation condition, ActionOperation action) {
        return null;
    }

    @Override
    public void fori(Variable destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function) {
        appendOperation(new TryForRange(destination,lower,upper));
        appendOperation(function.apply(destination));
        appendOperation(new TryEnd());
    }

    @Override
    public void foriReverse(String destination, String lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.local(lower),Variable.local(upper),function);
    }

    @Override
    public void foriReverse(String destination, String lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.local(lower),Variable.number(upper),function);
    }

    @Override
    public void foriReverse(String destination, String lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.local(lower),upper,function);
    }

    @Override
    public void foriReverse(String destination, int lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.number(lower),Variable.local(upper),function);
    }

    @Override
    public void foriReverse(String destination, int lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.number(lower),Variable.number(upper),function);
    }

    @Override
    public void foriReverse(String destination, int lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),Variable.number(lower),upper,function);
    }

    @Override
    public void foriReverse(String destination, Variable lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),lower,Variable.local(upper),function);
    }

    @Override
    public void foriReverse(String destination, Variable lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),lower,Variable.number(upper),function);
    }

    @Override
    public void foriReverse(String destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(Variable.local(destination),lower,upper,function);
    }

    @Override
    public void foriReverse(Variable destination, String lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.local(lower),Variable.local(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, String lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.local(lower),Variable.number(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, String lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.local(lower),upper,function);
    }

    @Override
    public void foriReverse(Variable destination, int lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.number(lower),Variable.local(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, int lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.number(lower),Variable.number(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, int lower, Variable upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,Variable.number(lower),upper,function);
    }

    @Override
    public void foriReverse(Variable destination, Variable lower, String upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,lower,Variable.local(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, Variable lower, int upper, Function<Variable, ActionOperation> function) {
        this.foriReverse(destination,lower,Variable.number(upper),function);
    }

    @Override
    public void foriReverse(Variable destination, Variable lower, Variable upper, Function<Variable, ActionOperation> function) {
        appendOperation(new TryForRangeBackwards(destination,lower,upper));
        appendOperation(function.apply(destination));
        appendOperation(new TryEnd());
    }

    @Override
    public void forParties(Function<PartyHandle, ActionOperation> function) {
        LocalVariable party = Variable.local("party");
        appendOperation(new TryForParties(party));
        appendOperation(function.apply(new PartyHandle(party,this)));
        appendOperation(new TryEnd());
    }

    @Override
    public void forAgents(Function<AgentHandle, ActionOperation> function) {
        LocalVariable agent = Variable.local("agent");
        appendOperation(new TryForParties(agent));
        appendOperation(function.apply(new AgentHandle(agent)));
        appendOperation(new TryEnd());
    }

    /**
     * 外部添加操作
     * @param operation
     */
    public void out(Operation operation){
        appendOperation(operation);
    }
}
