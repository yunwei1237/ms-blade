package com.tcf.ms.test;

import com.tcf.ms.command.core.operation.StrStoreTroopNamePlural;
import com.tcf.ms.command.core.operation.RemoveTroopsFromPrisoners;
import com.tcf.ms.command.core.operation.TroopRaiseAttribute;
import com.tcf.ms.command.core.operation.TroopIsMounted;
import com.tcf.ms.command.core.operation.TroopGetUpgradeTroop;
import com.tcf.ms.command.core.operation.TroopIsWounded;
import com.tcf.ms.command.core.operation.TroopRemoveItems;
import com.tcf.ms.command.core.object.handle.slot.TroopSlot;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.AddTroopToSite;
import com.tcf.ms.command.core.object.Skill;
import com.tcf.ms.command.core.operation.AddTroopNoteFromSreg;
import com.tcf.ms.command.core.operation.StoreQuestTroop;
import com.tcf.ms.command.core.operation.StoreFreeInventoryCapacity;
import com.tcf.ms.command.core.operation.StoreSkillLevel;
import com.tcf.ms.command.core.operation.StoreItemKindCount;
import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.operation.GetPlayerAgentOwnTroopKillCount;
import com.tcf.ms.command.core.operation.TroopsCanJoin;
import com.tcf.ms.command.core.operation.TroopSortInventory;
import com.tcf.ms.command.core.operation.TroopGetInventorySlotModifier;
import com.tcf.ms.command.core.operation.TroopEquipItems;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.operation.TroopInventorySlotGetItemMaxAmount;
import com.tcf.ms.command.core.operation.StoreTroopKindCount;
import com.tcf.ms.command.core.operation.AddTroopNoteFromDialog;
import com.tcf.ms.command.core.operation.TroopRaiseSkill;
import com.tcf.ms.command.core.object.GameString;
import com.tcf.ms.command.core.operation.TroopEnsureInventorySpace;
import com.tcf.ms.command.core.operation.TroopSetHealth;
import com.tcf.ms.command.core.operation.TroopRaiseProficiency;
import com.tcf.ms.command.core.operation.TroopSetFaction;
import com.tcf.ms.command.core.object.Attribute;
import com.tcf.ms.command.core.base.var.PosVariable;
import com.tcf.ms.command.core.operation.StoreAttributeLevel;
import com.tcf.ms.command.core.operation.StoreTroopGold;
import com.tcf.ms.command.core.operation.TroopAddGold;
import com.tcf.ms.command.core.operation.TroopSetType;
import com.tcf.ms.command.core.operation.TroopLootTroop;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.operation.TroopGetType;
import com.tcf.ms.command.core.operation.MainPartyHasTroop;
import com.tcf.ms.command.core.operation.SpawnAgent;
import com.tcf.ms.command.core.operation.TroopSetInventorySlotModifier;
import com.tcf.ms.command.core.operation.TroopAddItems;
import com.tcf.ms.command.core.operation.TroopJoin;
import com.tcf.ms.command.core.operation.SetVisitors;
import com.tcf.ms.command.core.operation.AgentGetTroopId;
import com.tcf.ms.command.core.operation.StoreCharacterLevel;
import com.tcf.ms.command.core.operation.TroopIsGuaranteeHorse;
import com.tcf.ms.command.core.operation.RemoveTroopsFromCompanions;
import com.tcf.ms.command.core.operation.StoreConversationTroop;
import com.tcf.ms.command.core.operation.StoreProficiencyLevel;
import com.tcf.ms.command.core.operation.AddTroopNoteTableauMesh;
import com.tcf.ms.command.core.operation.TroopHasItemEquipped;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.ChangeScreenLoot;
import com.tcf.ms.command.core.operation.StartMapConversation;
import com.tcf.ms.command.core.operation.AddPartyNoteTableauMesh;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.operation.StrStoreTroopName;
import com.tcf.ms.command.core.operation.StoreTroopFaction;
import com.tcf.ms.command.core.operation.TroopAddMerchandise;
import com.tcf.ms.command.core.operation.AddVisitorsToCurrentScene;
import com.tcf.ms.command.core.operation.StoreTroopValue;
import com.tcf.ms.command.core.operation.SetPlayerTroop;
import com.tcf.ms.command.core.operation.ChangeScreenEquipOther;
import com.tcf.ms.command.core.operation.TroopGetXp;
import com.tcf.ms.command.core.operation.TroopSetAutoEquip;
import com.tcf.ms.command.core.operation.StoreRandomTroopToRaise;
import com.tcf.ms.command.core.operation.TroopClearInventory;
import com.tcf.ms.command.core.object.ItemType;
import com.tcf.ms.command.core.operation.TroopInventorySlotGetItemAmount;
import com.tcf.ms.command.core.operation.CurTableauAddTroop;
import com.tcf.ms.command.core.operation.StrStoreTroopNameByCount;
import com.tcf.ms.command.core.operation.TroopAddItem;
import com.tcf.ms.command.core.operation.TroopIsHero;
import com.tcf.ms.command.core.base.var.SregVariable;
import com.tcf.ms.command.core.operation.TroopIsGuaranteeRanged;
import com.tcf.ms.command.core.operation.TroopRemoveItem;
import com.tcf.ms.command.core.operation.TroopGetInventoryCapacity;
import com.tcf.ms.command.core.operation.TroopAddProficiencyPoints;
import com.tcf.ms.command.core.operation.StoreTroopHealth;
import com.tcf.ms.command.core.operation.TroopInventorySlotSetItemAmount;
import com.tcf.ms.command.core.operation.StrStoreTroopNameLink;
import com.tcf.ms.command.core.operation.AddQuestNoteTableauMesh;
import com.tcf.ms.command.core.operation.TroopRemoveGold;
import com.tcf.ms.command.core.operation.AddFactionNoteTableauMesh;
import com.tcf.ms.command.core.operation.SetVisitor;
import com.tcf.ms.command.core.operation.StoreRandomTroopToCapture;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.RemoveTroopFromSite;
import com.tcf.ms.command.core.operation.TroopRaiseProficiencyLinear;
import com.tcf.ms.command.core.object.Animation;
import com.tcf.ms.command.core.object.Scene;
import com.tcf.ms.command.core.operation.StartMissionConversation;
import com.tcf.ms.command.core.operation.AddXpToTroop;
import com.tcf.ms.command.core.operation.TroopSetInventorySlot;
import com.tcf.ms.command.core.operation.TroopJoinAsPrisoner;
import com.tcf.ms.command.core.operation.TroopsCanJoinAsPrisoner;
import com.tcf.ms.command.core.operation.TroopGetInventorySlot;
import com.tcf.ms.command.core.operation.AddGoldAsXp;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class TroopHandle {

    private StringVariable variable;

    public TroopHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new TroopSlot(this.variable);
    }

    /**
     *   (store_conversation_troop,<destination>),
     * @return
     */
    public static Operation storeConversationTroop(Variable destination){
        return new StoreConversationTroop(destination);
    }

    /**
     *   (troop_loot_troop,<target_troop>,<source_troop_id>,<probability>), 
     * @return
     */
    public static Operation troopLootTroop(Variable targetTroop,Variable sourceTroopId,Variable probability){
        return new TroopLootTroop(targetTroop,sourceTroopId,probability);
    }

    /**
     *   (troops_can_join,<value>),
     * @return
     */
    public static Operation troopsCanJoin(Variable value){
        return new TroopsCanJoin(value);
    }

    /**
     *   (store_random_troop_to_capture,<destination>,<lower_bound>,<upper_bound>),
     * @return
     */
    public static Operation storeRandomTroopToCapture(Variable destination,Variable lowerBound,Variable upperBound){
        return new StoreRandomTroopToCapture(destination,lowerBound,upperBound);
    }

    /**
     *   (agent_get_troop_id,<destination>, <agent_id>),
     * @return
     */
    public static Operation agentGetTroopId(Variable destination,Agent agent){
        return new AgentGetTroopId(destination,agent.getVar());
    }

    /**
     *   deprecated, use party_count_members_of_type instead
     * @return
     */
    @Deprecated
    public static Operation storeTroopKindCount(){
        return new StoreTroopKindCount();
    }

    /**
     *   (get_player_agent_own_troop_kill_count,<destination>,[get_wounded]),  Set second value to non-zero to getGroup wounded count
     * @return
     */
    public static Operation getPlayerAgentOwnTroopKillCount(Variable destination,Variable getWounded){
        return new GetPlayerAgentOwnTroopKillCount(destination,getWounded);
    }

    /**
     *   (troop_set_health,<troop_id>,<relative health (0-100)>),
     * @return
     */
    public static Operation troopSetHealth(){
        return new TroopSetHealth();
    }

    /**
     *   (store_random_troop_to_raise,<destination>,<lower_bound>,<upper_bound>),
     * @return
     */
    public static Operation storeRandomTroopToRaise(Variable destination,Variable lowerBound,Variable upperBound){
        return new StoreRandomTroopToRaise(destination,lowerBound,upperBound);
    }

    /**
     *   (troops_can_join_as_prisoner,<value>),
     * @return
     */
    public static Operation troopsCanJoinAsPrisoner(Variable value){
        return new TroopsCanJoinAsPrisoner(value);
    }

    /**
     *   (troop_is_hero,<troop_id>),
     * @return
     */
    public Operation troopIsHero(){
        return new TroopIsHero(this.variable);
    }

    /**
     *   (store_troop_health,<destination>,<troop_id>,[absolute]),  set absolute to 1 to getGroup actual health; otherwise this will return percentage health in range (0-100)
     * @return
     */
    public Operation storeTroopHealth(Variable destination,Variable absolute){
        return new StoreTroopHealth(destination,this.variable,absolute);
    }

    /**
     *   (add_troop_note_from_sreg,<troop_id>,<note_slot_no>,<string_id>, <value>),  There are maximum of 8 slots value = 1 -> shows when the note is added
     * @return
     */
    public Operation addTroopNoteFromSreg(Variable noteSlotNo,GameString string,Variable value){
        return new AddTroopNoteFromSreg(this.variable,noteSlotNo,string.getVar(),value);
    }

    /**
     *   (troop_add_merchandise,<troop_id>,<item_type_id>,<value>),
     * @return
     */
    public Operation troopAddMerchandise(ItemType itemType,Variable value){
        return new TroopAddMerchandise(this.variable,itemType.getVar(),value);
    }

    /**
     *   (troop_set_inventory_slot_modifier,<troop_id>,<inventory_slot_no>,<value>),
     * @return
     */
    public Operation troopSetInventorySlotModifier(Variable inventorySlotNo,Variable value){
        return new TroopSetInventorySlotModifier(this.variable,inventorySlotNo,value);
    }

    /**
     *   (spawn_agent,<troop_id>), (stores agent_id in reg0)
     * @return
     */
    public Operation spawnAgent(){
        return new SpawnAgent(this.variable);
    }

    /**
     *   (troop_is_guarantee_ranged, <troop_id>),
     * @return
     */
    public Operation troopIsGuaranteeRanged(){
        return new TroopIsGuaranteeRanged(this.variable);
    }

    /**
     *   (add_troop_note_from_dialog,<troop_id>,<note_slot_no>, <value>),  There are maximum of 8 slots. value = 1 -> shows when the note is added
     * @return
     */
    public Operation addTroopNoteFromDialog(Variable noteSlotNo,Variable value){
        return new AddTroopNoteFromDialog(this.variable,noteSlotNo,value);
    }

    /**
     *   (troop_add_gold,<troop_id>,<value>),
     * @return
     */
    public Operation troopAddGold(Variable value){
        return new TroopAddGold(this.variable,value);
    }

    /**
     *   (add_quest_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public Operation addQuestNoteTableauMesh(TableauMaterial tableauMaterial){
        return new AddQuestNoteTableauMesh(this.variable,tableauMaterial.getVar());
    }

    /**
     *   (str_store_troop_name_plural,<string_register>,<troop_id>),
     * @return
     */
    public Operation strStoreTroopNamePlural(SregVariable stringRegister){
        return new StrStoreTroopNamePlural(stringRegister.getVar(),this.variable);
    }

    /**
     *   (change_screen_loot, <troop_id>),
     * @return
     */
    public Operation changeScreenLoot(){
        return new ChangeScreenLoot(this.variable);
    }

    /**
     *   (troop_set_auto_equip,<troop_id>,<value>), disables otr enables auto-equipping
     * @return
     */
    public Operation troopSetAutoEquip(Variable value){
        return new TroopSetAutoEquip(this.variable,value);
    }

    /**
     *   (str_store_troop_name,<string_register>,<troop_id>),
     * @return
     */
    public Operation strStoreTroopName(SregVariable stringRegister){
        return new StrStoreTroopName(stringRegister.getVar(),this.variable);
    }

    /**
     *   (store_character_level,<destination>,[troop_id]),
     * @return
     */
    public Operation storeCharacterLevel(Variable destination){
        return new StoreCharacterLevel(destination,this.variable);
    }

    /**
     *   (remove_troops_from_prisoners,<troop_id>,<value>),
     * @return
     */
    public Operation removeTroopsFromPrisoners(Variable value){
        return new RemoveTroopsFromPrisoners(this.variable,value);
    }

    /**
     *   (troop_ensure_inventory_space,<troop_id>,<value>),
     * @return
     */
    public Operation troopEnsureInventorySpace(Variable value){
        return new TroopEnsureInventorySpace(this.variable,value);
    }

    /**
     *   (troop_raise_proficiency,<troop_id>,<proficiency_no>,<value>),
     * @return
     */
    public Operation troopRaiseProficiency(Variable proficiencyNo,Variable value){
        return new TroopRaiseProficiency(this.variable,proficiencyNo,value);
    }

    /**
     *   (troop_inventory_slot_get_item_max_amount,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public Operation troopInventorySlotGetItemMaxAmount(Variable destination,Variable inventorySlotNo){
        return new TroopInventorySlotGetItemMaxAmount(destination,this.variable,inventorySlotNo);
    }

    /**
     *   (set_visitors,<entry_no>,<troop_id>,<number_of_troops>),
     * @return
     */
    public Operation setVisitors(Variable entryNo,Variable numberOfTroops){
        return new SetVisitors(entryNo,this.variable,numberOfTroops);
    }

    /**
     *   (troop_is_wounded,<troop_id>),  only for heroes!
     * @return
     */
    public Operation troopIsWounded(){
        return new TroopIsWounded(this.variable);
    }

    /**
     *   (troop_get_inventory_capacity,<destination>,<troop_id>),
     * @return
     */
    public Operation troopGetInventoryCapacity(Variable destination){
        return new TroopGetInventoryCapacity(destination,this.variable);
    }

    /**
     *   (store_troop_gold,<destination>,<troop_id>),
     * @return
     */
    public Operation storeTroopGold(Variable destination){
        return new StoreTroopGold(destination,this.variable);
    }

    /**
     *   (remove_troop_from_site,<troop_id>,<scene_id>),
     * @return
     */
    public Operation removeTroopFromSite(Scene scene){
        return new RemoveTroopFromSite(this.variable,scene.getVar());
    }

    /**
     *   (troop_get_inventory_slot,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public Operation troopGetInventorySlot(Variable destination,Variable inventorySlotNo){
        return new TroopGetInventorySlot(destination,this.variable,inventorySlotNo);
    }

    /**
     *   (start_map_conversation,<troop_id>),
     * @return
     */
    public Operation startMapConversation(){
        return new StartMapConversation(this.variable);
    }

    /**
     *   (set_player_troop,<troop_id>),
     * @return
     */
    public Operation setPlayerTroop(){
        return new SetPlayerTroop(this.variable);
    }

    /**
     *   (add_party_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public Operation addPartyNoteTableauMesh(TableauMaterial tableauMaterial){
        return new AddPartyNoteTableauMesh(this.variable,tableauMaterial.getVar());
    }

    /**
     *   (troop_raise_attribute,<troop_id>,<attribute_id>,<value>),
     * @return
     */
    public Operation troopRaiseAttribute(Attribute attribute,Variable value){
        return new TroopRaiseAttribute(this.variable,attribute.getVar(),value);
    }

    /**
     *   (add_gold_as_xp,<value>,[troop_id]),
     * @return
     */
    public Operation addGoldAsXp(Variable value){
        return new AddGoldAsXp(value,this.variable);
    }

    /**
     *   (troop_set_inventory_slot,<troop_id>,<inventory_slot_no>,<value>),
     * @return
     */
    public Operation troopSetInventorySlot(Variable inventorySlotNo,Variable value){
        return new TroopSetInventorySlot(this.variable,inventorySlotNo,value);
    }

    /**
     *   (troop_add_items,<troop_id>,<item_id>,<number>),
     * @return
     */
    public Operation troopAddItems(Item item,Variable number){
        return new TroopAddItems(this.variable,item.getVar(),number);
    }

    /**
     *   (troop_join_as_prisoner,<troop_id>),
     * @return
     */
    public Operation troopJoinAsPrisoner(){
        return new TroopJoinAsPrisoner(this.variable);
    }

    /**
     *   (troop_add_proficiency_points,<troop_id>,<value>),					
     * @return
     */
    public Operation troopAddProficiencyPoints(Variable value){
        return new TroopAddProficiencyPoints(this.variable,value);
    }

    /**
     *   (store_quest_troop,<destination>,<troop_id>),
     * @return
     */
    public Operation storeQuestTroop(Variable destination){
        return new StoreQuestTroop(destination,this.variable);
    }

    /**
     *   (troop_sort_inventory,<troop_id>),
     * @return
     */
    public Operation troopSortInventory(){
        return new TroopSortInventory(this.variable);
    }

    /**
     *   (troop_add_item,<troop_id>,<item_id>,[modifier]),
     * @return
     */
    public Operation troopAddItem(Item item,Variable modifier){
        return new TroopAddItem(this.variable,item.getVar(),modifier);
    }

    /**
     *   (troop_is_guarantee_horse, <troop_id>),
     * @return
     */
    public Operation troopIsGuaranteeHorse(){
        return new TroopIsGuaranteeHorse(this.variable);
    }

    /**
     *   (store_item_kind_count,<destination>,<item_id>,[troop_id]),
     * @return
     */
    public Operation storeItemKindCount(Variable destination,Item item){
        return new StoreItemKindCount(destination,item.getVar(),this.variable);
    }

    /**
     *   (add_troop_to_site,<troop_id>,<scene_id>,<entry_no>),
     * @return
     */
    public Operation addTroopToSite(Scene scene,Variable entryNo){
        return new AddTroopToSite(this.variable,scene.getVar(),entryNo);
    }

    /**
     *   (troop_raise_skill,<troop_id>,<skill_id>,<value>),
     * @return
     */
    public Operation troopRaiseSkill(Skill skill,Variable value){
        return new TroopRaiseSkill(this.variable,skill.getVar(),value);
    }

    /**
     *   (troop_equip_items,<troop_id>),  equips the items in the inventory automatically
     * @return
     */
    public Operation troopEquipItems(){
        return new TroopEquipItems(this.variable);
    }

    /**
     *   (troop_inventory_slot_set_item_amount,<troop_id>,<inventory_slot_no>,<value>),
     * @return
     */
    public Operation troopInventorySlotSetItemAmount(Variable inventorySlotNo,Variable value){
        return new TroopInventorySlotSetItemAmount(this.variable,inventorySlotNo,value);
    }

    /**
     *   (add_faction_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public Operation addFactionNoteTableauMesh(TableauMaterial tableauMaterial){
        return new AddFactionNoteTableauMesh(this.variable,tableauMaterial.getVar());
    }

    /**
     *   (main_party_has_troop,<troop_id>),
     * @return
     */
    public Operation mainPartyHasTroop(){
        return new MainPartyHasTroop(this.variable);
    }

    /**
     *   (troop_remove_gold,<troop_id>,<value>),
     * @return
     */
    public Operation troopRemoveGold(Variable value){
        return new TroopRemoveGold(this.variable,value);
    }

    /**
     *   (start_mission_conversation,<troop_id>),
     * @return
     */
    public Operation startMissionConversation(){
        return new StartMissionConversation(this.variable);
    }

    /**
     *   (add_visitors_to_current_scene,<entry_no>,<troop_id>,<number_of_troops>),
     * @return
     */
    public Operation addVisitorsToCurrentScene(Variable entryNo,Variable numberOfTroops){
        return new AddVisitorsToCurrentScene(entryNo,this.variable,numberOfTroops);
    }

    /**
     *   (store_skill_level,<destination>,<skill_id>,[troop_id]),
     * @return
     */
    public Operation storeSkillLevel(Variable destination,Skill skill){
        return new StoreSkillLevel(destination,skill.getVar(),this.variable);
    }

    /**
     *   (troop_set_faction,<troop_id>,<faction_id>),
     * @return
     */
    public Operation troopSetFaction(Faction faction){
        return new TroopSetFaction(this.variable,faction.getVar());
    }

    /**
     *   (set_visitor,<entry_no>,<troop_id>,[<dna>]),
     * @return
     */
    public Operation setVisitor(Variable entryNo,Variable dna){
        return new SetVisitor(entryNo,this.variable,dna);
    }

    /**
     *   (troop_get_inventory_slot_modifier,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public Operation troopGetInventorySlotModifier(Variable destination,Variable inventorySlotNo){
        return new TroopGetInventorySlotModifier(destination,this.variable,inventorySlotNo);
    }

    /**
     *   (troop_is_mounted,<troop_id>),
     * @return
     */
    public Operation troopIsMounted(){
        return new TroopIsMounted(this.variable);
    }

    /**
     *   (troop_set_type,<troop_id>,<gender>),
     * @return
     */
    public Operation troopSetType(Variable gender){
        return new TroopSetType(this.variable,gender);
    }

    /**
     *   (store_free_inventory_capacity,<destination>,[troop_id]),
     * @return
     */
    public Operation storeFreeInventoryCapacity(Variable destination){
        return new StoreFreeInventoryCapacity(destination,this.variable);
    }

    /**
     *   puts cost of items to reg0  (troop_remove_items,<troop_id>,<item_id>,<number>),
     * @return
     */
    public Operation troopRemoveItems(Item item,Variable number){
        return new TroopRemoveItems(this.variable,item.getVar(),number);
    }

    /**
     *   (troop_get_upgrade_troop,<destination>,<troop_id>,<upgrade_path>),  upgrade_path can be: 0 = random, 1 = getGroup first node, 2 = getGroup second node (returns -1 if not available)
     * @return
     */
    public Operation troopGetUpgradeTroop(Variable destination,Variable upgradePath){
        return new TroopGetUpgradeTroop(destination,this.variable,upgradePath);
    }

    /**
     *   (troop_join,<troop_id>),
     * @return
     */
    public Operation troopJoin(){
        return new TroopJoin(this.variable);
    }

    /**
     *   (add_troop_note_tableau_mesh,<troop_id>,<tableau_material_id>),
     * @return
     */
    public Operation addTroopNoteTableauMesh(TableauMaterial tableauMaterial){
        return new AddTroopNoteTableauMesh(this.variable,tableauMaterial.getVar());
    }

    /**
     *   (cur_tableau_add_troop, <troop_id>, <position_no>, <animation_id>, <instance_no>),  if instance_no value is 0 or less, then the face is not generated randomly (important for heroes)
     * @return
     */
    public Operation curTableauAddTroop(PosVariable position,Animation animation,Variable instanceNo){
        return new CurTableauAddTroop(this.variable,position.getVar(),animation.getVar(),instanceNo);
    }

    /**
     *   (store_troop_faction,<destination>,<troop_id>),
     * @return
     */
    public Operation storeTroopFaction(Variable destination){
        return new StoreTroopFaction(destination,this.variable);
    }

    /**
     *   (troop_get_xp, <destination>, <troop_id>),
     * @return
     */
    public Operation troopGetXp(Variable destination){
        return new TroopGetXp(destination,this.variable);
    }

    /**
     *   raises weapon proficiencies linearly without being limited by weapon master skill  (troop_raise_proficiency,<troop_id>,<proficiency_no>,<value>),
     * @return
     */
    public Operation troopRaiseProficiencyLinear(Variable proficiencyNo,Variable value){
        return new TroopRaiseProficiencyLinear(this.variable,proficiencyNo,value);
    }

    /**
     *   (troop_has_item_equipped,<troop_id>,<item_id>),
     * @return
     */
    public Operation troopHasItemEquipped(Item item){
        return new TroopHasItemEquipped(this.variable,item.getVar());
    }

    /**
     *   (store_proficiency_level,<destination>,<troop_id>,<attribute_id>),
     * @return
     */
    public Operation storeProficiencyLevel(Variable destination,Attribute attribute){
        return new StoreProficiencyLevel(destination,this.variable,attribute.getVar());
    }

    /**
     *   (troop_remove_item,<troop_id>,<item_id>),
     * @return
     */
    public Operation troopRemoveItem(Item item){
        return new TroopRemoveItem(this.variable,item.getVar());
    }

    /**
     *   (add_xp_to_troop,<value>,[troop_id]),
     * @return
     */
    public Operation addXpToTroop(Variable value){
        return new AddXpToTroop(value,this.variable);
    }

    /**
     *   (troop_inventory_slot_get_item_amount,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public Operation troopInventorySlotGetItemAmount(Variable destination,Variable inventorySlotNo){
        return new TroopInventorySlotGetItemAmount(destination,this.variable,inventorySlotNo);
    }

    /**
     *   (str_store_troop_name_link,<string_register>,<troop_id>),
     * @return
     */
    public Operation strStoreTroopNameLink(SregVariable stringRegister){
        return new StrStoreTroopNameLink(stringRegister.getVar(),this.variable);
    }

    /**
     *   (troop_get_type,<destination>,<troop_id>),
     * @return
     */
    public Operation troopGetType(Variable destination){
        return new TroopGetType(destination,this.variable);
    }

    /**
     *   (store_attribute_level,<destination>,<troop_id>,<attribute_id>),
     * @return
     */
    public Operation storeAttributeLevel(Variable destination,Attribute attribute){
        return new StoreAttributeLevel(destination,this.variable,attribute.getVar());
    }

    /**
     *   (change_screen_equip_other, <troop_id>),
     * @return
     */
    public Operation changeScreenEquipOther(){
        return new ChangeScreenEquipOther(this.variable);
    }

    /**
     *   (remove_troops_from_companions,<troop_id>,<value>),
     * @return
     */
    public Operation removeTroopsFromCompanions(Variable value){
        return new RemoveTroopsFromCompanions(this.variable,value);
    }

    /**
     *   (troop_clear_inventory,<troop_id>),
     * @return
     */
    public Operation troopClearInventory(){
        return new TroopClearInventory(this.variable);
    }

    /**
     *   (store_troop_value,<destination>,<troop_id>),
     * @return
     */
    public Operation storeTroopValue(Variable destination){
        return new StoreTroopValue(destination,this.variable);
    }

    /**
     *   (str_store_troop_name_by_count,<string_register>,<troop_id>,<number>),
     * @return
     */
    public Operation strStoreTroopNameByCount(SregVariable stringRegister,Variable number){
        return new StrStoreTroopNameByCount(stringRegister.getVar(),this.variable,number);
    }


}