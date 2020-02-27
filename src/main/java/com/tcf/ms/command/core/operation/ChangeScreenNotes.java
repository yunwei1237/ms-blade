package com.tcf.ms.command.core.operation;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

/**
 *   (change_screen_notes, <note_type>, <object_id>),  Note type can be 1 = troops, 2 = factions, 3 = parties, 4 = quests
 */
public class ChangeScreenNotes implements Operation{

    private Variable noteType;
    private Variable objectId;

    public ChangeScreenNotes(Variable noteType,Variable objectId) {
        this.noteType = noteType;
        this.objectId = objectId;     
    }

    @Override
    public String toScriptString() {
        return String.format("(change_screen_notes,%s,%s),",noteType,objectId);
    }
}
