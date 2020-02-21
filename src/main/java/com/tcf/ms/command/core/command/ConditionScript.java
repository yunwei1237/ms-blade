package com.tcf.ms.command.core.command;

import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.*;

import java.util.function.Supplier;

public class ConditionScript extends AbstractScript implements ExtendConditionOperation {
    @Override
    public Conditable eq(String value1, String value2) {
        return new Eq(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable eq(String value1, int value2) {
        return new Eq(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable eq(String value1, Variable value2) {
        return new Eq(Variable.local(value1),value2);
    }

    @Override
    public Conditable eq(int value1, String value2) {
        return new Eq(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable eq(int value1, int value2) {
        return new Eq(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable eq(int value1, Variable value2) {
        return new Eq(Variable.number(value1),value2);
    }

    @Override
    public Conditable eq(Variable value1, String value2) {
        return new Eq(value1,Variable.local(value2));
    }

    @Override
    public Conditable eq(Variable value1, int value2) {
        return new Eq(value1,Variable.number(value2));
    }

    @Override
    public Conditable eq(Variable value1, Variable value2) {
        return new Eq(value1,value2);
    }

    @Override
    public Conditable neq(String value1, String value2) {
        return new Neq(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable neq(String value1, int value2) {
        return new Neq(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable neq(String value1, Variable value2) {
        return new Neq(Variable.local(value1),value2);
    }

    @Override
    public Conditable neq(int value1, String value2) {
        return new Neq(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable neq(int value1, int value2) {
        return new Neq(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable neq(int value1, Variable value2) {
        return new Neq(Variable.number(value1),value2);
    }

    @Override
    public Conditable neq(Variable value1, String value2) {
        return new Neq(value1,Variable.local(value2));
    }

    @Override
    public Conditable neq(Variable value1, int value2) {
        return new Neq(value1,Variable.number(value2));
    }

    @Override
    public Conditable neq(Variable value1, Variable value2) {
        return new Neq(value1,value2);
    }

    @Override
    public Conditable gt(String value1, String value2) {
        return new Gt(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable gt(String value1, int value2) {
        return new Gt(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable gt(String value1, Variable value2) {
        return new Gt(Variable.local(value1),value2);
    }

    @Override
    public Conditable gt(int value1, String value2) {
        return new Gt(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable gt(int value1, int value2) {
        return new Gt(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable gt(int value1, Variable value2) {
        return new Gt(Variable.number(value1),value2);
    }

    @Override
    public Conditable gt(Variable value1, String value2) {
        return new Gt(value1,Variable.local(value2));
    }

    @Override
    public Conditable gt(Variable value1, int value2) {
        return new Gt(value1,Variable.number(value2));
    }

    @Override
    public Conditable gt(Variable value1, Variable value2) {
        return new Gt(value1,value2);
    }

    @Override
    public Conditable ge(String value1, String value2) {
        return new Ge(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable ge(String value1, int value2) {
        return new Ge(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable ge(String value1, Variable value2) {
        return new Ge(Variable.local(value1),value2);
    }

    @Override
    public Conditable ge(int value1, String value2) {
        return new Ge(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable ge(int value1, int value2) {
        return new Ge(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable ge(int value1, Variable value2) {
        return new Ge(Variable.number(value1),value2);
    }

    @Override
    public Conditable ge(Variable value1, String value2) {
        return new Ge(value1,Variable.local(value2));
    }

    @Override
    public Conditable ge(Variable value1, int value2) {
        return new Ge(value1,Variable.number(value2));
    }

    @Override
    public Conditable ge(Variable value1, Variable value2) {
        return new Ge(value1,value2);
    }

    @Override
    public Conditable lt(String value1, String value2) {
        return new Lt(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable lt(String value1, int value2) {
        return new Lt(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable lt(String value1, Variable value2) {
        return new Lt(Variable.local(value1),value2);
    }

    @Override
    public Conditable lt(int value1, String value2) {
        return new Lt(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable lt(int value1, int value2) {
        return new Lt(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable lt(int value1, Variable value2) {
        return new Lt(Variable.number(value1),value2);
    }

    @Override
    public Conditable lt(Variable value1, String value2) {
        return new Lt(value1,Variable.local(value2));
    }

    @Override
    public Conditable lt(Variable value1, int value2) {
        return new Lt(value1,Variable.number(value2));
    }

    @Override
    public Conditable lt(Variable value1, Variable value2) {
        return new Lt(value1,value2);
    }

    @Override
    public Conditable le(String value1, String value2) {
        return new Le(Variable.local(value1),Variable.local(value2));
    }

    @Override
    public Conditable le(String value1, int value2) {
        return new Le(Variable.local(value1),Variable.number(value2));
    }

    @Override
    public Conditable le(String value1, Variable value2) {
        return new Le(Variable.local(value1),value2);
    }

    @Override
    public Conditable le(int value1, String value2) {
        return new Le(Variable.number(value1),Variable.local(value2));
    }

    @Override
    public Conditable le(int value1, int value2) {
        return new Le(Variable.number(value1),Variable.number(value2));
    }

    @Override
    public Conditable le(int value1, Variable value2) {
        return new Le(Variable.number(value1),value2);
    }

    @Override
    public Conditable le(Variable value1, String value2) {
        return new Le(value1,Variable.local(value2));
    }

    @Override
    public Conditable le(Variable value1, int value2) {
        return new Le(value1,Variable.number(value2));
    }

    @Override
    public Conditable le(Variable value1, Variable value2) {
        return new Le(value1,value2);
    }

    @Override
    public Conditable between(String destination, String lowerBound, String upperBound) {
        return new IsBetween(Variable.local(destination),Variable.local(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(String destination, String lowerBound, int upperBound) {
        return new IsBetween(Variable.local(destination),Variable.local(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(String destination, String lowerBound, Variable upperBound) {
        return new IsBetween(Variable.local(destination),Variable.local(lowerBound),upperBound);
    }

    @Override
    public Conditable between(String destination, int lowerBound, String upperBound) {
        return new IsBetween(Variable.local(destination),Variable.number(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(String destination, int lowerBound, int upperBound) {
        return new IsBetween(Variable.local(destination),Variable.number(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(String destination, int lowerBound, Variable upperBound) {
        return new IsBetween(Variable.local(destination),Variable.number(lowerBound),upperBound);
    }

    @Override
    public Conditable between(String destination, Variable lowerBound, String upperBound) {
        return new IsBetween(Variable.local(destination),lowerBound,Variable.local(upperBound));
    }

    @Override
    public Conditable between(String destination, Variable lowerBound, int upperBound) {
        return new IsBetween(Variable.local(destination),lowerBound,Variable.number(upperBound));
    }

    @Override
    public Conditable between(String destination, Variable lowerBound, Variable upperBound) {
        return new IsBetween(Variable.local(destination),lowerBound,upperBound);
    }

    @Override
    public Conditable between(int destination, String lowerBound, String upperBound) {
        return new IsBetween(Variable.number(destination),Variable.local(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(int destination, String lowerBound, int upperBound) {
        return new IsBetween(Variable.number(destination),Variable.local(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(int destination, String lowerBound, Variable upperBound) {
        return new IsBetween(Variable.number(destination),Variable.local(lowerBound),upperBound);
    }

    @Override
    public Conditable between(int destination, int lowerBound, String upperBound) {
        return new IsBetween(Variable.number(destination),Variable.number(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(int destination, int lowerBound, int upperBound) {
        return new IsBetween(Variable.number(destination),Variable.number(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(int destination, int lowerBound, Variable upperBound) {
        return new IsBetween(Variable.number(destination),Variable.number(lowerBound),upperBound);
    }

    @Override
    public Conditable between(int destination, Variable lowerBound, String upperBound) {
        return new IsBetween(Variable.number(destination),lowerBound,Variable.local(upperBound));
    }

    @Override
    public Conditable between(int destination, Variable lowerBound, int upperBound) {
        return new IsBetween(Variable.number(destination),lowerBound,Variable.number(upperBound));
    }

    @Override
    public Conditable between(int destination, Variable lowerBound, Variable upperBound) {
        return new IsBetween(Variable.number(destination),lowerBound,upperBound);
    }

    @Override
    public Conditable between(Variable destination, String lowerBound, String upperBound) {
        return new IsBetween(destination,Variable.local(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(Variable destination, String lowerBound, int upperBound) {
        return new IsBetween(destination,Variable.local(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(Variable destination, String lowerBound, Variable upperBound) {
        return new IsBetween(destination,Variable.local(lowerBound),upperBound);
    }

    @Override
    public Conditable between(Variable destination, int lowerBound, String upperBound) {
        return new IsBetween(destination,Variable.number(lowerBound),Variable.local(upperBound));
    }

    @Override
    public Conditable between(Variable destination, int lowerBound, int upperBound) {
        return new IsBetween(destination,Variable.number(lowerBound),Variable.number(upperBound));
    }

    @Override
    public Conditable between(Variable destination, int lowerBound, Variable upperBound) {
        return new IsBetween(destination,Variable.number(lowerBound),upperBound);
    }

    @Override
    public Conditable between(Variable destination, Variable lowerBound, String upperBound) {
        return new IsBetween(destination,lowerBound,Variable.local(upperBound));
    }

    @Override
    public Conditable between(Variable destination, Variable lowerBound, int upperBound) {
        return new IsBetween(destination,lowerBound,Variable.number(upperBound));
    }

    @Override
    public Conditable between(Variable destination, Variable lowerBound, Variable upperBound) {
        return new IsBetween(destination,lowerBound,upperBound);
    }

    @Override
    public void and(Conditable... conditables) {
        for (Conditable conditable : conditables) {
            if(conditable != null){
                appendOperation(conditable);
            }
        }
    }

    @Override
    public void or(Conditable... conditables) {
        for (Conditable conditable : conditables) {
            if(conditable != null) {
                appendOperation(new ThisOrNext(conditable));
            }
        }
    }

    @Override
    public void not(Conditable... conditables) {
        for (Conditable conditable : conditables) {
            if(conditable != null) {
                appendOperation(new Neg(conditable));
            }
        }
    }

    @Override
    public void group(Supplier<ConditableGroup> function) {
        appendOperations(function.get().getGroup().getOperations());
    }
}
