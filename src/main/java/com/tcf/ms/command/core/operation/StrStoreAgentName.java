package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_agent_name,<string_register>,<agent_id>),
 */
public class StrStoreAgentName implements Operation{

    private Variable stringRegister;
    private Variable agentId;

    public StrStoreAgentName(Variable stringRegister,Variable agentId) {
        this.stringRegister = stringRegister;
        this.agentId = agentId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_agent_name,%s,%s),",stringRegister,agentId);
    }
}
