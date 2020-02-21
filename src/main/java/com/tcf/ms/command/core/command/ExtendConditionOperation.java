package com.tcf.ms.command.core.command;

import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.Variable;

public interface ExtendConditionOperation extends ConditionOperation {
    Conditable eq(String value1, String value2);
    Conditable eq(String value1,int value2);
    Conditable eq(String value1,Variable value2);
    Conditable eq(int value1,String value2);
    Conditable eq(int value1,int value2);
    Conditable eq(int value1,Variable value2);
    Conditable eq(Variable value1,String value2);
    Conditable eq(Variable value1,int value2);
    Conditable eq(Variable value1,Variable value2);
    Conditable neq(String value1,String value2);
    Conditable neq(String value1,int value2);
    Conditable neq(String value1,Variable value2);
    Conditable neq(int value1,String value2);
    Conditable neq(int value1,int value2);
    Conditable neq(int value1,Variable value2);
    Conditable neq(Variable value1,String value2);
    Conditable neq(Variable value1,int value2);
    Conditable neq(Variable value1,Variable value2);
    Conditable gt(String value1,String value2);
    Conditable gt(String value1,int value2);
    Conditable gt(String value1,Variable value2);
    Conditable gt(int value1,String value2);
    Conditable gt(int value1,int value2);
    Conditable gt(int value1,Variable value2);
    Conditable gt(Variable value1,String value2);
    Conditable gt(Variable value1,int value2);
    Conditable gt(Variable value1,Variable value2);
    Conditable ge(String value1,String value2);
    Conditable ge(String value1,int value2);
    Conditable ge(String value1,Variable value2);
    Conditable ge(int value1,String value2);
    Conditable ge(int value1,int value2);
    Conditable ge(int value1,Variable value2);
    Conditable ge(Variable value1,String value2);
    Conditable ge(Variable value1,int value2);
    Conditable ge(Variable value1,Variable value2);
    Conditable lt(String value1,String value2);
    Conditable lt(String value1,int value2);
    Conditable lt(String value1,Variable value2);
    Conditable lt(int value1,String value2);
    Conditable lt(int value1,int value2);
    Conditable lt(int value1,Variable value2);
    Conditable lt(Variable value1,String value2);
    Conditable lt(Variable value1,int value2);
    Conditable lt(Variable value1,Variable value2);
    Conditable le(String value1,String value2);
    Conditable le(String value1,int value2);
    Conditable le(String value1,Variable value2);
    Conditable le(int value1,String value2);
    Conditable le(int value1,int value2);
    Conditable le(int value1,Variable value2);
    Conditable le(Variable value1,String value2);
    Conditable le(Variable value1,int value2);
    Conditable le(Variable value1,Variable value2);
    Conditable between(String destination,String lowerBound,String upperBound);
    Conditable between(String destination,String lowerBound,int upperBound);
    Conditable between(String destination,String lowerBound,Variable upperBound);
    Conditable between(String destination,int lowerBound,String upperBound);
    Conditable between(String destination,int lowerBound,int upperBound);
    Conditable between(String destination,int lowerBound,Variable upperBound);
    Conditable between(String destination, Variable lowerBound, String upperBound);
    Conditable between(String destination,Variable lowerBound,int upperBound);
    Conditable between(String destination,Variable lowerBound,Variable upperBound);
    Conditable between(int destination,String lowerBound,String upperBound);
    Conditable between(int destination,String lowerBound,int upperBound);
    Conditable between(int destination,String lowerBound,Variable upperBound);
    Conditable between(int destination,int lowerBound,String upperBound);
    Conditable between(int destination,int lowerBound,int upperBound);
    Conditable between(int destination,int lowerBound,Variable upperBound);
    Conditable between(int destination,Variable lowerBound,String upperBound);
    Conditable between(int destination,Variable lowerBound,int upperBound);
    Conditable between(int destination,Variable lowerBound,Variable upperBound);
    Conditable between(Variable destination,String lowerBound,String upperBound);
    Conditable between(Variable destination,String lowerBound,int upperBound);
    Conditable between(Variable destination,String lowerBound,Variable upperBound);
    Conditable between(Variable destination,int lowerBound,String upperBound);
    Conditable between(Variable destination,int lowerBound,int upperBound);
    Conditable between(Variable destination,int lowerBound,Variable upperBound);
    Conditable between(Variable destination,Variable lowerBound,String upperBound);
    Conditable between(Variable destination,Variable lowerBound,int upperBound);
    Conditable between(Variable destination,Variable lowerBound,Variable upperBound);
}
