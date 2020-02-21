package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class MainHeroFallen implements Operation ,Conditable{

    

    public MainHeroFallen() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(main_hero_fallen),");
    }
}
