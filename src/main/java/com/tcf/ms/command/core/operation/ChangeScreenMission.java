package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;

public class ChangeScreenMission implements Operation {

    

    public ChangeScreenMission() {
             
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_mission),");
    }
}
