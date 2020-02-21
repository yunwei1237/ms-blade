package com.tcf.ms.command.core.command.var;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.AbstractScript;
import com.tcf.ms.command.core.operation.*;

@Deprecated
public class StringVariableScript extends AbstractScript implements StringVariableOperation {

    /**
     * 当前变量
     */
    private StringVariable variable;


    public StringVariableScript(StringVariable variable) {
        this.variable = variable;
    }

    @Override
    public StringVariableOperation assign(StringVariable variable) {
        appendOperation(new Assign(variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation add(Variable variable1, Variable variable2) {
        appendOperation(new StoreAdd(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation sub(Variable variable1, Variable variable2) {
        appendOperation(new StoreSub(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation mul(Variable variable1, Variable variable2) {
        appendOperation(new StoreMul(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation div(Variable variable1, Variable variable2) {
        appendOperation(new StoreDiv(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation mod(Variable variable1, Variable variable2) {
        appendOperation(new StoreMod(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation sqrt() {
        appendOperation(new StoreSqrt(this.variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation sqrt(StringVariable variable) {
        appendOperation(new StoreSqrt(variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation pow(Variable variable1, Variable variable2) {
        appendOperation(new StorePow(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation sin() {
        appendOperation(new StoreSin(this.variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation sin(Variable variable) {
        appendOperation(new StoreSin(variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation cos() {
        appendOperation(new StoreCos(this.variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation cos(Variable variable) {
        appendOperation(new StoreSin(variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation tan() {
        appendOperation(new StoreSin(this.variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation tan(Variable variable) {
        appendOperation(new StoreSin(variable,this.variable));
        return this;
    }

    @Override
    public StringVariableOperation and(Variable variable1, Variable variable2) {
        appendOperation(new StoreAnd(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation or(Variable variable1, Variable variable2) {
        appendOperation(new StoreOr(this.variable,variable1,variable2));
        return this;
    }

    @Override
    public StringVariableOperation add(Variable variable) {
        appendOperation(new ValAdd(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation sub(Variable variable) {
        appendOperation(new ValSub(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation mul(Variable variable) {
        appendOperation(new ValMul(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation div(Variable variable) {
        appendOperation((new ValDiv(this.variable,variable)));
        return this;
    }

    @Override
    public StringVariableOperation mod(Variable variable) {
        appendOperation(new ValMod(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation clamp(Variable lowerBound,Variable upperBound) {
        appendOperation(new ValClamp(this.variable,lowerBound,upperBound));
        return this;
    }

    @Override
    public StringVariableOperation abs() {
        appendOperation(new ValAbs(this.variable));
        return this;
    }

    @Override
    public StringVariableOperation and(Variable variable) {
        appendOperation(new ValAnd(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation or(Variable variable) {
        appendOperation(new ValAnd(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation min(Variable variable) {
        appendOperation(new ValMin(this.variable,variable));
        return this;
    }

    @Override
    public StringVariableOperation max(Variable variable) {
        appendOperation(new ValMax(this.variable,variable));
        return this;
    }

    @Deprecated
    @Override
    public StringVariableOperation random() {
        appendOperation(new StoreRandom());
        return this;
    }

    @Override
    public StringVariableOperation random(Variable lower, Variable upper) {
        appendOperation(new StoreRandomInRange(this.variable,lower,upper));
        return this;
    }
}
