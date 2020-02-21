package com.tcf.ms.command.core.command.var;

import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.AbstractScript;
import com.tcf.ms.command.core.operation.*;

public class VariableScript extends AbstractScript implements VariableOperation {
    
    
    @Override
    public void assign(StringVariable variable,Variable value) {
        appendOperation(new Assign(variable,value));
    }

    @Override
    public void add(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreAdd(variable,value1,value2));
    }

    @Override
    public void sub(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreSub(variable,value1,value2));
    }

    @Override
    public void mul(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreMul(variable,value1,value2));
    }

    @Override
    public void div(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreDiv(variable,value1,value1));
    }

    @Override
    public void mod(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreMod(variable,value1,value2));
    }
    

    @Override
    public void sqrt(StringVariable variable,Variable value) {
        appendOperation(new StoreSqrt(variable,value));
    }

    @Override
    public void pow(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StorePow(variable,value1,value2));
    }

    @Override
    public void sin(StringVariable variable,Variable value) {
        appendOperation(new StoreSin(variable,value));
    }

    @Override
    public void cos(StringVariable variable,Variable value) {
        appendOperation(new StoreSin(variable,value));
    }

    @Override
    public void tan(StringVariable variable,Variable value) {
        appendOperation(new StoreSin(variable,value));
    }

    @Override
    public void and(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreAnd(variable,value1,value2));
    }

    @Override
    public void or(StringVariable variable,Variable value1, Variable value2) {
        appendOperation(new StoreOr(variable,value1,value2));
    }

    @Override
    public void add(StringVariable variable,Variable value) {
        appendOperation(new ValAdd(variable,value));
    }

    @Override
    public void sub(StringVariable variable,Variable value) {
        appendOperation(new ValSub(variable,value));
    }

    @Override
    public void mul(StringVariable variable,Variable value) {
        appendOperation(new ValMul(variable,value));
    }

    @Override
    public void div(StringVariable variable,Variable value) {
        appendOperation((new ValDiv(variable,value)));
    }

    @Override
    public void mod(StringVariable variable,Variable value) {
        appendOperation(new ValMod(variable,value));
    }

    @Override
    public void clamp(StringVariable variable,Variable lowerBound,Variable upperBound) {
        appendOperation(new ValClamp(variable,lowerBound,upperBound));
    }

    @Override
    public void and(StringVariable variable,Variable value) {
        appendOperation(new ValAnd(variable,value));
    }

    @Override
    public void or(StringVariable variable,Variable value) {
        appendOperation(new ValAnd(variable,value));
    }

    @Override
    public void min(StringVariable variable,Variable value) {
        appendOperation(new ValMin(variable,value));
    }

    @Override
    public void max(StringVariable variable,Variable value) {
        appendOperation(new ValMax(variable,value));
        
    }

    @Deprecated
    @Override
    public void random() {
        appendOperation(new StoreRandom());
    }

    @Override
    public void random(StringVariable variable,Variable lower, Variable upper) {
        appendOperation(new StoreRandomInRange(variable,lower,upper));
    }
}
