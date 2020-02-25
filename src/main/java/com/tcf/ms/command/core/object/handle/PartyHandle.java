package com.tcf.ms.command.core.object.handle;

import com.sun.xml.internal.fastinfoset.util.ValueArray;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.Commons;
import com.tcf.ms.command.core.base.var.*;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.*;
import com.tcf.ms.command.core.object.handle.slot.PartySlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.operation.*;
import org.bouncycastle.jcajce.provider.digest.RIPEMD256;

public class PartyHandle {

    private StringVariable variable;

    public PartyHandle(StringVariable variable) {
        this.variable = variable;
    }

    /**
     * 英雄是否能够加入本队伍
     * @return
     */
    public Conditable heroCanJoin(){
        return new HeroCanJoin(this.variable);
    }

    /**
     * 英雄是否能够作为俘虏加入本队伍
     * @return
     */
    public Conditable heroCanJoinAsPrisoner(){
        return new HeroCanJoinAsPrisoner(this.variable);
    }

    /**
     * 当前部队是否能够加入指定部队
     * @param party 指定部队
     * @param isPrisoner 以何种方式加入，true:俘虏 false:队友
     * @return
     */
    public Conditable partyCanJoinParty(Party party,boolean isPrisoner){
        return new PartyCanJoinParty(this.variable,party.getVar(), Variable.number(isPrisoner ? 1 : 0));
    }

    /**
     * 当前部队是否能够以友军的方式加入指定部队
     * @param party 指定部队
     * @return
     */
    public Conditable partyCanJoinParty(Party party){
        return partyCanJoinParty(party, false);
    }

    /**
     * 当前部队是否驻扎在指定城中
     * @param town
     * @return
     */
    public Conditable partyIsInTown(Party town){
        return new PartyIsInTown(this.variable,town.getVar());
    }

    /**
     * 当前部队是否驻扎在任何城中
     * @return
     */
    public Conditable partyIsInAnyTown(){
        return new PartyIsInAnyTown(this.variable);
    }

    /**
     * 当前部队是否没有被打败，也就是存在于游戏世界中
     * @return
     */
    public Conditable party_is_active(){
        return new PartyIsActive(this.variable);
    }

    public SlotOperation slot(){
        return new PartySlot(this.variable);
    }

    public Operation setCameraFollowParty(){
        return new SetCameraFollowParty(this.variable);
    }

    public Operation addGoldToParty(int money){
        return new AddGoldToParty(Variable.number(money),this.variable);
    }

    public Operation spawnAroundParty(PartyTemplate partyTemplate){
        return new SpawnAroundParty(this.variable,partyTemplate.getVar());
    }

    public Operation addPartyNoteFromDialog(int noteSlotNo,Variable value){
        if(noteSlotNo > 8 || noteSlotNo < 1){
            throw new BladeException("add_party_note_from_dialog脚本中的note_slot_no参数只能是1到8");
        }
        return new AddPartyNoteFromDialog(this.variable,Variable.number(noteSlotNo),value);
    }

    public Operation addPartyNoteFromSreg(int noteSlotNo, SregVariable str, boolean show){
        if(noteSlotNo > 8 || noteSlotNo < 1){
            throw new BladeException("add_party_note_from_dialog脚本中的note_slot_no参数只能是1到8");
        }
        return new AddPartyNoteFromSreg(this.variable,Variable.number(noteSlotNo),str,Variable.number(show ? 1 : 0));
    }

    public Operation addPartyNoteFromSreg(int noteSlotNo, TextVariable str, boolean show){
        if(noteSlotNo > 8 || noteSlotNo < 1){
            throw new BladeException("add_party_note_from_dialog脚本中的note_slot_no参数只能是1到8");
        }
        return new AddPartyNoteFromSreg(this.variable,Variable.number(noteSlotNo),str,Variable.number(show ? 1 : 0));
    }

    public Operation removeMemberFromParty(Troop troop){
        return new RemoveMemberFromParty(troop.getVar(),this.variable);
    }

    public Operation removeRegularPrisoners(){
        return new RemoveRegularPrisoners(this.variable);
    }

    public Operation healParty(){
        return new HealParty(this.variable);
    }

    public Operation disableParty(){
        return new DisableParty(this.variable);
    }

    public Operation enableParty(){
        return new EnableParty(this.variable);
    }

    public Operation removeParty(){
        return new RemoveParty(this.variable);
    }

    public Operation partyGetNumCompanions(Variable variable){
        return new PartyGetNumCompanions(variable,this.variable);
    }

    public Operation partyGetNumPrisoners(Variable variable){
        return new PartyGetNumPrisoners(variable,this.variable);
    }

    public Operation partySetFlags(Variable flag,boolean setOrClear){
        return new PartySetFlags(this.variable,flag,Variable.number(setOrClear ? 1 : 0));
    }

    public Operation partySetExtraText(TextVariable string){
        return new PartySetExtraText(this.variable,string);
    }

    public Operation partyGetCurrentTerrain(Variable variable){
        return new PartyGetCurrentTerrain(variable,this.variable);
    }

    public Operation partyGetTemplate_id(Variable variable){
        return new PartyGetTemplateId(variable,this.variable);
    }

    public Operation partyAddMembers(Troop troop, NumberVariable number){
        return new PartyAddMembers(this.variable,troop.getVar(),number);
    }

    public Operation partyAddPrisoners(Troop troop,NumberVariable number){
        return new PartyAddPrisoners(this.variable,troop.getVar(),number);
    }

    public Operation partyAddLeader(Troop troop,NumberVariable numberVariable){
        return new PartyAddLeader(this.variable,troop.getVar(),numberVariable);
    }

    public Operation partyAddLeader(Troop troop){
        return partyAddLeader(troop,Variable.number(1));
    }

    public Operation partyForceAddMembers(Troop troop,NumberVariable number){
        return new PartyForceAddMembers(this.variable,troop.getVar(),number);
    }

    public Operation partyForceAddPrisoners(Troop troop,NumberVariable number){
        return new PartyForceAddPrisoners(this.variable,troop.getVar(),number);
    }

    public Operation party_remove_members(Troop troop,NumberVariable numberVariable){
        return new PartyRemoveMembers(this.variable,troop.getVar(),numberVariable);
    }

    public Operation party_remove_prisoners(Troop troop,NumberVariable number){
        return new PartyRemovePrisoners(this.variable,troop.getVar(),number);
    }

    public Operation party_clear(){
        return new PartyClear(this.variable);
    }

    public Operation party_wound_members(Troop troop,NumberVariable number){
        return new PartyWoundMembers(this.variable,troop.getVar(),number);
    }

    public Operation party_remove_members_wounded_first(Troop troop,NumberVariable number){
        return new PartyRemoveMembersWoundedFirst(this.variable,troop.getVar(),number);
    }

    public Operation party_set_faction(Faction faction){
        return new PartySetFaction(this.variable,faction.getVar());
    }

    public Operation party_relocate_near_party(Party party,NumberVariable number){
        return new PartyRelocateNearParty(this.variable,party.getVar(),number);
    }

    public Operation party_get_position(PosVariable variable){
        return new PartyGetPosition(variable,this.variable);
    }

    public Operation party_set_position(PosVariable variable){
        return new PartySetPosition(this.variable,variable);
    }

    public Operation party_count_members_of_type(Variable variable,Troop troop){
        return new PartyCountMembersOfType(variable,this.variable,troop.getVar());
    }

    public Operation party_count_companions_of_type(Variable variable,Troop troop){
        return new PartyCountCompanionsOfType(variable,this.variable,troop.getVar());
    }

    public Operation party_count_prisoners_of_type(Variable variable,Troop troop){
        return new PartyCountPrisonersOfType(variable,this.variable,troop.getVar());
    }

    public Operation party_get_free_companions_capacity(Variable variable){
        return new PartyGetFreeCompanionsCapacity(variable,this.variable);
    }

    public Operation party_get_free_prisoners_capacity(Variable variable){
        return new PartyGetFreeCompanionsCapacity(variable,this.variable);
    }


    public Operation party_set_ai_initiative(int number){
        if(number < 0 || number > 100){
            throw new BladeException("队伍的主动权只能是0到100之间，您的取值为：" + number);
        }
        return new PartySetAiInitiative(this.variable,Variable.number(number));
    }

    public Operation party_set_ai_behavior(PartyHeader.AiBhvr aiBhvr){
        return new PartySetAiBehavior(this.variable,Variable.constant(aiBhvr.getName()));
    }

    public Operation party_set_ai_object(Party party){
        return new PartySetAiObject(this.variable,party.getVar());
    }

    public Operation party_set_ai_target_position(PosVariable variable){
        return new PartySetAiTargetPosition(this.variable,variable);
    }

    public Operation party_set_ai_patrol_radius(NumberVariable radiusInKm){
        return new PartySetAiPatrolRadius(this.variable,radiusInKm);
    }

    public Operation party_ignore_player(NumberVariable durationInHours){
        return new PartyIgnorePlayer(this.variable,durationInHours);
    }

    public Operation party_set_bandit_attraction(int attaraction){
        if(attaraction < 0 || attaraction > 100){
            throw new BladeException("劫匪的攻击性只能是在0到100之间，您的取值为：" + attaraction);
        }
        return new PartySetBanditAttraction(this.variable,Variable.number(attaraction));
    }

    public Operation party_get_num_companion_stacks(Variable destination){
        return new PartyGetNumCompanionStacks(destination,this.variable);
    }

    public Operation party_get_num_prisoner_stacks(Variable destination){
        return new PartyGetNumPrisonerStacks(destination,this.variable);
    }

    public Operation party_stack_get_troop_id(Variable destination,Variable stackNo){
        return new PartyStackGetTroopId(destination,this.variable,stackNo);
    }

    public Operation party_stack_get_size(Variable destination,Variable stackNo){
        return new PartyStackGetSize(destination,this.variable,stackNo);
    }

    public Operation party_stack_get_num_wounded(Variable destination,Variable stackNo){
        return new PartyStackGetNumWounded(destination,this.variable,stackNo);
    }

    public Operation party_stack_get_troop_dna(Variable destination,Variable stackNo){
        return new PartyStackGetTroopDna(destination,this.variable,stackNo);
    }

    public Operation party_prisoner_stack_get_troop_id(Variable destination, Variable stackNo){
        return new PartyPrisonerStackGetTroopId(destination,this.variable,stackNo);
    }

    public Operation party_prisoner_stack_get_size(Variable destination, Variable stackNo){
        return  new PartyPrisonerStackGetSize(destination,this.variable,stackNo);
    }

    public Operation party_attach_to_party(Party party){
        return new PartyAttachToParty(this.variable,party.getVar());
    }

    public Operation party_detach(){
        return new PartyDetach(this.variable);
    }

    public Operation party_collect_attachments_to_party(Party destination){
        return new PartyCollectAttachmentsToParty(this.variable,destination.getVar());
    }

    public Operation party_quick_attach_to_current_battle(Commons.Side side){
        return new PartyQuickAttachToCurrentBattle(this.variable,Variable.number(side.getValue()));
    }

    public Operation party_get_cur_town(Variable variable){
        return new PartyGetCurTown(variable,this.variable);
    }

    public Operation party_leave_cur_battle(){
        return new PartyLeaveCurBattle(this.variable);
    }

    public Operation party_set_next_battle_simulation_time(Variable nextSimulationTimeInHours){
        return  new PartySetNextBattleSimulationTime(this.variable,nextSimulationTimeInHours);
    }

    public Operation party_set_name(TextVariable variable){
        return new PartySetName(this.variable,variable);
    }

    public Operation party_add_xp_to_stack(NumberVariable stackNo,NumberVariable xpAmount){
        return new PartyAddXpToStack(this.variable,stackNo,xpAmount);
    }

    public Operation party_get_morale(Variable destination){
        return new PartyGetMorale(destination,this.variable);
    }
}
