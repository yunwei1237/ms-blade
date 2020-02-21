package com.tcf.ms.command.core.base;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

import java.util.Arrays;
import java.util.stream.Collectors;


/**
 * 代表一个函数
 */
public class Function implements Operation {

    /**
     * 函数名称
     */
    private String method;

    /**
     * 函数的参数
     */
    private Variable[] params;

    public Function(String method, Variable...params) {
        this.method = method;
        this.params = params;
    }

    @Override
    public String toScriptString() {
        return String.format("%s(%s)",method,String.join(",", Arrays.stream(params).map(param->param.toString()).collect(Collectors.toList())));
    }
}
