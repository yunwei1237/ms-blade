package com.tcf.ms;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.var.VariableScript;
import org.junit.Test;

public class VariableTest {

    @Test
    public void test(){
        Operation abs = (Operation)Variable.local("age").ops().add(Variable.local("name")).add(Variable.number(18)).random(Variable.number(0),Variable.number(22)).assign(Variable.local("test"));

        System.out.println(abs.toScriptString());

    }

    @Test
    public void test2(){
        VariableScript variableScript = new VariableScript(){{
           assign(Variable.local("age"),Variable.number(0));
           add(Variable.local("age"), Variable.global("times"));
           mul(Variable.local("age"),Variable.number(3));
        }};

        System.out.println(variableScript.toScriptString());
    }
}
