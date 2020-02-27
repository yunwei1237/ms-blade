package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (str_store_date,<string_register>,<number_of_days_to_add_to_the_current_date>),
 */
public class StrStoreDate implements Operation{

    private Variable stringRegister;
    private Variable numberOfDaysToAddToTheCurrentDate;

    public StrStoreDate(Variable stringRegister,Variable numberOfDaysToAddToTheCurrentDate) {
        this.stringRegister = stringRegister;
        this.numberOfDaysToAddToTheCurrentDate = numberOfDaysToAddToTheCurrentDate;     
    }

    @Override
    public String toScriptString() {
        return String.format("(str_store_date,%s,%s),",stringRegister,numberOfDaysToAddToTheCurrentDate);
    }
}
