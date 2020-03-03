package com.tcf.ms.test;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.SregVariable;
import com.tcf.ms.command.core.operation.FactionSetName;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.StorePartnerFaction;
import com.tcf.ms.command.core.object.handle.slot.FactionSlot;
import com.tcf.ms.command.core.operation.AddFactionNoteFromSreg;
import com.tcf.ms.command.core.operation.AddFactionNoteFromDialog;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.StrStoreFactionName;
import com.tcf.ms.command.core.operation.StrStoreFactionNameLink;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.StrStoreQuestNameLink;
import com.tcf.ms.command.core.operation.StoreFactionOfParty;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.operation.SetRelation;
import com.tcf.ms.command.core.operation.StoreTroopFaction;
import com.tcf.ms.command.core.object.GameString;
import com.tcf.ms.command.core.operation.FactionSetColor;
import com.tcf.ms.command.core.operation.AddFactionNoteTableauMesh;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class FactionHandle {

    private StringVariable variable;

    public FactionHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new FactionSlot(this.variable);
    }

    /**
     *   (store_faction_of_party,<destination>),
     * @return
     */
    public static Operation storeFactionOfParty(Variable destination){
        return new StoreFactionOfParty(destination);
    }

    /**
     *   (add_faction_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public static Operation addFactionNoteTableauMesh(Troop troop,TableauMaterial tableauMaterial){
        return new AddFactionNoteTableauMesh(troop.getVar(),tableauMaterial.getVar());
    }

    /**
     *   (store_troop_faction,<destination>,<troop_id>),
     * @return
     */
    public static Operation storeTroopFaction(Variable destination,Troop troop){
        return new StoreTroopFaction(destination,troop.getVar());
    }

    /**
     *   (store_partner_faction,<destination>),
     * @return
     */
    public static Operation storePartnerFaction(Variable destination){
        return new StorePartnerFaction(destination);
    }

    /**
     *   (add_faction_note_from_dialog,<faction_id>,<note_slot_no>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addFactionNoteFromDialog(Variable noteSlotNo,Variable value){
        return new AddFactionNoteFromDialog(this.variable,noteSlotNo,value);
    }

    /**
     *   (add_faction_note_from_sreg,<faction_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addFactionNoteFromSreg(Variable noteSlotNo,GameString string,Variable value){
        return new AddFactionNoteFromSreg(this.variable,noteSlotNo,string.getVar(),value);
    }

    /**
     *   (str_store_faction_name,<string_register>,<faction_id>),
     * @return
     */
    public Operation strStoreFactionName(SregVariable stringRegister){
        return new StrStoreFactionName(stringRegister.getVar(),this.variable);
    }

    /**
     *   (str_store_quest_name_link,<string_register>,<faction_id>),
     * @return
     */
    public Operation strStoreQuestNameLink(SregVariable stringRegister){
        return new StrStoreQuestNameLink(stringRegister.getVar(),this.variable);
    }

    /**
     *   (faction_set_color, <faction_id>, <value>),
     * @return
     */
    public Operation factionSetColor(Variable value){
        return new FactionSetColor(this.variable,value);
    }

    /**
     *   (set_relation,<faction_id>,<faction_id>,<value>),
     * @return
     */
    public Operation setRelation(Faction faction,Variable value){
        return new SetRelation(this.variable,faction.getVar(),value);
    }

    /**
     *   (str_store_faction_name_link,<string_register>,<faction_id>),
     * @return
     */
    public Operation strStoreFactionNameLink(SregVariable stringRegister){
        return new StrStoreFactionNameLink(stringRegister.getVar(),this.variable);
    }

    /**
     *   (faction_set_name, <faction_id>, <string_id>),
     * @return
     */
    public Operation factionSetName(GameString string){
        return new FactionSetName(this.variable,string.getVar());
    }


}