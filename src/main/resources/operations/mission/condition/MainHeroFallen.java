package com.tcf.ms.command.core.operations.mission.condition;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;

public class MainHeroFallen implements Operation , Conditable {
    @Override
    public String toScriptString() {
        return "(main_hero_fallen),";
    }
}
