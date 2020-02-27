package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (set_camera_follow_party,<party_id>),  Works on map only.
 */
public class SetCameraFollowParty implements Operation{

    private Variable partyId;

    public SetCameraFollowParty(Variable partyId) {
        this.partyId = partyId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(set_camera_follow_party,%s),",partyId);
    }
}
