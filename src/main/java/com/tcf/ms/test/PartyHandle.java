package com.tcf.ms.test;

import com.tcf.ms.command.core.operation.AddCompanionParty;
import com.tcf.ms.command.core.operation.GetPartyAiCurrentBehavior;
import com.tcf.ms.command.core.operation.PartyGetMorale;
import com.tcf.ms.command.core.operation.PartyTemplateGetSlot;
import com.tcf.ms.command.core.operation.PartyRemoveMembers;
import com.tcf.ms.command.core.operation.PartySetMorale;
import com.tcf.ms.command.core.operation.StoreRandomPartyInRange;
import com.tcf.ms.command.core.operation.PartyGetFreePrisonersCapacity;
import com.tcf.ms.command.core.operation.PartyIsInTown;
import com.tcf.ms.command.core.operation.PartyRemovePrisoners;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.SetMercenarySourceParty;
import com.tcf.ms.command.core.operation.PartyGetAttachedPartyWithRank;
import com.tcf.ms.command.core.operation.PartyLeaveCurBattle;
import com.tcf.ms.command.core.operation.RemoveMemberFromParty;
import com.tcf.ms.command.core.operation.SetCameraFollowParty;
import com.tcf.ms.command.core.operation.PartyGetFreeCompanionsCapacity;
import com.tcf.ms.command.core.operation.StoreNumFreePrisonerStacks;
import com.tcf.ms.command.core.operation.InflictCasualtiesToPartyGroup;
import com.tcf.ms.command.core.operation.HealParty;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.StorePartySize;
import com.tcf.ms.command.core.operation.EnableParty;
import com.tcf.ms.command.core.operation.PartyAddPrisoners;
import com.tcf.ms.command.core.operation.PartySetExtraText;
import com.tcf.ms.command.core.operation.PartyForceAddMembers;
import com.tcf.ms.command.core.operation.PartyCountPrisonersOfType;
import com.tcf.ms.command.core.operation.SetPartyCreationRandomLimits;
import com.tcf.ms.command.core.operation.StoreTroopCountPrisoners;
import com.tcf.ms.command.core.operation.PartyClear;
import com.tcf.ms.command.core.operation.PartyGetCurTown;
import com.tcf.ms.command.core.object.GameString;
import com.tcf.ms.command.core.operation.PartyAddXp;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.operation.PartySetAiBehavior;
import com.tcf.ms.command.core.operation.RemoveRegularPrisoners;
import com.tcf.ms.command.core.operation.PartyCanJoinParty;
import com.tcf.ms.command.core.operation.ChangeScreenExchangeWithParty;
import com.tcf.ms.command.core.operation.PartyStackGetSize;
import com.tcf.ms.command.core.operation.PartySetAiTargetPosition;
import com.tcf.ms.command.core.operation.DisableParty;
import com.tcf.ms.command.core.base.var.PosVariable;
import com.tcf.ms.command.core.operation.PartyAddTemplate;
import com.tcf.ms.command.core.operation.PartyStackGetNumWounded;
import com.tcf.ms.command.core.operation.StartEncounter;
import com.tcf.ms.command.core.operation.PartyUpgradeWithXp;
import com.tcf.ms.command.core.operation.PartyPrisonerStackGetSize;
import com.tcf.ms.command.core.object.PartyTemplate;
import com.tcf.ms.command.core.operation.PartyGetNumCompanions;
import com.tcf.ms.command.core.operation.StoreEncounteredParty2;
import com.tcf.ms.command.core.operation.StrStorePartyName;
import com.tcf.ms.command.core.operation.PartyGetAiTargetPosition;
import com.tcf.ms.command.core.operation.RemoveParty;
import com.tcf.ms.command.core.operation.PartyGetAttachedTo;
import com.tcf.ms.command.core.operation.PartySetIcon;
import com.tcf.ms.command.core.operation.PartyAddXpToStack;
import com.tcf.ms.command.core.operation.PartyGetNumPrisoners;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.PartyGetNumPrisonerStacks;
import com.tcf.ms.command.core.operation.PartyForceAddPrisoners;
import com.tcf.ms.command.core.operation.PartyTemplateSlotEq;
import com.tcf.ms.command.core.operation.AddGoldToParty;
import com.tcf.ms.command.core.operation.PartyPrisonerStackGetTroopId;
import com.tcf.ms.command.core.operation.StoreEncounteredParty;
import com.tcf.ms.command.core.operation.PartyTemplateSetSlot;
import com.tcf.ms.command.core.operation.StoreNumRegularPrisoners;
import com.tcf.ms.command.core.operation.PartyCountMembersOfType;
import com.tcf.ms.command.core.operation.PartyRelocateNearParty;
import com.tcf.ms.command.core.operation.PartyTemplateSlotGe;
import com.tcf.ms.command.core.operation.EncounteredPartyIsAttacker;
import com.tcf.ms.command.core.operation.PartyGetIcon;
import com.tcf.ms.command.core.operation.PartyGetNumCompanionStacks;
import com.tcf.ms.command.core.operation.PartyWoundMembers;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.PartyCanJoinAsPrisoner;
import com.tcf.ms.command.core.operation.PartySetAiInitiative;
import com.tcf.ms.command.core.operation.SetPartyBattleMode;
import com.tcf.ms.command.core.operation.AddPartyNoteTableauMesh;
import com.tcf.ms.command.core.operation.StoreFactionOfParty;
import com.tcf.ms.command.core.operation.PartyStackGetTroopDna;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.operation.HeroCanJoin;
import com.tcf.ms.command.core.operation.PartyIsActive;
import com.tcf.ms.command.core.operation.PartyRemoveMembersWoundedFirst;
import com.tcf.ms.command.core.operation.PartyGetTemplateId;
import com.tcf.ms.command.core.operation.StoreTroopCountCompanions;
import com.tcf.ms.command.core.operation.PartySetAiPatrolRadius;
import com.tcf.ms.command.core.operation.PartyStackGetTroopId;
import com.tcf.ms.command.core.operation.PartyPrisonerStackGetTroopDna;
import com.tcf.ms.command.core.operation.PartyAttachToParty;
import com.tcf.ms.command.core.operation.PartyIsInAnyTown;
import com.tcf.ms.command.core.operation.PartyQuickAttachToCurrentBattle;
import com.tcf.ms.command.core.operation.PartyJoinAsPrisoner;
import com.tcf.ms.command.core.operation.StoreRandomPartyOfTemplate;
import com.tcf.ms.command.core.operation.SpawnAroundParty;
import com.tcf.ms.command.core.object.ParticleSystem;
import com.tcf.ms.command.core.operation.PartyDetach;
import com.tcf.ms.command.core.operation.GetPartyAiBehavior;
import com.tcf.ms.command.core.operation.StoreDistanceToPartyFromParty;
import com.tcf.ms.command.core.operation.PartyGetCurrentTerrain;
import com.tcf.ms.command.core.operation.PartySetNextBattleSimulationTime;
import com.tcf.ms.command.core.operation.PartyJoin;
import com.tcf.ms.command.core.base.var.SregVariable;
import com.tcf.ms.command.core.operation.PartySetBanditAttraction;
import com.tcf.ms.command.core.operation.PartySetPosition;
import com.tcf.ms.command.core.operation.PartyGetBattleOpponent;
import com.tcf.ms.command.core.operation.PartySetName;
import com.tcf.ms.command.core.operation.StoreNumFreeStacks;
import com.tcf.ms.command.core.operation.PartySetAiObject;
import com.tcf.ms.command.core.operation.PartyIgnorePlayer;
import com.tcf.ms.command.core.operation.PartyAddLeader;
import com.tcf.ms.command.core.operation.PartySetBannerIcon;
import com.tcf.ms.command.core.operation.PartySetFaction;
import com.tcf.ms.command.core.operation.GetPartyAiObject;
import com.tcf.ms.command.core.operation.PartySetFlags;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.PartyAddMembers;
import com.tcf.ms.command.core.operation.PartyAddParticleSystem;
import com.tcf.ms.command.core.operation.PartyGetNumAttachedParties;
import com.tcf.ms.command.core.operation.PartyCountCompanionsOfType;
import com.tcf.ms.command.core.operation.PartyGetPosition;
import com.tcf.ms.command.core.operation.PartyCollectAttachmentsToParty;
import com.tcf.ms.command.core.operation.StrStorePartyNameLink;
import com.tcf.ms.command.core.object.MapIcon;
import com.tcf.ms.command.core.operation.AddPartyNoteFromDialog;
import com.tcf.ms.command.core.object.handle.slot.PartySlot;
import com.tcf.ms.command.core.operation.PartyGetSkillLevel;
import com.tcf.ms.command.core.operation.HeroCanJoinAsPrisoner;
import com.tcf.ms.command.core.operation.PartyClearParticleSystems;
import com.tcf.ms.command.core.operation.AddPartyNoteFromSreg;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.operation.GetPartyAiCurrentObject;
import com.tcf.ms.command.core.operation.StorePartySizeWoPrisoners;

public class PartyHandle {

    private StringVariable variable;

    public PartyHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new PartySlot(this.variable);
    }

    /**
     *   (add_companion_party,<troop_id_hero>),
     * @return
     */
    public static Operation addCompanionParty(Variable troopIdHero){
        return new AddCompanionParty(troopIdHero);
    }

    /**
     *   (store_faction_of_party,<destination>),
     * @return
     */
    public static Operation storeFactionOfParty(Variable destination){
        return new StoreFactionOfParty(destination);
    }

    /**
     *   (party_can_join_as_prisoner),
     * @return
     */
    public static Operation partyCanJoinAsPrisoner(){
        return new PartyCanJoinAsPrisoner();
    }

    /**
     *   (set_party_battle_mode),
     * @return
     */
    public static Operation setPartyBattleMode(){
        return new SetPartyBattleMode();
    }

    /**
     *   (party_template_get_slot,<destination>,<party_template_id>,<slot_no>),
     * @return
     */
    public static Operation partyTemplateGetSlot(Variable destination,PartyTemplate partyTemplate,Variable slotNo){
        return new PartyTemplateGetSlot(destination,partyTemplate.getVar(),slotNo);
    }

    /**
     *   (add_party_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public static Operation addPartyNoteTableauMesh(Troop troop,TableauMaterial tableauMaterial){
        return new AddPartyNoteTableauMesh(troop.getVar(),tableauMaterial.getVar());
    }

    /**
     *   (encountered_party_is_attacker),
     * @return
     */
    public static Operation encounteredPartyIsAttacker(){
        return new EncounteredPartyIsAttacker();
    }

    /**
     *   (store_random_party_in_range,<destination>,<lower_bound>,<upper_bound>),
     * @return
     */
    public static Operation storeRandomPartyInRange(Variable destination,Variable lowerBound,Variable upperBound){
        return new StoreRandomPartyInRange(destination,lowerBound,upperBound);
    }

    /**
     *   (store_encountered_party,<destination>),
     * @return
     */
    public static Operation storeEncounteredParty(Variable destination){
        return new StoreEncounteredParty(destination);
    }

    /**
     *   fails if no party exists with tempolate_id (expensive)  (store_random_party_of_template,<destination>,<party_template_id>),
     * @return
     */
    public static Operation storeRandomPartyOfTemplate(Variable destination,PartyTemplate partyTemplate){
        return new StoreRandomPartyOfTemplate(destination,partyTemplate.getVar());
    }

    /**
     *   (party_join),
     * @return
     */
    public static Operation partyJoin(){
        return new PartyJoin();
    }

    /**
     *   (store_encountered_party2,<destination>),
     * @return
     */
    public static Operation storeEncounteredParty2(Variable destination){
        return new StoreEncounteredParty2(destination);
    }

    /**
     *   (party_template_slot_eq,<party_template_id>,<slot_no>,<value>),
     * @return
     */
    public static Operation partyTemplateSlotEq(PartyTemplate partyTemplate,Variable slotNo,Variable value){
        return new PartyTemplateSlotEq(partyTemplate.getVar(),slotNo,value);
    }

    /**
     *   (inflict_casualties_to_party, <parent_party_id>, <attack_rounds>, <party_id_to_add_causalties_to>), 
     * @return
     */
    public static Operation inflictCasualtiesToPartyGroup(Variable parentPartyId,Variable attackRounds,Variable partyIdToAddCausaltiesTo){
        return new InflictCasualtiesToPartyGroup(parentPartyId,attackRounds,partyIdToAddCausaltiesTo);
    }

    /**
     *   (party_template_set_slot,<party_template_id>,<slot_no>,<value>),
     * @return
     */
    public static Operation partyTemplateSetSlot(PartyTemplate partyTemplate,Variable slotNo,Variable value){
        return new PartyTemplateSetSlot(partyTemplate.getVar(),slotNo,value);
    }

    /**
     *   (party_template_slot_ge,<party_template_id>,<slot_no>,<value>),
     * @return
     */
    public static Operation partyTemplateSlotGe(PartyTemplate partyTemplate,Variable slotNo,Variable value){
        return new PartyTemplateSlotGe(partyTemplate.getVar(),slotNo,value);
    }

    /**
     *   (party_join_as_prisoner),
     * @return
     */
    public static Operation partyJoinAsPrisoner(){
        return new PartyJoinAsPrisoner();
    }

    /**
     *   (party_is_in_town,<party_id_1>,<party_id_2>),
     * @return
     */
    public static Operation partyIsInTown(Variable partyId1,Variable partyId2){
        return new PartyIsInTown(partyId1,partyId2);
    }

    /**
     *   (party_can_join_party, <joiner_party_id>, <host_party_id>,[flip_prisoners]),
     * @return
     */
    public static Operation partyCanJoinParty(Variable joinerPartyId,Variable hostPartyId,Variable flipPrisoners){
        return new PartyCanJoinParty(joinerPartyId,hostPartyId,flipPrisoners);
    }

    /**
     *   (set_party_creation_random_limits, <min_value>, <max_value>), (values should be between 0, 100)
     * @return
     */
    public static Operation setPartyCreationRandomLimits(Variable minValue,Variable maxValue){
        return new SetPartyCreationRandomLimits(minValue,maxValue);
    }

    /**
     *   (party_get_template_id,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetTemplateId(Variable destination){
        return new PartyGetTemplateId(destination,this.variable);
    }

    /**
     *   (party_get_num_prisoner_stacks, <destination>,<party_id>),
     * @return
     */
    public Operation partyGetNumPrisonerStacks(Variable destination){
        return new PartyGetNumPrisonerStacks(destination,this.variable);
    }

    /**
     *   (party_set_next_battle_simulation_time,<party_id>,<next_simulation_time_in_hours>),
     * @return
     */
    public Operation partySetNextBattleSimulationTime(Variable nextSimulationTimeInHours){
        return new PartySetNextBattleSimulationTime(this.variable,nextSimulationTimeInHours);
    }

    /**
     *   (party_get_prisoner_stack_size, <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyPrisonerStackGetSize(Variable destination,Variable stackNo){
        return new PartyPrisonerStackGetSize(destination,this.variable,stackNo);
    }

    /**
     *   (party_add_prisoners,<party_id>,<troop_id>,<number>), returns number added in reg0
     * @return
     */
    public Operation partyAddPrisoners(Troop troop,Variable number){
        return new PartyAddPrisoners(this.variable,troop.getVar(),number);
    }

    /**
     *   (store_party_size,<destination>,[party_id]),
     * @return
     */
    public Operation storePartySize(Variable destination){
        return new StorePartySize(destination,this.variable);
    }

    /**
     *   stores number removed to reg0  (party_remove_members,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyRemoveMembers(Troop troop,Variable number){
        return new PartyRemoveMembers(this.variable,troop.getVar(),number);
    }

    /**
     *   (party_wound_members,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyWoundMembers(Troop troop,Variable number){
        return new PartyWoundMembers(this.variable,troop.getVar(),number);
    }

    /**
     *   stores number removed to reg0  (party_remove_members_wounded_first,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyRemoveMembersWoundedFirst(Troop troop,Variable number){
        return new PartyRemoveMembersWoundedFirst(this.variable,troop.getVar(),number);
    }

    /**
     *   (party_set_ai_patrol_radius,<party_id>,<radius_in_km>),
     * @return
     */
    public Operation partySetAiPatrolRadius(Variable radiusInKm){
        return new PartySetAiPatrolRadius(this.variable,radiusInKm);
    }

    /**
     *   (party_detach, <party_id>),
     * @return
     */
    public Operation partyDetach(){
        return new PartyDetach(this.variable);
    }

    /**
     *   (str_store_party_name,<string_register>,<party_id>),
     * @return
     */
    public Operation strStorePartyName(SregVariable stringRegister){
        return new StrStorePartyName(stringRegister.getVar(),this.variable);
    }

    /**
     *   (party_set_position,<party_id>,<position_no>),
     * @return
     */
    public Operation partySetPosition(PosVariable position){
        return new PartySetPosition(this.variable,position.getVar());
    }

    /**
     *   (party_get_position,<position_no>,<party_id>),
     * @return
     */
    public Operation partyGetPosition(PosVariable position){
        return new PartyGetPosition(position.getVar(),this.variable);
    }

    /**
     *   (party_set_flag, <party_id>, <flag>, <clear_or_set>),  sets flags like pf_default_behavior. see header_parties.py for flags.
     * @return
     */
    public Operation partySetFlags(Variable flag,Variable clearOrSet){
        return new PartySetFlags(this.variable,flag,clearOrSet);
    }

    /**
     *   (party_set_name, <party_id>, <string_no>),
     * @return
     */
    public Operation partySetName(Variable stringNo){
        return new PartySetName(this.variable,stringNo);
    }

    /**
     *   (hero_can_join_as_prisoner, [party_id]),
     * @return
     */
    public Operation heroCanJoinAsPrisoner(){
        return new HeroCanJoinAsPrisoner(this.variable);
    }

    /**
     *   (party_get_ai_target_position,<position_no>,<party_id>),
     * @return
     */
    public Operation partyGetAiTargetPosition(PosVariable position){
        return new PartyGetAiTargetPosition(position.getVar(),this.variable);
    }

    /**
     *   (party_add_leader,<party_id>,<troop_id>,[<number>]),
     * @return
     */
    public Operation partyAddLeader(Troop troop,Variable number){
        return new PartyAddLeader(this.variable,troop.getVar(),number);
    }

    /**
     *   (party_add_particle_system, <party_id>, <particle_system_id>),
     * @return
     */
    public Operation partyAddParticleSystem(ParticleSystem particleSystem){
        return new PartyAddParticleSystem(this.variable,particleSystem.getVar());
    }

    /**
     *   (party_get_num_companion_stacks,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetNumCompanionStacks(Variable destination){
        return new PartyGetNumCompanionStacks(destination,this.variable);
    }

    /**
     *   (party_set_extra_text,<party_id>, <string>)
     * @return
     */
    public Operation partySetExtraText(Variable string){
        return new PartySetExtraText(this.variable,string);
    }

    /**
     *   (party_ignore_player, <party_id>,<duration_in_hours>),  don't pursue player party for this duration
     * @return
     */
    public Operation partyIgnorePlayer(Variable durationInHours){
        return new PartyIgnorePlayer(this.variable,durationInHours);
    }

    /**
     *   (party_get_attached_party_with_rank, <destination>, <party_id>, <attached_party_no>),
     * @return
     */
    public Operation partyGetAttachedPartyWithRank(Variable destination,Variable attachedPartyNo){
        return new PartyGetAttachedPartyWithRank(destination,this.variable,attachedPartyNo);
    }

    /**
     *   (party_set_faction,<party_id>,<faction_id>),
     * @return
     */
    public Operation partySetFaction(Faction faction){
        return new PartySetFaction(this.variable,faction.getVar());
    }

    /**
     *   (party_get_battle_opponent, <destination>, <party_id>)
     * @return
     */
    public Operation partyGetBattleOpponent(Variable destination){
        return new PartyGetBattleOpponent(destination,this.variable);
    }

    /**
     *   (party_get_morale, <destination>,<party_id>),
     * @return
     */
    public Operation partyGetMorale(Variable destination){
        return new PartyGetMorale(destination,this.variable);
    }

    /**
     *   (str_store_party_name_link,<string_register>,<party_id>),
     * @return
     */
    public Operation strStorePartyNameLink(SregVariable stringRegister){
        return new StrStorePartyNameLink(stringRegister.getVar(),this.variable);
    }

    /**
     *   (disable_party,<party_id>),
     * @return
     */
    public Operation disableParty(){
        return new DisableParty(this.variable);
    }

    /**
     *   (party_prisoner_stack_get_troop_dna, <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyPrisonerStackGetTroopDna(Variable destination,Variable stackNo){
        return new PartyPrisonerStackGetTroopDna(destination,this.variable,stackNo);
    }

    /**
     *   (party_add_xp, <party_id>, <xp_amount>),
     * @return
     */
    public Operation partyAddXp(Variable xpAmount){
        return new PartyAddXp(this.variable,xpAmount);
    }

    /**
     *   (party_upgrade_with_xp, <party_id>, <xp_amount>, <upgrade_path>),  upgrade_path can be: 0 = choose random, 1 = choose first, 2 = choose second
     * @return
     */
    public Operation partyUpgradeWithXp(Variable xpAmount,Variable upgradePath){
        return new PartyUpgradeWithXp(this.variable,xpAmount,upgradePath);
    }

    /**
     *   (party_stack_get_troop_id,      <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyStackGetTroopId(Variable destination,Variable stackNo){
        return new PartyStackGetTroopId(destination,this.variable,stackNo);
    }

    /**
     *   (add_party_note_from_dialog,<party_id>,<note_slot_no>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addPartyNoteFromDialog(Variable noteSlotNo,Variable value){
        return new AddPartyNoteFromDialog(this.variable,noteSlotNo,value);
    }

    /**
     *   (party_force_add_prisoners,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyForceAddPrisoners(Troop troop,Variable number){
        return new PartyForceAddPrisoners(this.variable,troop.getVar(),number);
    }

    /**
     *   (start_encounter,<party_id>),
     * @return
     */
    public Operation startEncounter(){
        return new StartEncounter(this.variable);
    }

    /**
     *   (party_get_cur_town, <destination>, <party_id>),
     * @return
     */
    public Operation partyGetCurTown(Variable destination){
        return new PartyGetCurTown(destination,this.variable);
    }

    /**
     *   (party_get_num_prisoners,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetNumPrisoners(Variable destination){
        return new PartyGetNumPrisoners(destination,this.variable);
    }

    /**
     *   (party_count_companions_of_type,<destination>,<party_id>,<troop_id>),
     * @return
     */
    public Operation partyCountCompanionsOfType(Variable destination,Troop troop){
        return new PartyCountCompanionsOfType(destination,this.variable,troop.getVar());
    }

    /**
     *   stores number removed to reg0  (party_remove_members,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyRemovePrisoners(Troop troop,Variable number){
        return new PartyRemovePrisoners(this.variable,troop.getVar(),number);
    }

    /**
     *   ID of spawned party is put into reg(0)  (spawn_around_party,<party_id>,<party_template_id>),
     * @return
     */
    public Operation spawnAroundParty(PartyTemplate partyTemplate){
        return new SpawnAroundParty(this.variable,partyTemplate.getVar());
    }

    /**
     *   (party_relocate_near_party,<party_id>,<target_party_id>,<value_spawn_radius>),
     * @return
     */
    public Operation partyRelocateNearParty(Variable targetPartyId,Variable valueSpawnRadius){
        return new PartyRelocateNearParty(this.variable,targetPartyId,valueSpawnRadius);
    }

    /**
     *   (party_attach_to_party, <party_id>, <party_id to attach to>),
     * @return
     */
    public Operation partyAttachToParty(Variable partyIdToAttachTo){
        return new PartyAttachToParty(this.variable,partyIdToAttachTo);
    }

    /**
     *   (get_party_ai_behavior,<destination>,<party_id>),
     * @return
     */
    public Operation getPartyAiBehavior(Variable destination){
        return new GetPartyAiBehavior(destination,this.variable);
    }

    /**
     *   (party_set_morale, <party_id>, <value>),  value is clamped to range [0...100].
     * @return
     */
    public Operation partySetMorale(Variable value){
        return new PartySetMorale(this.variable,value);
    }

    /**
     *   (store_distance_to_party_from_party,<destination>,<party_id>,<party_id>),
     * @return
     */
    public Operation storeDistanceToPartyFromParty(Variable destination,Party party){
        return new StoreDistanceToPartyFromParty(destination,this.variable,party.getVar());
    }

    /**
     *   (store_num_free_prisoner_stacks,<destination>,<party_id>),
     * @return
     */
    public Operation storeNumFreePrisonerStacks(Variable destination){
        return new StoreNumFreePrisonerStacks(destination,this.variable);
    }

    /**
     *   (party_get_skill_level, <destination>, <party_id>, <skill_no>),
     * @return
     */
    public Operation partyGetSkillLevel(Variable destination,Variable skillNo){
        return new PartyGetSkillLevel(destination,this.variable,skillNo);
    }

    /**
     *   (party_set_ai_behavior,<party_id>,<ai_bhvr>),
     * @return
     */
    public Operation partySetAiBehavior(Variable aiBhvr){
        return new PartySetAiBehavior(this.variable,aiBhvr);
    }

    /**
     *   (set_camera_follow_party,<party_id>),  Works on map only.
     * @return
     */
    public Operation setCameraFollowParty(){
        return new SetCameraFollowParty(this.variable);
    }

    /**
     *   (party_get_attached_to, <destination>, <party_id>),
     * @return
     */
    public Operation partyGetAttachedTo(Variable destination){
        return new PartyGetAttachedTo(destination,this.variable);
    }

    /**
     *   (party_stack_get_troop_dna,     <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyStackGetTroopDna(Variable destination,Variable stackNo){
        return new PartyStackGetTroopDna(destination,this.variable,stackNo);
    }

    /**
     *   (party_get_free_companions_capacity,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetFreeCompanionsCapacity(Variable destination){
        return new PartyGetFreeCompanionsCapacity(destination,this.variable);
    }

    /**
     *   (party_collect_attachments_to_party, <party_id>, <destination party_id>),
     * @return
     */
    public Operation partyCollectAttachmentsToParty(Variable destinationPartyId){
        return new PartyCollectAttachmentsToParty(this.variable,destinationPartyId);
    }

    /**
     *   (get_party_ai_object,<destination>,<party_id>),
     * @return
     */
    public Operation getPartyAiObject(Variable destination){
        return new GetPartyAiObject(destination,this.variable);
    }

    /**
     *   (party_set_ai_object,<party_id>,<party_id>),
     * @return
     */
    public Operation partySetAiObject(Party party){
        return new PartySetAiObject(this.variable,party.getVar());
    }

    /**
     *   (remove_regular_prisoners,<party_id>),
     * @return
     */
    public Operation removeRegularPrisoners(){
        return new RemoveRegularPrisoners(this.variable);
    }

    /**
     *   (remove_party,<party_id>),
     * @return
     */
    public Operation removeParty(){
        return new RemoveParty(this.variable);
    }

    /**
     *   (party_leave_cur_battle, <party_id>),
     * @return
     */
    public Operation partyLeaveCurBattle(){
        return new PartyLeaveCurBattle(this.variable);
    }

    /**
     *   (party_get_num_attached_parties, <destination>, <party_id>),
     * @return
     */
    public Operation partyGetNumAttachedParties(Variable destination){
        return new PartyGetNumAttachedParties(destination,this.variable);
    }

    /**
     *   (party_get_free_prisoners_capacity,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetFreePrisonersCapacity(Variable destination){
        return new PartyGetFreePrisonersCapacity(destination,this.variable);
    }

    /**
     *   (enable_party,<party_id>),
     * @return
     */
    public Operation enableParty(){
        return new EnableParty(this.variable);
    }

    /**
     *   (add_party_note_from_sreg,<party_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addPartyNoteFromSreg(Variable noteSlotNo,GameString string,Variable value){
        return new AddPartyNoteFromSreg(this.variable,noteSlotNo,string.getVar(),value);
    }

    /**
     *   (party_set_icon, <party_id>, <map_icon_id>),
     * @return
     */
    public Operation partySetIcon(MapIcon mapIcon){
        return new PartySetIcon(this.variable,mapIcon.getVar());
    }

    /**
     *   (party_set_banner_icon, <party_id>, <map_icon_id>),
     * @return
     */
    public Operation partySetBannerIcon(MapIcon mapIcon){
        return new PartySetBannerIcon(this.variable,mapIcon.getVar());
    }

    /**
     *   (party_force_add_members,<party_id>,<troop_id>,<number>),
     * @return
     */
    public Operation partyForceAddMembers(Troop troop,Variable number){
        return new PartyForceAddMembers(this.variable,troop.getVar(),number);
    }

    /**
     *   (party_stack_get_size,          <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyStackGetSize(Variable destination,Variable stackNo){
        return new PartyStackGetSize(destination,this.variable,stackNo);
    }

    /**
     *   (get_party_ai_current_object,<destination>,<party_id>),
     * @return
     */
    public Operation getPartyAiCurrentObject(Variable destination){
        return new GetPartyAiCurrentObject(destination,this.variable);
    }

    /**
     *   (remove_member_from_party,<troop_id>,[party_id]),
     * @return
     */
    public Operation removeMemberFromParty(Troop troop){
        return new RemoveMemberFromParty(troop.getVar(),this.variable);
    }

    /**
     *   (party_add_template, <party_id>, <party_template_id>, [reverse_prisoner_status]),
     * @return
     */
    public Operation partyAddTemplate(PartyTemplate partyTemplate,Variable reversePrisonerStatus){
        return new PartyAddTemplate(this.variable,partyTemplate.getVar(),reversePrisonerStatus);
    }

    /**
     *   (hero_can_join, [party_id]),
     * @return
     */
    public Operation heroCanJoin(){
        return new HeroCanJoin(this.variable);
    }

    /**
     *   (store_mum_regular_prisoners,<destination>,<party_id>),
     * @return
     */
    public Operation storeNumRegularPrisoners(Variable destination){
        return new StoreNumRegularPrisoners(destination,this.variable);
    }

    /**
     *   (get_party_ai_current_behavior,<destination>,<party_id>),
     * @return
     */
    public Operation getPartyAiCurrentBehavior(Variable destination){
        return new GetPartyAiCurrentBehavior(destination,this.variable);
    }

    /**
     *   (party_set_ai_initiative,<party_id>,<value>),  value is between 0-100
     * @return
     */
    public Operation partySetAiInitiative(Variable value){
        return new PartySetAiInitiative(this.variable,value);
    }

    /**
     *   (party_get_num_companions,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetNumCompanions(Variable destination){
        return new PartyGetNumCompanions(destination,this.variable);
    }

    /**
     *   (party_clear,<party_id>),
     * @return
     */
    public Operation partyClear(){
        return new PartyClear(this.variable);
    }

    /**
     *   (party_set_bandit_attraction, <party_id>,<attaraction>),  set how attractive a target the party is for bandits (0..100)
     * @return
     */
    public Operation partySetBanditAttraction(Variable attaraction){
        return new PartySetBanditAttraction(this.variable,attaraction);
    }

    /**
     *   (party_count_prisoners_of_type,<destination>,<party_id>,<troop_id>),
     * @return
     */
    public Operation partyCountPrisonersOfType(Variable destination,Troop troop){
        return new PartyCountPrisonersOfType(destination,this.variable,troop.getVar());
    }

    /**
     *   (party_stack_get_num_wounded,   <destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyStackGetNumWounded(Variable destination,Variable stackNo){
        return new PartyStackGetNumWounded(destination,this.variable,stackNo);
    }

    /**
     *   (party_quick_attach_to_current_battle, <party_id>, <side (0:players side, 1:enemy side)>),
     * @return
     */
    public Operation partyQuickAttachToCurrentBattle(Variable side){
        return new PartyQuickAttachToCurrentBattle(this.variable,side);
    }

    /**
     *   (heal_party,<party_id>),
     * @return
     */
    public Operation healParty(){
        return new HealParty(this.variable);
    }

    /**
     *   (party_add_members,<party_id>,<troop_id>,<number>),  returns number added in reg0
     * @return
     */
    public Operation partyAddMembers(Troop troop,Variable number){
        return new PartyAddMembers(this.variable,troop.getVar(),number);
    }

    /**
     *   (party_get_prisoner_stack_troop,<destination>,<party_id>,<stack_no>),
     * @return
     */
    public Operation partyPrisonerStackGetTroopId(Variable destination,Variable stackNo){
        return new PartyPrisonerStackGetTroopId(destination,this.variable,stackNo);
    }

    /**
     *   (change_screen_exchange_with_party, <party_id>),
     * @return
     */
    public Operation changeScreenExchangeWithParty(){
        return new ChangeScreenExchangeWithParty(this.variable);
    }

    /**
     *   selects party from which to buy mercenaries  (set_mercenary_source_party,<party_id>),
     * @return
     */
    public Operation setMercenarySourceParty(){
        return new SetMercenarySourceParty(this.variable);
    }

    /**
     *   (store_troop_count_companions,<destination>,<troop_id>,[party_id]),
     * @return
     */
    public Operation storeTroopCountCompanions(Variable destination,Troop troop){
        return new StoreTroopCountCompanions(destination,troop.getVar(),this.variable);
    }

    /**
     *   (party_get_current_terrain,<destination>,<party_id>),
     * @return
     */
    public Operation partyGetCurrentTerrain(Variable destination){
        return new PartyGetCurrentTerrain(destination,this.variable);
    }

    /**
     *   (party_clear_particle_systems, <party_id>),
     * @return
     */
    public Operation partyClearParticleSystems(){
        return new PartyClearParticleSystems(this.variable);
    }

    /**
     *   (party_is_in_any_town,<party_id>),
     * @return
     */
    public Operation partyIsInAnyTown(){
        return new PartyIsInAnyTown(this.variable);
    }

    /**
     *   (party_get_icon, <destination>, <party_id>),
     * @return
     */
    public Operation partyGetIcon(Variable destination){
        return new PartyGetIcon(destination,this.variable);
    }

    /**
     *   (party_is_active,<party_id>),
     * @return
     */
    public Operation partyIsActive(){
        return new PartyIsActive(this.variable);
    }

    /**
     *   (party_set_ai_target_position,<party_id>,<position_no>),
     * @return
     */
    public Operation partySetAiTargetPosition(PosVariable position){
        return new PartySetAiTargetPosition(this.variable,position.getVar());
    }

    /**
     *   (store_num_free_stacks,<destination>,<party_id>),
     * @return
     */
    public Operation storeNumFreeStacks(Variable destination){
        return new StoreNumFreeStacks(destination,this.variable);
    }

    /**
     *   (party_count_members_of_type,<destination>,<party_id>,<troop_id>),
     * @return
     */
    public Operation partyCountMembersOfType(Variable destination,Troop troop){
        return new PartyCountMembersOfType(destination,this.variable,troop.getVar());
    }

    /**
     *   (store_party_size_wo_prisoners,<destination>,[party_id]),
     * @return
     */
    public Operation storePartySizeWoPrisoners(Variable destination){
        return new StorePartySizeWoPrisoners(destination,this.variable);
    }

    /**
     *   (party_add_xp_to_stack, <party_id>, <stack_no>, <xp_amount>),
     * @return
     */
    public Operation partyAddXpToStack(Variable stackNo,Variable xpAmount){
        return new PartyAddXpToStack(this.variable,stackNo,xpAmount);
    }

    /**
     *   party_id should be different from 0  (add_gold_to_party,<value>,<party_id>),
     * @return
     */
    public Operation addGoldToParty(Variable value){
        return new AddGoldToParty(value,this.variable);
    }

    /**
     *   (store_troop_count_prisoners,<destination>,<troop_id>,[party_id]),
     * @return
     */
    public Operation storeTroopCountPrisoners(Variable destination,Troop troop){
        return new StoreTroopCountPrisoners(destination,troop.getVar(),this.variable);
    }


}