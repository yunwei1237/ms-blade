package com.tcf.ms.test;

import com.tcf.ms.command.core.base.var.SregVariable;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.AddQuestNoteFromDialog;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.SetupQuestText;
import com.tcf.ms.command.core.operation.FailQuest;
import com.tcf.ms.command.core.operation.CompleteQuest;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.operation.SetupQuestGiver;
import com.tcf.ms.command.core.operation.StoreQuestTroop;
import com.tcf.ms.command.core.operation.ConcludeQuest;
import com.tcf.ms.command.core.operation.StrStoreQuestName;
import com.tcf.ms.command.core.operation.SucceedQuest;
import com.tcf.ms.command.core.operation.AddQuestNoteTableauMesh;
import com.tcf.ms.command.core.operation.CheckQuestFailed;
import com.tcf.ms.command.core.operation.StoreQuestNumber;
import com.tcf.ms.command.core.operation.StoreQuestItem;
import com.tcf.ms.command.core.operation.AddQuestNoteFromSreg;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.StartQuest;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.CheckQuestFinished;
import com.tcf.ms.command.core.operation.CheckQuestSucceeded;
import com.tcf.ms.command.core.operation.StoreRandomQuestInRange;
import com.tcf.ms.command.core.operation.CancelQuest;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.StorePartnerQuest;
import com.tcf.ms.command.core.operation.CheckQuestConcluded;
import com.tcf.ms.command.core.object.handle.slot.QuestSlot;
import com.tcf.ms.command.core.operation.StrStoreQuestNameLink;
import com.tcf.ms.command.core.operation.SetQuestProgression;
import com.tcf.ms.command.core.operation.CheckQuestActive;
import com.tcf.ms.command.core.operation.QuestionBox;
import com.tcf.ms.command.core.object.GameString;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class QuestHandle {

    private StringVariable variable;

    public QuestHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new QuestSlot(this.variable);
    }

    /**
     *   (question_box,<string_id>, [<yes_string_id>], [<no_string_id>]),
     * @return
     */
    public static Operation questionBox(GameString string,Variable yesStringId,Variable noStringId){
        return new QuestionBox(string.getVar(),yesStringId,noStringId);
    }

    /**
     *   (str_store_quest_name_link,<string_register>,<faction_id>),
     * @return
     */
    public static Operation strStoreQuestNameLink(SregVariable stringRegister,Faction faction){
        return new StrStoreQuestNameLink(stringRegister.getVar(),faction.getVar());
    }

    /**
     *   (add_quest_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public static Operation addQuestNoteTableauMesh(Troop troop,TableauMaterial tableauMaterial){
        return new AddQuestNoteTableauMesh(troop.getVar(),tableauMaterial.getVar());
    }

    /**
     *   (store_quest_troop,<destination>,<troop_id>),
     * @return
     */
    public static Operation storeQuestTroop(Variable destination,Troop troop){
        return new StoreQuestTroop(destination,troop.getVar());
    }

    /**
     *   (store_partner_quest,<destination>),
     * @return
     */
    public static Operation storePartnerQuest(Variable destination){
        return new StorePartnerQuest(destination);
    }

    /**
     *   (store_random_quest_in_range,<destination>,<lower_bound>,<upper_bound>),
     * @return
     */
    public static Operation storeRandomQuestInRange(Variable destination,Variable lowerBound,Variable upperBound){
        return new StoreRandomQuestInRange(destination,lowerBound,upperBound);
    }

    /**
     *   (store_quest_item,<destination>,<item_id>),
     * @return
     */
    public static Operation storeQuestItem(Variable destination,Item item){
        return new StoreQuestItem(destination,item.getVar());
    }

    /**
     *   (check_quest_active,<quest_id>),
     * @return
     */
    public Operation checkQuestActive(){
        return new CheckQuestActive(this.variable);
    }

    /**
     *   (fail_quest,<quest_id>),  also concludes the quest
     * @return
     */
    public Operation failQuest(){
        return new FailQuest(this.variable);
    }

    /**
     *   (check_quest_finished,<quest_id>),
     * @return
     */
    public Operation checkQuestFinished(){
        return new CheckQuestFinished(this.variable);
    }

    /**
     *   (store_quest_number,<destination>,<quest_id>),
     * @return
     */
    public Operation storeQuestNumber(Variable destination){
        return new StoreQuestNumber(destination,this.variable);
    }

    /**
     *   (add_quest_note_from_sreg,<quest_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addQuestNoteFromSreg(Variable noteSlotNo,GameString string,Variable value){
        return new AddQuestNoteFromSreg(this.variable,noteSlotNo,string.getVar(),value);
    }

    /**
     *   (set_quest_progression,<quest_id>,<value>),
     * @return
     */
    public Operation setQuestProgression(Variable value){
        return new SetQuestProgression(this.variable,value);
    }

    /**
     *   (cancel_quest,<quest_id>),
     * @return
     */
    public Operation cancelQuest(){
        return new CancelQuest(this.variable);
    }

    /**
     *   (check_quest_concluded,<quest_id>),
     * @return
     */
    public Operation checkQuestConcluded(){
        return new CheckQuestConcluded(this.variable);
    }

    /**
     *   (check_quest_succeeded,<quest_id>),
     * @return
     */
    public Operation checkQuestSucceeded(){
        return new CheckQuestSucceeded(this.variable);
    }

    /**
     *   (add_quest_note_from_dialog,<quest_id>,<note_slot_no>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addQuestNoteFromDialog(Variable noteSlotNo,Variable value){
        return new AddQuestNoteFromDialog(this.variable,noteSlotNo,value);
    }

    /**
     *   (conclude_quest,<quest_id>),
     * @return
     */
    public Operation concludeQuest(){
        return new ConcludeQuest(this.variable);
    }

    /**
     *   (setup_quest_text,<quest_id>),
     * @return
     */
    public Operation setupQuestText(){
        return new SetupQuestText(this.variable);
    }

    /**
     *   (str_store_quest_name,<string_register>,<quest_id>),
     * @return
     */
    public Operation strStoreQuestName(SregVariable stringRegister){
        return new StrStoreQuestName(stringRegister.getVar(),this.variable);
    }

    /**
     *   (check_quest_failed,<quest_id>),
     * @return
     */
    public Operation checkQuestFailed(){
        return new CheckQuestFailed(this.variable);
    }

    /**
     *   (succeed_quest,<quest_id>),  also concludes the quest
     * @return
     */
    public Operation succeedQuest(){
        return new SucceedQuest(this.variable);
    }

    /**
     *   (start_quest,<quest_id>),
     * @return
     */
    public Operation startQuest(){
        return new StartQuest(this.variable);
    }

    /**
     *   (complete_quest,<quest_id>),
     * @return
     */
    public Operation completeQuest(){
        return new CompleteQuest(this.variable);
    }

    /**
     *   (setup_quest_giver,<quest_id>, <string_id>),
     * @return
     */
    public Operation setupQuestGiver(GameString string){
        return new SetupQuestGiver(this.variable,string.getVar());
    }


}