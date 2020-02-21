package com.tcf.ms.command.core;

import com.tcf.ms.command.core.base.var.Variable;

public class Operations {

    public static String itemGetSlot(Variable destination,Variable itemId,Variable slotNo){
        return String.format("(item_get_slot,%s,%s,%s),",destination,itemId,slotNo);
    }

    public static String agentSlotGe(Variable agentId,Variable slotNo,Variable value){
        return String.format("(agent_slot_ge,%s,%s,%s),",agentId,slotNo,value);
    }

    public static String agentSetAnimation(Variable agentId,Variable animId){
        return String.format("(agent_set_animation,%s,%s),",agentId,animId);
    }

    public static String scenePropGetInstance(Variable destination,Variable scenePropId,Variable instanceNo){
        return String.format("(scene_prop_get_instance,%s,%s,%s),",destination,scenePropId,instanceNo);
    }

    public static String changeScreenTrade(){
        return String.format("(change_screen_trade),");
    }

    public static String agentSetScriptedDestination(Variable agentId,Variable positionNo,Variable autoSetZToGroundLevel){
        return String.format("(agent_set_scripted_destination,%s,%s,%s),",agentId,positionNo,autoSetZToGroundLevel);
    }

    public static String shuffleRange(Variable regNo,Variable regNo2){
        return String.format("(shuffle_range,%s,%s),",regNo,regNo2);
    }

    public static String propInstanceAnimateToPosition(){
        return String.format("(prop_instance_animate_to_position),");
    }

    public static String partyGetTemplateId(Variable destination,Variable partyId){
        return String.format("(party_get_template_id,%s,%s),",destination,partyId);
    }

    public static String partyGetNumPrisonerStacks(Variable destination,Variable partyId){
        return String.format("(party_get_num_prisoner_stacks,%s,%s),",destination,partyId);
    }

    public static String troopIsHero(Variable troopId){
        return String.format("(troop_is_hero,%s),",troopId);
    }

    public static String missionCamAnimateToAparture(){
        return String.format("(mission_cam_animate_to_aparture),");
    }

    public static String tryForRange(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(try_for_range,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String positionGetScaleZ(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_scale_z,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String partySetNextBattleSimulationTime(Variable partyId,Variable nextSimulationTimeInHours){
        return String.format("(party_set_next_battle_simulation_time,%s,%s),",partyId,nextSimulationTimeInHours);
    }

    public static String teamGetLeader(Variable destination,Variable teamNo){
        return String.format("(team_get_leader,%s,%s),",destination,teamNo);
    }

    public static String positionGetScaleX(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_scale_x,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String positionGetScaleY(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_scale_y,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String curMapIconSetTableauMaterial(Variable tableauMaterialId,Variable instanceCode){
        return String.format("(cur_map_icon_set_tableau_material,%s,%s),",tableauMaterialId,instanceCode);
    }

    public static String agentGetRider(Variable destination,Variable agentId){
        return String.format("(agent_get_rider,%s,%s),",destination,agentId);
    }

    public static String partyPrisonerStackGetSize(){
        return String.format("(party_prisoner_stack_get_size),");
    }

    public static String storeTroopHealth(Variable destination,Variable troopId,Variable absolute){
        return String.format("(store_troop_health,%s,%s,%s),",destination,troopId,absolute);
    }

    public static String addFactionNoteFromDialog(Variable factionId,Variable noteSlotNo,Variable value){
        return String.format("(add_faction_note_from_dialog,%s,%s,%s),",factionId,noteSlotNo,value);
    }

    public static String partyAddPrisoners(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_add_prisoners,%s,%s,%s),",partyId,troopId,number);
    }

    public static String addTroopNoteFromSreg(Variable troopId,Variable noteSlotNo,Variable stringId,Variable value){
        return String.format("(add_troop_note_from_sreg,%s,%s,%s,%s),",troopId,noteSlotNo,stringId,value);
    }

    public static String teamsAreEnemies(Variable teamNo,Variable teamNo2){
        return String.format("(teams_are_enemies,%s,%s),",teamNo,teamNo2);
    }

    public static String storePartySize(Variable destination,Variable partyId){
        return String.format("(store_party_size,%s,%s),",destination,partyId);
    }

    public static String resetVisitors(){
        return String.format("(reset_visitors),");
    }

    public static String agentGetClass(Variable destination,Variable agentId){
        return String.format("(agent_get_class,%s,%s),",destination,agentId);
    }

    public static String sceneSlotEq(Variable sceneId,Variable slotNo,Variable value){
        return String.format("(scene_slot_eq,%s,%s,%s),",sceneId,slotNo,value);
    }

    public static String troopAddMerchandise(Variable troopId,Variable itemTypeId,Variable value){
        return String.format("(troop_add_merchandise,%s,%s,%s),",troopId,itemTypeId,value);
    }

    public static String troopSetInventorySlotModifier(Variable troopId,Variable inventorySlotNo,Variable value){
        return String.format("(troop_set_inventory_slot_modifier,%s,%s,%s),",troopId,inventorySlotNo,value);
    }

    public static String questionBox(){
        return String.format("(question_box),");
    }

    public static String partyRemoveMembers(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_remove_members,%s,%s,%s),",partyId,troopId,number);
    }

    public static String addFactionNoteFromSreg(Variable factionId,Variable noteSlotNo,Variable stringId,Variable value){
        return String.format("(add_faction_note_from_sreg,%s,%s,%s,%s),",factionId,noteSlotNo,stringId,value);
    }

    public static String overlayAnimateToColor(){
        return String.format("(overlay_animate_to_color),");
    }

    public static String curTableauClearOverrideItems(){
        return String.format("(cur_tableau_clear_override_items),");
    }

    public static String storeNumPartiesDestroyedByPlayer(Variable destination,Variable partyTemplateId){
        return String.format("(store_num_parties_destroyed_by_player,%s,%s),",destination,partyTemplateId);
    }

    public static String getGlobalCloudAmount(Variable destination){
        return String.format("(get_global_cloud_amount,%s),",destination);
    }

    public static String partyWoundMembers(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_wound_members,%s,%s,%s),",partyId,troopId,number);
    }

    public static String agentIsAlly(Variable agentId){
        return String.format("(agent_is_ally,%s),",agentId);
    }

    public static String partyRemoveMembersWoundedFirst(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_remove_members_wounded_first,%s,%s,%s),",partyId,troopId,number);
    }

    public static String partySetAiPatrolRadius(Variable partyId,Variable radiusInKm){
        return String.format("(party_set_ai_patrol_radius,%s,%s),",partyId,radiusInKm);
    }

    public static String curTableauAddMeshWithVertexColor(Variable meshId,Variable positionNo,Variable valueFixedPoint,Variable valueFixedPoint2,Variable value){
        return String.format("(cur_tableau_add_mesh_with_vertex_color,%s,%s,%s,%s,%s),",meshId,positionNo,valueFixedPoint,valueFixedPoint2,value);
    }

    public static String spawnAgent(Variable troopId){
        return String.format("(spawn_agent,%s),",troopId);
    }

    public static String agentGetItemId(Variable destination,Variable agentId){
        return String.format("(agent_get_item_id,%s,%s),",destination,agentId);
    }

    public static String storeItemValue(Variable destination,Variable itemId){
        return String.format("(store_item_value,%s,%s),",destination,itemId);
    }

    public static String partyDetach(Variable partyId){
        return String.format("(party_detach,%s),",partyId);
    }

    public static String strStorePartyName(Variable stringRegister,Variable partyId){
        return String.format("(str_store_party_name,%s,%s),",stringRegister,partyId);
    }

    public static String partySetPosition(Variable partyId,Variable positionNo){
        return String.format("(party_set_position,%s,%s),",partyId,positionNo);
    }

    public static String strStoreFactionName(Variable stringRegister,Variable factionId){
        return String.format("(str_store_faction_name,%s,%s),",stringRegister,factionId);
    }

    public static String agentGetEntryNo(Variable destination,Variable agentId){
        return String.format("(agent_get_entry_no,%s,%s),",destination,agentId);
    }

    public static String setFogDistance(Variable distanceInMeters,Variable fogColor){
        return String.format("(set_fog_distance,%s,%s),",distanceInMeters,fogColor);
    }

    public static String storeOr(Variable destination,Variable value,Variable value2){
        return String.format("(store_or,%s,%s,%s),",destination,value,value2);
    }

    public static String setTriggerResult(Variable value){
        return String.format("(set_trigger_result,%s),",value);
    }

    public static String partyGetPosition(Variable positionNo,Variable partyId){
        return String.format("(party_get_position,%s,%s),",positionNo,partyId);
    }

    public static String agentSetAnimationProgress(Variable agentId,Variable valueFixedPoint){
        return String.format("(agent_set_animation_progress,%s,%s),",agentId,valueFixedPoint);
    }

    public static String partySetFlags(){
        return String.format("(party_set_flags),");
    }

    public static String strStoreQuestNameLink(Variable stringRegister,Variable factionId){
        return String.format("(str_store_quest_name_link,%s,%s),",stringRegister,factionId);
    }

    public static String valMul(Variable destination,Variable value){
        return String.format("(val_mul,%s,%s),",destination,value);
    }

    public static String mapGetWaterPositionAroundPosition(Variable destPositionNo,Variable sourcePositionNo,Variable radius){
        return String.format("(map_get_water_position_around_position,%s,%s,%s),",destPositionNo,sourcePositionNo,radius);
    }

    public static String partySetName(Variable partyId,Variable stringNo){
        return String.format("(party_set_name,%s,%s),",partyId,stringNo);
    }

    public static String propInstanceGetScale(Variable positionNo,Variable scenePropId){
        return String.format("(prop_instance_get_scale,%s,%s),",positionNo,scenePropId);
    }

    public static String initPosition(Variable positionNo){
        return String.format("(init_position,%s),",positionNo);
    }

    public static String changeScreenGiveMembers(){
        return String.format("(change_screen_give_members),");
    }

    public static String troopIsGuaranteeRanged(Variable troopId){
        return String.format("(troop_is_guarantee_ranged,%s),",troopId);
    }

    public static String addTroopNoteFromDialog(Variable troopId,Variable noteSlotNo,Variable value){
        return String.format("(add_troop_note_from_dialog,%s,%s,%s),",troopId,noteSlotNo,value);
    }

    public static String troopAddGold(Variable troopId,Variable value){
        return String.format("(troop_add_gold,%s,%s),",troopId,value);
    }

    public static String scenePropDisable(Variable scenePropId){
        return String.format("(scene_prop_disable,%s),",scenePropId);
    }

    public static String overlaySetVal(Variable overlayId,Variable value){
        return String.format("(overlay_set_val,%s,%s),",overlayId,value);
    }

    public static String agentIsWounded(Variable agentId){
        return String.format("(agent_is_wounded,%s),",agentId);
    }

@Deprecated
    public static String endTry(){
        return String.format("(end_try),");
    }

    public static String setPriceRateForItem(Variable itemId,Variable valuePercentage){
        return String.format("(set_price_rate_for_item,%s,%s),",itemId,valuePercentage);
    }

    public static String distributePartyAmongPartyGroup(Variable partyToBeDistributed,Variable groupRootParty){
        return String.format("(distribute_party_among_party_group,%s,%s),",partyToBeDistributed,groupRootParty);
    }

    public static String changeScreenQuit(){
        return String.format("(change_screen_quit),");
    }

    public static String positionIsBehindPosition(Variable positionNo1,Variable positionNo2){
        return String.format("(position_is_behind_position,%s,%s),",positionNo1,positionNo2);
    }

    public static String heroCanJoinAsPrisoner(Variable partyId){
        return String.format("(hero_can_join_as_prisoner,%s),",partyId);
    }

    public static String classIsListeningOrder(Variable teamNo,Variable subClass){
        return String.format("(class_is_listening_order,%s,%s),",teamNo,subClass);
    }

    public static String storeRepeatObject(){
        return String.format("(store_repeat_object),");
    }

    public static String addQuestNoteTableauMesh(Variable troopId,Variable tableauMaterialId){
        return String.format("(add_quest_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }

    public static String strStoreTroopNamePlural(Variable stringRegister,Variable troopId){
        return String.format("(str_store_troop_name_plural,%s,%s),",stringRegister,troopId);
    }

    public static String gameKeyIsDown(){
        return String.format("(game_key_is_down),");
    }

    public static String partyGetAiTargetPosition(Variable positionNo,Variable partyId){
        return String.format("(party_get_ai_target_position,%s,%s),",positionNo,partyId);
    }

    public static String musicSetCulture(Variable cultureType){
        return String.format("(music_set_culture,%s),",cultureType);
    }

    public static String partyAddLeader(){
        return String.format("(party_add_leader),");
    }

    public static String partyCanJoin(){
        return String.format("(party_can_join),");
    }

    public static String missionCamSetPosition(){
        return String.format("(mission_cam_set_position),");
    }

    public static String partyAddParticleSystem(Variable partyId,Variable particleSystemId){
        return String.format("(party_add_particle_system,%s,%s),",partyId,particleSystemId);
    }

    public static String addCompanionParty(Variable troopIdHero){
        return String.format("(add_companion_party,%s),",troopIdHero);
    }

    public static String storeConversationTroop(Variable destination){
        return String.format("(store_conversation_troop,%s),",destination);
    }

    public static String storeAllyCount(Variable destination){
        return String.format("(store_ally_count,%s),",destination);
    }

    public static String storeRandomArmor(){
        return String.format("(store_random_armor),");
    }

    public static String teamGetRidingOrder(Variable destination,Variable teamNo,Variable subClass){
        return String.format("(team_get_riding_order,%s,%s,%s),",destination,teamNo,subClass);
    }

    public static String partyGetNumCompanionStacks(Variable destination,Variable partyId){
        return String.format("(party_get_num_companion_stacks,%s,%s),",destination,partyId);
    }

    public static String jumpToMenu(Variable menuId){
        return String.format("(jump_to_menu,%s),",menuId);
    }

    public static String getDistanceBetweenPositions(Variable destination,Variable positionNo1,Variable positionNo2){
        return String.format("(get_distance_between_positions,%s,%s,%s),",destination,positionNo1,positionNo2);
    }

    public static String curTableauAddMapIcon(Variable mapIconId,Variable positionNo,Variable valueFixedPoint){
        return String.format("(cur_tableau_add_map_icon,%s,%s,%s),",mapIconId,positionNo,valueFixedPoint);
    }

    public static String partySetExtraText(){
        return String.format("(party_set_extra_text),");
    }

    public static String storeAdd(Variable destination,Variable value,Variable value2){
        return String.format("(store_add,%s,%s,%s),",destination,value,value2);
    }

    public static String factionSetColor(Variable factionId,Variable value){
        return String.format("(faction_set_color,%s,%s),",factionId,value);
    }

    public static String storeSin(Variable destinationFixedPoint,Variable valueFixedPoint){
        return String.format("(store_sin,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }

    public static String missionCamAnimateToPosition(){
        return String.format("(mission_cam_animate_to_position),");
    }

    public static String overlaySetAlpha(Variable overlayId,Variable alpha){
        return String.format("(overlay_set_alpha,%s,%s),",overlayId,alpha);
    }

    public static String positionNormalizeOrigin(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_normalize_origin,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String mapGetLandPositionAroundPosition(Variable destPositionNo,Variable sourcePositionNo,Variable radius){
        return String.format("(map_get_land_position_around_position,%s,%s,%s),",destPositionNo,sourcePositionNo,radius);
    }

    public static String storeRelation(Variable destination,Variable factionId1,Variable factionId2){
        return String.format("(store_relation,%s,%s,%s),",destination,factionId1,factionId2);
    }

    public static String eq(Variable value,Variable value2){
        return String.format("(eq,%s,%s),",value,value2);
    }

    public static String checkQuestActive(Variable questId){
        return String.format("(check_quest_active,%s),",questId);
    }

    public static String positionMoveZ(Variable positionNo,Variable movement,Variable value){
        return String.format("(position_move_z,%s,%s,%s),",positionNo,movement,value);
    }

    public static String partyIgnorePlayer(Variable partyId,Variable durationInHours){
        return String.format("(party_ignore_player,%s,%s),",partyId,durationInHours);
    }

    public static String positionMoveY(Variable positionNo,Variable movement,Variable value){
        return String.format("(position_move_y,%s,%s,%s),",positionNo,movement,value);
    }

    public static String changeScreenLoot(Variable troopId){
        return String.format("(change_screen_loot,%s),",troopId);
    }

    public static String positionMoveX(Variable positionNo,Variable movement,Variable value){
        return String.format("(position_move_x,%s,%s,%s),",positionNo,movement,value);
    }

    public static String inflictCasualtiesToParty(Variable parentPartyId,Variable attackRounds,Variable partyIdToAddCausaltiesTo){
        return String.format("(inflict_casualties_to_party,%s,%s,%s),",parentPartyId,attackRounds,partyIdToAddCausaltiesTo);
    }

    public static String createTextBoxOverlay(Variable destination){
        return String.format("(create_text_box_overlay,%s),",destination);
    }

    public static String failQuest(Variable questId){
        return String.format("(fail_quest,%s),",questId);
    }

    public static String troopLootTroop(Variable targetTroop,Variable sourceTroopId,Variable probability){
        return String.format("(troop_loot_troop,%s,%s,%s),",targetTroop,sourceTroopId,probability);
    }

    public static String agentSetPosition(Variable agentId,Variable positionNo){
        return String.format("(agent_set_position,%s,%s),",agentId,positionNo);
    }

    public static String questSlotGe(Variable questId,Variable slotNo,Variable value){
        return String.format("(quest_slot_ge,%s,%s,%s),",questId,slotNo,value);
    }

    public static String positionSetZ(Variable positionNo,Variable valueFixedPoint){
        return String.format("(position_set_z,%s,%s),",positionNo,valueFixedPoint);
    }

    public static String partyGetAttachedPartyWithRank(Variable destination,Variable partyId,Variable attachedPartyNo){
        return String.format("(party_get_attached_party_with_rank,%s,%s,%s),",destination,partyId,attachedPartyNo);
    }

    public static String troopsCanJoin(Variable value){
        return String.format("(troops_can_join,%s),",value);
    }

    public static String positionSetY(Variable positionNo,Variable valueFixedPoint){
        return String.format("(position_set_y,%s,%s),",positionNo,valueFixedPoint);
    }

    public static String positionSetX(Variable positionNo,Variable valueFixedPoint){
        return String.format("(position_set_x,%s,%s),",positionNo,valueFixedPoint);
    }

    public static String partySetFaction(Variable partyId,Variable factionId){
        return String.format("(party_set_faction,%s,%s),",partyId,factionId);
    }

    public static String storeCurrentDay(Variable destination){
        return String.format("(store_current_day,%s),",destination);
    }

    public static String partyGetBattleOpponent(){
        return String.format("(party_get_battle_opponent),");
    }

    public static String resetMissionTimerC(){
        return String.format("(reset_mission_timer_c),");
    }

    public static String resetMissionTimerA(){
        return String.format("(reset_mission_timer_a),");
    }

    public static String resetMissionTimerB(){
        return String.format("(reset_mission_timer_b),");
    }

    public static String troopSetAutoEquip(Variable troopId,Variable value){
        return String.format("(troop_set_auto_equip,%s,%s),",troopId,value);
    }

    public static String getSceneBoundaries(Variable positionMin,Variable positionMax){
        return String.format("(get_scene_boundaries,%s,%s),",positionMin,positionMax);
    }

    public static String changeScreenMap(){
        return String.format("(change_screen_map),");
    }

    public static String partyGetMorale(Variable destination,Variable partyId){
        return String.format("(party_get_morale,%s,%s),",destination,partyId);
    }

    public static String strStorePartyNameLink(Variable stringRegister,Variable partyId){
        return String.format("(str_store_party_name_link,%s,%s),",stringRegister,partyId);
    }

    public static String createComboButtonOverlay(Variable destination){
        return String.format("(create_combo_button_overlay,%s),",destination);
    }

    public static String strStoreTroopName(Variable stringRegister,Variable troopId){
        return String.format("(str_store_troop_name,%s,%s),",stringRegister,troopId);
    }

    public static String setCurrentColor(Variable value,Variable value2,Variable value3){
        return String.format("(set_current_color,%s,%s,%s),",value,value2,value3);
    }

    public static String checkQuestFinished(Variable questId){
        return String.format("(check_quest_finished,%s),",questId);
    }

    public static String agentSlotEq(Variable agentId,Variable slotNo,Variable value){
        return String.format("(agent_slot_eq,%s,%s,%s),",agentId,slotNo,value);
    }

    public static String agentHasItemEquipped(Variable agentId,Variable itemId){
        return String.format("(agent_has_item_equipped,%s,%s),",agentId,itemId);
    }

    public static String disableParty(Variable partyId){
        return String.format("(disable_party,%s),",partyId);
    }

    public static String partyPrisonerStackGetTroopDna(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_prisoner_stack_get_troop_dna,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String curTableauSetBackgroundColor(Variable value){
        return String.format("(cur_tableau_set_background_color,%s),",value);
    }

    public static String ge(Variable value,Variable value2){
        return String.format("(ge,%s,%s),",value,value2);
    }

    public static String numActiveTeamsLe(Variable value){
        return String.format("(num_active_teams_le,%s),",value);
    }

    public static String changeScreenMission(){
        return String.format("(change_screen_mission),");
    }

    public static String store01RandomPartiesInRange(Variable lowerBound,Variable upperBound){
        return String.format("(store01_random_parties_in_range,%s,%s),",lowerBound,upperBound);
    }

    public static String mapGetRandomPositionAroundPosition(Variable destPositionNo,Variable sourcePositionNo,Variable radius){
        return String.format("(map_get_random_position_around_position,%s,%s,%s),",destPositionNo,sourcePositionNo,radius);
    }

    public static String createImageButtonOverlayWithTableauMaterial(Variable destination,Variable meshId,Variable tableauMaterialId,Variable value){
        return String.format("(create_image_button_overlay_with_tableau_material,%s,%s,%s,%s),",destination,meshId,tableauMaterialId,value);
    }

    public static String setPriceRateForItemType(Variable itemTypeId,Variable valuePercentage){
        return String.format("(set_price_rate_for_item_type,%s,%s),",itemTypeId,valuePercentage);
    }

    public static String partyAddXp(Variable partyId,Variable xpAmount){
        return String.format("(party_add_xp,%s,%s),",partyId,xpAmount);
    }

    public static String partyUpgradeWithXp(Variable partyId,Variable xpAmount,Variable upgradePath){
        return String.format("(party_upgrade_with_xp,%s,%s,%s),",partyId,xpAmount,upgradePath);
    }

    public static String itemSetSlot(Variable itemId,Variable slotNo,Variable value){
        return String.format("(item_set_slot,%s,%s,%s),",itemId,slotNo,value);
    }

    public static String storeFactionOfParty(Variable destination){
        return String.format("(store_faction_of_party,%s),",destination);
    }

    public static String partyStackGetTroopId(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_stack_get_troop_id,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String storeQuestNumber(Variable destination,Variable questId){
        return String.format("(store_quest_number,%s,%s),",destination,questId);
    }

    public static String questSlotEq(Variable questId,Variable slotNo,Variable value){
        return String.format("(quest_slot_eq,%s,%s,%s),",questId,slotNo,value);
    }

    public static String gt(Variable value,Variable value2){
        return String.format("(gt,%s,%s),",value,value2);
    }

    public static String storeDiv(Variable destination,Variable value,Variable value2){
        return String.format("(store_div,%s,%s,%s),",destination,value,value2);
    }

    public static String tryBegin(){
        return String.format("(try_begin),");
    }

    public static String convertToFixedPoint(Variable destinationFixedPoint){
        return String.format("(convert_to_fixed_point,%s),",destinationFixedPoint);
    }

    public static String resetPriceRates(){
        return String.format("(reset_price_rates),");
    }

    public static String partyGetPrisonerStackTroop(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_get_prisoner_stack_troop,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String agentSetWalkForwardAnimation(){
        return String.format("(agent_set_walk_forward_animation),");
    }

    public static String startPresentation(Variable presentationId){
        return String.format("(start_presentation,%s),",presentationId);
    }

    public static String setShowMessages(Variable value){
        return String.format("(set_show_messages,%s),",value);
    }

    public static String troopGetSlot(Variable destination,Variable troopId,Variable slotNo){
        return String.format("(troop_get_slot,%s,%s,%s),",destination,troopId,slotNo);
    }

    public static String storeCharacterLevel(Variable destination,Variable troopId){
        return String.format("(store_character_level,%s,%s),",destination,troopId);
    }

    public static String agentAiSetAlwaysAttackInMelee(Variable agentId,Variable value){
        return String.format("(agent_ai_set_always_attack_in_melee,%s,%s),",agentId,value);
    }

    public static String assign(Variable destination,Variable value){
        return String.format("(assign,%s,%s),",destination,value);
    }

    public static String talkInfoSetLine(){
        return String.format("(talk_info_set_line),");
    }

    public static String removeTroopsFromPrisoners(Variable troopId,Variable value){
        return String.format("(remove_troops_from_prisoners,%s,%s),",troopId,value);
    }

    public static String missionEntrySetOverrideFlags(Variable missionTemplateId,Variable entryNo,Variable value){
        return String.format("(mission_entry_set_override_flags,%s,%s,%s),",missionTemplateId,entryNo,value);
    }

    public static String storeFriendCount(Variable destination){
        return String.format("(store_friend_count,%s),",destination);
    }

    public static String addQuestNoteFromSreg(Variable questId,Variable noteSlotNo,Variable stringId,Variable value){
        return String.format("(add_quest_note_from_sreg,%s,%s,%s,%s),",questId,noteSlotNo,stringId,value);
    }

    public static String positionCopyRotation(Variable positionNo1,Variable positionNo2){
        return String.format("(position_copy_rotation,%s,%s),",positionNo1,positionNo2);
    }

    public static String addPartyNoteFromDialog(Variable partyId,Variable noteSlotNo,Variable value){
        return String.format("(add_party_note_from_dialog,%s,%s,%s),",partyId,noteSlotNo,value);
    }

    public static String setRain(){
        return String.format("(set_rain),");
    }

    public static String storeEnemyCount(Variable destination){
        return String.format("(store_enemy_count,%s),",destination);
    }

    public static String partySetSlot(Variable partyId,Variable slotNo,Variable value){
        return String.format("(party_set_slot,%s,%s,%s),",partyId,slotNo,value);
    }

    public static String troopEnsureInventorySpace(Variable troopId,Variable value){
        return String.format("(troop_ensure_inventory_space,%s,%s),",troopId,value);
    }

    public static String partyForceAddPrisoners(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_force_add_prisoners,%s,%s,%s),",partyId,troopId,number);
    }

    public static String playCueTrack(Variable trackId){
        return String.format("(play_cue_track,%s),",trackId);
    }

    public static String rightMouseMenuAddItem(Variable stringId,Variable value){
        return String.format("(right_mouse_menu_add_item,%s,%s),",stringId,value);
    }

    public static String questGetSlot(Variable destination,Variable questId,Variable slotNo){
        return String.format("(quest_get_slot,%s,%s,%s),",destination,questId,slotNo);
    }

    public static String overlayAnimateToPosition(){
        return String.format("(overlay_animate_to_position),");
    }

    public static String startEncounter(Variable partyId){
        return String.format("(start_encounter,%s),",partyId);
    }

    public static String allEnemiesDefeated(){
        return String.format("(all_enemies_defeated),");
    }

    public static String partyGetCurTown(Variable destination,Variable partyId){
        return String.format("(party_get_cur_town,%s,%s),",destination,partyId);
    }

    public static String valMod(Variable destination,Variable value){
        return String.format("(val_mod,%s,%s),",destination,value);
    }

    public static String troopRaiseProficiency(Variable troopId,Variable proficiencyNo,Variable value){
        return String.format("(troop_raise_proficiency,%s,%s,%s),",troopId,proficiencyNo,value);
    }

    public static String valOr(Variable destination,Variable value){
        return String.format("(val_or,%s,%s),",destination,value);
    }

    public static String storePow(){
        return String.format("(store_pow),");
    }

    public static String changeScreenMapConversation(){
        return String.format("(change_screen_map_conversation),");
    }

    public static String troopInventorySlotGetItemMaxAmount(Variable destination,Variable troopId,Variable inventorySlotNo){
        return String.format("(troop_inventory_slot_get_item_max_amount,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }

    public static String setVisitors(Variable entryNo,Variable troopId,Variable numberOfTroops){
        return String.format("(set_visitors,%s,%s,%s),",entryNo,troopId,numberOfTroops);
    }

    public static String partyGetNumPrisoners(Variable destination,Variable partyId){
        return String.format("(party_get_num_prisoners,%s,%s),",destination,partyId);
    }

    public static String enteringTown(Variable townId){
        return String.format("(entering_town,%s),",townId);
    }

    public static String getAverageGameDifficulty(Variable destination){
        return String.format("(get_average_game_difficulty,%s),",destination);
    }

    public static String partyCountCompanionsOfType(Variable destination,Variable partyId,Variable troopId){
        return String.format("(party_count_companions_of_type,%s,%s,%s),",destination,partyId,troopId);
    }

    public static String missionEntryClearOverrideItems(Variable missionTemplateId,Variable entryNo){
        return String.format("(mission_entry_clear_override_items,%s,%s),",missionTemplateId,entryNo);
    }

    public static String partyRemovePrisoners(){
        return String.format("(party_remove_prisoners),");
    }

    public static String troopIsWounded(Variable troopId){
        return String.format("(troop_is_wounded,%s),",troopId);
    }

    public static String raceCompletedByPlayer(){
        return String.format("(race_completed_by_player),");
    }

    public static String keyIsDown(Variable gameKeyId){
        return String.format("(key_is_down,%s),",gameKeyId);
    }

@Deprecated
    public static String tutorialBox(Variable textStringId,Variable titleStringId){
        return String.format("(tutorial_box,%s,%s),",textStringId,titleStringId);
    }

    public static String storeSub(Variable destination,Variable value,Variable value2){
        return String.format("(store_sub,%s,%s,%s),",destination,value,value2);
    }

    public static String setQuestProgression(Variable questId,Variable value){
        return String.format("(set_quest_progression,%s,%s),",questId,value);
    }

    public static String cancelQuest(Variable questId){
        return String.format("(cancel_quest,%s),",questId);
    }

    public static String agentPlaySound(Variable agentId,Variable soundId){
        return String.format("(agent_play_sound,%s,%s),",agentId,soundId);
    }

    public static String sceneGetSlot(Variable destination,Variable sceneId,Variable slotNo){
        return String.format("(scene_get_slot,%s,%s,%s),",destination,sceneId,slotNo);
    }

    public static String agentIsAlive(Variable agentId){
        return String.format("(agent_is_alive,%s),",agentId);
    }

    public static String missionCamSetMode(){
        return String.format("(mission_cam_set_mode),");
    }

    public static String strStoreStringReg(){
        return String.format("(str_store_string_reg),");
    }

    public static String leaveEncounter(){
        return String.format("(leave_encounter),");
    }

    public static String spawnAroundParty(Variable partyId,Variable partyTemplateId){
        return String.format("(spawn_around_party,%s,%s),",partyId,partyTemplateId);
    }

    public static String storeCurrentHours(Variable destination){
        return String.format("(store_current_hours,%s),",destination);
    }

    public static String agentIsHuman(Variable agentId){
        return String.format("(agent_is_human,%s),",agentId);
    }

    public static String itemSlotEq(Variable itemId,Variable slotNo,Variable value){
        return String.format("(item_slot_eq,%s,%s,%s),",itemId,slotNo,value);
    }

    public static String troopGetInventoryCapacity(Variable destination,Variable troopId){
        return String.format("(troop_get_inventory_capacity,%s,%s),",destination,troopId);
    }

    public static String partyRelocateNearParty(Variable partyId,Variable targetPartyId,Variable valueSpawnRadius){
        return String.format("(party_relocate_near_party,%s,%s,%s),",partyId,targetPartyId,valueSpawnRadius);
    }

    public static String tryForRangeBackwards(Variable destination,Variable upperBound,Variable lowerBound){
        return String.format("(try_for_range_backwards,%s,%s,%s),",destination,upperBound,lowerBound);
    }

    public static String setGlobalHazeAmount(Variable value){
        return String.format("(set_global_haze_amount,%s),",value);
    }

    public static String storeTroopGold(Variable destination,Variable troopId){
        return String.format("(store_troop_gold,%s,%s),",destination,troopId);
    }

@Deprecated
    public static String inMetaMission(){
        return String.format("(in_meta_mission),");
    }

    public static String removeTroopFromSite(Variable troopId,Variable sceneId){
        return String.format("(remove_troop_from_site,%s,%s),",troopId,sceneId);
    }

    public static String checkQuestConcluded(Variable questId){
        return String.format("(check_quest_concluded,%s),",questId);
    }

    public static String setSpawnRadius(Variable value){
        return String.format("(set_spawn_radius,%s),",value);
    }

    public static String curTableauAddPointLight(Variable mapIconId,Variable positionNo,Variable redFixedPoint,Variable greenFixedPoint,Variable blueFixedPoint){
        return String.format("(cur_tableau_add_point_light,%s,%s,%s,%s,%s),",mapIconId,positionNo,redFixedPoint,greenFixedPoint,blueFixedPoint);
    }

    public static String agentGetPosition(Variable positionNo,Variable agentId){
        return String.format("(agent_get_position,%s,%s),",positionNo,agentId);
    }

    public static String jumpToScene(Variable sceneId,Variable entryNo){
        return String.format("(jump_to_scene,%s,%s),",sceneId,entryNo);
    }

    public static String missionEntryAddOverrideItem(Variable missionTemplateId,Variable entryNo,Variable itemKindId){
        return String.format("(mission_entry_add_override_item,%s,%s,%s),",missionTemplateId,entryNo,itemKindId);
    }

    public static String missionCamGetAparture(){
        return String.format("(mission_cam_get_aparture),");
    }

    public static String isBetween(Variable value,Variable lowerBound,Variable upperBound){
        return String.format("(is_between,%s,%s,%s),",value,lowerBound,upperBound);
    }

    public static String curTableauSetCameraPosition(Variable positionNo){
        return String.format("(cur_tableau_set_camera_position,%s),",positionNo);
    }

    public static String strStoreItemNameByCount(Variable stringRegister,Variable itemId){
        return String.format("(str_store_item_name_by_count,%s,%s),",stringRegister,itemId);
    }

    public static String partyAttachToParty(){
        return String.format("(party_attach_to_party),");
    }

    public static String troopGetInventorySlot(Variable destination,Variable troopId,Variable inventorySlotNo){
        return String.format("(troop_get_inventory_slot,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }

    public static String startMapConversation(Variable troopId){
        return String.format("(start_map_conversation,%s),",troopId);
    }

    public static String teamGetOrderPosition(Variable positionNo,Variable teamNo,Variable subClass){
        return String.format("(team_get_order_position,%s,%s,%s),",positionNo,teamNo,subClass);
    }

    public static String le(Variable value,Variable value2){
        return String.format("(le,%s,%s),",value,value2);
    }

    public static String partyCanJoinAsPrisoner(){
        return String.format("(party_can_join_as_prisoner),");
    }

    public static String presentationSetDuration(){
        return String.format("(presentation_set_duration),");
    }

    public static String agentSetSpeedLimit(){
        return String.format("(agent_set_speed_limit),");
    }

    public static String agentGetAmmo(Variable destination,Variable agentId){
        return String.format("(agent_get_ammo,%s,%s),",destination,agentId);
    }

    public static String missionSetTimeSpeed(){
        return String.format("(mission_set_time_speed),");
    }

    public static String teamSetRelation(Variable teamNo,Variable teamNo2,Variable value){
        return String.format("(team_set_relation,%s,%s,%s),",teamNo,teamNo2,value);
    }

    public static String agentRefillAmmo(Variable agentId){
        return String.format("(agent_refill_ammo,%s),",agentId);
    }

    public static String lt(Variable value,Variable value2){
        return String.format("(lt,%s,%s),",value,value2);
    }

    public static String setPartyBattleMode(){
        return String.format("(set_party_battle_mode),");
    }

    public static String partyTemplateGetSlot(Variable destination,Variable partyTemplateId,Variable slotNo){
        return String.format("(party_template_get_slot,%s,%s,%s),",destination,partyTemplateId,slotNo);
    }

    public static String changeScreenViewCharacter(){
        return String.format("(change_screen_view_character),");
    }

    public static String setRelation(Variable factionId,Variable factionId2,Variable value){
        return String.format("(set_relation,%s,%s,%s),",factionId,factionId2,value);
    }

    public static String neg(){
        return String.format("(neg),");
    }

    public static String agentSetSlot(Variable agentId,Variable slotNo,Variable value){
        return String.format("(agent_set_slot,%s,%s,%s),",agentId,slotNo,value);
    }

    public static String addXpAsReward(Variable value){
        return String.format("(add_xp_as_reward,%s),",value);
    }

    public static String setPlayerTroop(Variable troopId){
        return String.format("(set_player_troop,%s),",troopId);
    }

    public static String neq(Variable value,Variable value2){
        return String.format("(neq,%s,%s),",value,value2);
    }

    public static String storeRandomTroopToCapture(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(store_random_troop_to_capture,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String getPartyAiBehavior(Variable destination,Variable partyId){
        return String.format("(get_party_ai_behavior,%s,%s),",destination,partyId);
    }

    public static String addPartyNoteTableauMesh(Variable troopId,Variable tableauMaterialId){
        return String.format("(add_party_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }

    public static String troopRaiseAttribute(Variable troopId,Variable attributeId,Variable value){
        return String.format("(troop_raise_attribute,%s,%s,%s),",troopId,attributeId,value);
    }

    public static String overlaySetHilightColor(Variable overlayId,Variable color){
        return String.format("(overlay_set_hilight_color,%s,%s),",overlayId,color);
    }

    public static String isCurrentlyNight(){
        return String.format("(is_currently_night),");
    }

    public static String itemSlotGe(Variable itemId,Variable slotNo,Variable value){
        return String.format("(item_slot_ge,%s,%s,%s),",itemId,slotNo,value);
    }

    public static String storeAnd(){
        return String.format("(store_and),");
    }

    public static String storeRandomHorse(){
        return String.format("(store_random_horse),");
    }

    public static String checkQuestSucceeded(Variable questId){
        return String.format("(check_quest_succeeded,%s),",questId);
    }

    public static String teamSetOrderPosition(Variable teamNo,Variable subClass,Variable positionNo){
        return String.format("(team_set_order_position,%s,%s,%s),",teamNo,subClass,positionNo);
    }

    public static String addGoldAsXp(Variable value,Variable troopId){
        return String.format("(add_gold_as_xp,%s,%s),",value,troopId);
    }

    public static String storeAgentHitPoints(Variable destination,Variable agentId,Variable absolute){
        return String.format("(store_agent_hit_points,%s,%s,%s),",destination,agentId,absolute);
    }

public static String thisOrNext(String condition){
        if(condition.startsWith("(this_or_next|")){
            return condition;
        }
        return condition.replace("(", "(this_or_next|");
    }    public static String strClear(){
        return String.format("(str_clear),");
    }

    public static String troopSetInventorySlot(Variable troopId,Variable inventorySlotNo,Variable value){
        return String.format("(troop_set_inventory_slot,%s,%s,%s),",troopId,inventorySlotNo,value);
    }

    public static String partySetMorale(Variable partyId,Variable value){
        return String.format("(party_set_morale,%s,%s),",partyId,value);
    }

    public static String storeDistanceToPartyFromParty(Variable destination,Variable partyId,Variable partyId2){
        return String.format("(store_distance_to_party_from_party,%s,%s,%s),",destination,partyId,partyId2);
    }

    public static String mainHeroFallen(){
        return String.format("(main_hero_fallen),");
    }

    public static String troopAddItems(Variable troopId,Variable itemId,Variable number){
        return String.format("(troop_add_items,%s,%s,%s),",troopId,itemId,number);
    }

    public static String storeNumFreePrisonerStacks(Variable destination,Variable partyId){
        return String.format("(store_num_free_prisoner_stacks,%s,%s),",destination,partyId);
    }

    public static String troopJoinAsPrisoner(Variable troopId){
        return String.format("(troop_join_as_prisoner,%s),",troopId);
    }

    public static String setMissionResult(Variable value){
        return String.format("(set_mission_result,%s),",value);
    }

    public static String partyGetSkillLevel(Variable destination,Variable partyId,Variable skillNo){
        return String.format("(party_get_skill_level,%s,%s,%s),",destination,partyId,skillNo);
    }

    public static String storeTimeOfDay(Variable destination){
        return String.format("(store_time_of_day,%s),",destination);
    }

    public static String addQuestNoteFromDialog(Variable questId,Variable noteSlotNo,Variable value){
        return String.format("(add_quest_note_from_dialog,%s,%s,%s),",questId,noteSlotNo,value);
    }

    public static String troopAddProficiencyPoints(Variable troopId,Variable value){
        return String.format("(troop_add_proficiency_points,%s,%s),",troopId,value);
    }

    public static String mapFree(){
        return String.format("(map_free),");
    }

    public static String storeQuestTroop(Variable destination,Variable troopId){
        return String.format("(store_quest_troop,%s,%s),",destination,troopId);
    }

    public static String convertFromFixedPoint(Variable destination){
        return String.format("(convert_from_fixed_point,%s),",destination);
    }

    public static String tryForParties(Variable destination){
        return String.format("(try_for_parties,%s),",destination);
    }

    public static String agentGetTroopId(Variable destination,Variable agentId){
        return String.format("(agent_get_troop_id,%s,%s),",destination,agentId);
    }

    public static String troopSortInventory(Variable troopId){
        return String.format("(troop_sort_inventory,%s),",troopId);
    }

    public static String curScenePropSetTableauMaterial(Variable tableauMaterialId,Variable instanceCode){
        return String.format("(cur_scene_prop_set_tableau_material,%s,%s),",tableauMaterialId,instanceCode);
    }

    public static String positionTransformPositionToParent(Variable destPositionNo,Variable positionNo,Variable positionNoToBeTransformed){
        return String.format("(position_transform_position_to_parent,%s,%s,%s),",destPositionNo,positionNo,positionNoToBeTransformed);
    }

@Deprecated
    public static String storeTroopKindCount(){
        return String.format("(store_troop_kind_count),");
    }

    public static String playerHasItem(Variable itemId){
        return String.format("(player_has_item,%s),",itemId);
    }

    public static String partyGetSlot(Variable destination,Variable partyId,Variable slotNo){
        return String.format("(party_get_slot,%s,%s,%s),",destination,partyId,slotNo);
    }

    public static String encounteredPartyIsAttacker(){
        return String.format("(encountered_party_is_attacker),");
    }

    public static String missionEnableTalk(){
        return String.format("(mission_enable_talk),");
    }

    public static String copyPosition(Variable positionNo1,Variable positionNo2){
        return String.format("(copy_position,%s,%s),",positionNo1,positionNo2);
    }

    public static String setGlobalCloudAmount(Variable value){
        return String.format("(set_global_cloud_amount,%s),",value);
    }

    public static String questSetSlot(Variable questId,Variable slotNo,Variable value){
        return String.format("(quest_set_slot,%s,%s,%s),",questId,slotNo,value);
    }

    public static String troopAddItem(Variable troopId,Variable itemId,Variable modifier){
        return String.format("(troop_add_item,%s,%s,%s),",troopId,itemId,modifier);
    }

    public static String storeNumPartiesCreated(Variable destination,Variable partyTemplateId){
        return String.format("(store_num_parties_created,%s,%s),",destination,partyTemplateId);
    }

    public static String troopIsGuaranteeHorse(Variable troopId){
        return String.format("(troop_is_guarantee_horse,%s),",troopId);
    }

    public static String curTableauAddMesh(Variable meshId,Variable positionNo,Variable valueFixedPoint,Variable valueFixedPoint2){
        return String.format("(cur_tableau_add_mesh,%s,%s,%s,%s),",meshId,positionNo,valueFixedPoint,valueFixedPoint2);
    }

    public static String missionCamClearTargetAgent(){
        return String.format("(mission_cam_clear_target_agent),");
    }

    public static String tryEnd(){
        return String.format("(try_end),");
    }

    public static String valSub(Variable destination,Variable value){
        return String.format("(val_sub,%s,%s),",destination,value);
    }

    public static String getPlayerAgentOwnTroopKillCount(Variable destination,Variable getWounded){
        return String.format("(get_player_agent_own_troop_kill_count,%s,%s),",destination,getWounded);
    }

    public static String missionCamGetPosition(){
        return String.format("(mission_cam_get_position),");
    }

    public static String partySetAiBehavior(Variable partyId,Variable aiBhvr){
        return String.format("(party_set_ai_behavior,%s,%s),",partyId,aiBhvr);
    }

    public static String overlaySetBoundaries(Variable overlayId,Variable minValue,Variable maxValue){
        return String.format("(overlay_set_boundaries,%s,%s,%s),",overlayId,minValue,maxValue);
    }

    public static String setCameraFollowParty(Variable partyId){
        return String.format("(set_camera_follow_party,%s),",partyId);
    }

    public static String valMin(Variable destination,Variable value){
        return String.format("(val_min,%s,%s),",destination,value);
    }

    public static String setBackgroundMesh(Variable meshId){
        return String.format("(set_background_mesh,%s),",meshId);
    }

    public static String overlayAnimateToHighlightAlpha(){
        return String.format("(overlay_animate_to_highlight_alpha),");
    }

    public static String storeCos(Variable destinationFixedPoint,Variable valueFixedPoint){
        return String.format("(store_cos,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }

@Deprecated
    public static String storeRandom(){
        return String.format("(store_random),");
    }

    public static String talkInfoSetRelationBar(){
        return String.format("(talk_info_set_relation_bar),");
    }

    public static String strStoreDate(Variable stringRegister,Variable numberOfDaysToAddToTheCurrentDate){
        return String.format("(str_store_date,%s,%s),",stringRegister,numberOfDaysToAddToTheCurrentDate);
    }

    public static String concludeQuest(Variable questId){
        return String.format("(conclude_quest,%s),",questId);
    }

    public static String storePartnerQuest(Variable destination){
        return String.format("(store_partner_quest,%s),",destination);
    }

    public static String storeItemKindCount(Variable destination,Variable itemId,Variable troopId){
        return String.format("(store_item_kind_count,%s,%s,%s),",destination,itemId,troopId);
    }

    public static String addTroopToSite(Variable troopId,Variable sceneId,Variable entryNo){
        return String.format("(add_troop_to_site,%s,%s,%s),",troopId,sceneId,entryNo);
    }

    public static String curTableauSetCameraParameters(Variable isPerspective,Variable cameraWidthTimes1000,Variable cameraHeightTimes1000,Variable cameraNearTimes1000,Variable cameraFarTimes1000){
        return String.format("(cur_tableau_set_camera_parameters,%s,%s,%s,%s,%s),",isPerspective,cameraWidthTimes1000,cameraHeightTimes1000,cameraNearTimes1000,cameraFarTimes1000);
    }

    public static String troopRaiseSkill(Variable troopId,Variable skillId,Variable value){
        return String.format("(troop_raise_skill,%s,%s,%s),",troopId,skillId,value);
    }

    public static String particleSystemEmit(Variable parSysId,Variable valueNumParticles,Variable valuePeriod){
        return String.format("(particle_system_emit,%s,%s,%s),",parSysId,valueNumParticles,valuePeriod);
    }

    public static String setupQuestText(Variable questId){
        return String.format("(setup_quest_text,%s),",questId);
    }

    public static String endCurrentBattle(){
        return String.format("(end_current_battle),");
    }

    public static String partyGetAttachedTo(Variable destination,Variable partyId){
        return String.format("(party_get_attached_to,%s,%s),",destination,partyId);
    }

    public static String partyStackGetTroopDna(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_stack_get_troop_dna,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String createProgressOverlay(Variable destination,Variable minValue,Variable maxValue){
        return String.format("(create_progress_overlay,%s,%s,%s),",destination,minValue,maxValue);
    }

    public static String troopEquipItems(Variable troopId){
        return String.format("(troop_equip_items,%s),",troopId);
    }

    public static String partyGetFreeCompanionsCapacity(Variable destination,Variable partyId){
        return String.format("(party_get_free_companions_capacity,%s,%s),",destination,partyId);
    }

    public static String storeRandomPartyInRange(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(store_random_party_in_range,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String troopInventorySlotSetItemAmount(Variable troopId,Variable inventorySlotNo,Variable value){
        return String.format("(troop_inventory_slot_set_item_amount,%s,%s,%s),",troopId,inventorySlotNo,value);
    }

    public static String addFactionNoteTableauMesh(Variable troopId,Variable tableauMaterialId){
        return String.format("(add_faction_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }

    public static String curItemSetTableauMaterial(){
        return String.format("(cur_item_set_tableau_material),");
    }

    public static String strStoreItemNamePlural(Variable stringRegister,Variable itemId){
        return String.format("(str_store_item_name_plural,%s,%s),",stringRegister,itemId);
    }

    public static String partyCollectAttachmentsToParty(){
        return String.format("(party_collect_attachments_to_party),");
    }

    public static String overlayAnimateToAlpha(){
        return String.format("(overlay_animate_to_alpha),");
    }

    public static String getPartyAiObject(Variable destination,Variable partyId){
        return String.format("(get_party_ai_object,%s,%s),",destination,partyId);
    }

    public static String getTriggerObjectPosition(Variable positionNo){
        return String.format("(get_trigger_object_position,%s),",positionNo);
    }

    public static String partySetAiObject(Variable partyId,Variable partyId2){
        return String.format("(party_set_ai_object,%s,%s),",partyId,partyId2);
    }

    public static String strStoreAgentName(Variable stringRegister,Variable agentId){
        return String.format("(str_store_agent_name,%s,%s),",stringRegister,agentId);
    }

    public static String mainPartyHasTroop(Variable troopId){
        return String.format("(main_party_has_troop,%s),",troopId);
    }

    public static String removeRegularPrisoners(Variable partyId){
        return String.format("(remove_regular_prisoners,%s),",partyId);
    }

    public static String factionSlotEq(Variable factionId,Variable slotNo,Variable value){
        return String.format("(faction_slot_eq,%s,%s,%s),",factionId,slotNo,value);
    }

    public static String createSliderOverlay(Variable destination,Variable minValue,Variable maxValue){
        return String.format("(create_slider_overlay,%s,%s,%s),",destination,minValue,maxValue);
    }

    public static String encounterAttack(){
        return String.format("(encounter_attack),");
    }

    public static String spawnItem(){
        return String.format("(spawn_item),");
    }

    public static String setMerchandiseMaxValue(Variable value){
        return String.format("(set_merchandise_max_value,%s),",value);
    }

    public static String conversationScreenIsActive(){
        return String.format("(conversation_screen_is_active),");
    }

    public static String removeParty(Variable partyId){
        return String.format("(remove_party,%s),",partyId);
    }

    public static String factionGetSlot(Variable destination,Variable factionId,Variable slotNo){
        return String.format("(faction_get_slot,%s,%s,%s),",destination,factionId,slotNo);
    }

    public static String partyLeaveCurBattle(Variable partyId){
        return String.format("(party_leave_cur_battle,%s),",partyId);
    }

    public static String agentGetTeam(Variable destination,Variable agentId){
        return String.format("(agent_get_team,%s,%s),",destination,agentId);
    }

    public static String teamSetLeader(Variable teamNo,Variable newLeaderAgentId){
        return String.format("(team_set_leader,%s,%s),",teamNo,newLeaderAgentId);
    }

    public static String storeNumPartiesOfTemplate(Variable destination,Variable partyTemplateId){
        return String.format("(store_num_parties_of_template,%s,%s),",destination,partyTemplateId);
    }

    public static String troopRemoveGold(Variable troopId,Variable value){
        return String.format("(troop_remove_gold,%s,%s),",troopId,value);
    }

    public static String agentSetTeam(Variable agentId,Variable value){
        return String.format("(agent_set_team,%s,%s),",agentId,value);
    }

    public static String startMissionConversation(Variable troopId){
        return String.format("(start_mission_conversation,%s),",troopId);
    }

    public static String displayLogMessage(Variable stringId,Variable hexColourCode){
        return String.format("(display_log_message,%s,%s),",stringId,hexColourCode);
    }

    public static String storeEncounteredParty(Variable destination){
        return String.format("(store_encountered_party,%s),",destination);
    }

    public static String storeRandomPartyOfTemplate(Variable destination,Variable partyTemplateId){
        return String.format("(store_random_party_of_template,%s,%s),",destination,partyTemplateId);
    }

@Deprecated
    public static String elseTryBegin(){
        return String.format("(else_try_begin),");
    }

    public static String addVisitorsToCurrentScene(Variable entryNo,Variable troopId,Variable numberOfTroops){
        return String.format("(add_visitors_to_current_scene,%s,%s,%s),",entryNo,troopId,numberOfTroops);
    }

    public static String strStoreString(Variable stringRegister,Variable stringNo){
        return String.format("(str_store_string,%s,%s),",stringRegister,stringNo);
    }

    public static String positionCopyOrigin(Variable positionNo1,Variable positionNo2){
        return String.format("(position_copy_origin,%s,%s),",positionNo1,positionNo2);
    }

    public static String particleSystemBurst(Variable parSysId,Variable positionNo,Variable percentageBurstStrength){
        return String.format("(particle_system_burst,%s,%s,%s),",parSysId,positionNo,percentageBurstStrength);
    }

    public static String setFixedPointMultiplier(Variable value){
        return String.format("(set_fixed_point_multiplier,%s),",value);
    }

    public static String partyGetNumAttachedParties(Variable destination,Variable partyId){
        return String.format("(party_get_num_attached_parties,%s,%s),",destination,partyId);
    }

    public static String storeCurrentScene(Variable destination){
        return String.format("(store_current_scene,%s),",destination);
    }

    public static String storeScriptParam(Variable destination,Variable scriptParamNo){
        return String.format("(store_script_param,%s,%s),",destination,scriptParamNo);
    }

    public static String restForHoursInteractive(Variable restPeriod,Variable timeSpeed,Variable remainAttackable){
        return String.format("(rest_for_hours_interactive,%s,%s,%s),",restPeriod,timeSpeed,remainAttackable);
    }

    public static String setMerchandiseModifierQuality(Variable value){
        return String.format("(set_merchandise_modifier_quality,%s),",value);
    }

    public static String storeDefenderCount(Variable destination){
        return String.format("(store_defender_count,%s),",destination);
    }

    public static String playTrack(Variable trackId,Variable options){
        return String.format("(play_track,%s,%s),",trackId,options);
    }

    public static String setPassageMenu(Variable value){
        return String.format("(set_passage_menu,%s),",value);
    }

    public static String partyGetFreePrisonersCapacity(Variable destination,Variable partyId){
        return String.format("(party_get_free_prisoners_capacity,%s,%s),",destination,partyId);
    }

    public static String agentGetSimpleBehavior(Variable destination,Variable agentId){
        return String.format("(agent_get_simple_behavior,%s,%s),",destination,agentId);
    }

    public static String curTableauRenderAsAlphaMask(){
        return String.format("(cur_tableau_render_as_alpha_mask),");
    }

    public static String strStoreFactionNameLink(Variable stringRegister,Variable factionId){
        return String.format("(str_store_faction_name_link,%s,%s),",stringRegister,factionId);
    }

    public static String positionGetY(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_y,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String addReinforcementsToEntry(Variable missionTemplateEntryNo,Variable value){
        return String.format("(add_reinforcements_to_entry,%s,%s),",missionTemplateEntryNo,value);
    }

    public static String positionGetZ(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_z,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String positionGetX(Variable destinationFixedPoint,Variable positionNo){
        return String.format("(position_get_x,%s,%s),",destinationFixedPoint,positionNo);
    }

    public static String partyJoin(){
        return String.format("(party_join),");
    }

    public static String storeEncounteredParty2(Variable destination){
        return String.format("(store_encountered_party2,%s),",destination);
    }

    public static String contextMenuAddItem(){
        return String.format("(context_menu_add_item),");
    }

    public static String storeSkillLevel(Variable destination,Variable skillId,Variable troopId){
        return String.format("(store_skill_level,%s,%s,%s),",destination,skillId,troopId);
    }

    public static String missionCamSetTargetAgent(){
        return String.format("(mission_cam_set_target_agent),");
    }

    public static String disableMenuOption(){
        return String.format("(disable_menu_option),");
    }

    public static String strStoreItemName(Variable stringRegister,Variable itemId){
        return String.format("(str_store_item_name,%s,%s),",stringRegister,itemId);
    }

    public static String agentGetLookPosition(Variable positionNo,Variable agentId){
        return String.format("(agent_get_look_position,%s,%s),",positionNo,agentId);
    }

    public static String storeMumRegularPrisoners(Variable destination,Variable partyId){
        return String.format("(store_mum_regular_prisoners,%s,%s),",destination,partyId);
    }

    public static String valAnd(Variable destination,Variable value){
        return String.format("(val_and,%s,%s),",destination,value);
    }

    public static String storeMod(Variable destination,Variable value,Variable value2){
        return String.format("(store_mod,%s,%s,%s),",destination,value,value2);
    }

    public static String teamGiveOrder(Variable teamNo,Variable subClass,Variable orderId){
        return String.format("(team_give_order,%s,%s,%s),",teamNo,subClass,orderId);
    }

    public static String conversationScreenActive(){
        return String.format("(conversation_screen_active),");
    }

    public static String troopSetFaction(Variable troopId,Variable factionId){
        return String.format("(troop_set_faction,%s,%s),",troopId,factionId);
    }

    public static String enableParty(Variable partyId){
        return String.format("(enable_party,%s),",partyId);
    }

    public static String valMax(Variable destination,Variable value){
        return String.format("(val_max,%s,%s),",destination,value);
    }

    public static String setBattleAdvantage(Variable value){
        return String.format("(set_battle_advantage,%s),",value);
    }

    public static String keyClicked(Variable gameKeyId){
        return String.format("(key_clicked,%s),",gameKeyId);
    }

    public static String addPartyNoteFromSreg(Variable partyId,Variable noteSlotNo,Variable stringId,Variable value){
        return String.format("(add_party_note_from_sreg,%s,%s,%s,%s),",partyId,noteSlotNo,stringId,value);
    }

    public static String setVisitor(){
        return String.format("(set_visitor),");
    }

    public static String curTableauAddOverrideItem(Variable itemKindId){
        return String.format("(cur_tableau_add_override_item,%s),",itemKindId);
    }

    public static String playSound(Variable soundId,Variable options){
        return String.format("(play_sound,%s,%s),",soundId,options);
    }

    public static String partySetIcon(Variable partyId,Variable mapIconId){
        return String.format("(party_set_icon,%s,%s),",partyId,mapIconId);
    }

    public static String troopGetInventorySlotModifier(Variable destination,Variable troopId,Variable inventorySlotNo){
        return String.format("(troop_get_inventory_slot_modifier,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }

    public static String troopIsMounted(Variable troopId){
        return String.format("(troop_is_mounted,%s),",troopId);
    }

    public static String strStoreQuestName(Variable stringRegister,Variable questId){
        return String.format("(str_store_quest_name,%s,%s),",stringRegister,questId);
    }

    public static String changeScreenReturn(){
        return String.format("(change_screen_return),");
    }

    public static String agentSetStandAnimation(){
        return String.format("(agent_set_stand_animation),");
    }

    public static String agentGetScriptedDestination(Variable positionNo,Variable agentId){
        return String.format("(agent_get_scripted_destination,%s,%s),",positionNo,agentId);
    }

    public static String setGameMenuTableauMesh(Variable tableauMaterialId,Variable value,Variable positionRegisterNo){
        return String.format("(set_game_menu_tableau_mesh,%s,%s,%s),",tableauMaterialId,value,positionRegisterNo);
    }

    public static String storeNormalizedTeamCount(Variable destination,Variable teamNo){
        return String.format("(store_normalized_team_count,%s,%s),",destination,teamNo);
    }

    public static String overlaySetSize(Variable overlayId,Variable positionNo){
        return String.format("(overlay_set_size,%s,%s),",overlayId,positionNo);
    }

    public static String partyTemplateSlotEq(Variable partyTemplateId,Variable slotNo,Variable value){
        return String.format("(party_template_slot_eq,%s,%s,%s),",partyTemplateId,slotNo,value);
    }

    public static String agentGetCombatState(Variable destination,Variable agentId){
        return String.format("(agent_get_combat_state,%s,%s),",destination,agentId);
    }

    public static String getBattleAdvantage(Variable destination){
        return String.format("(get_battle_advantage,%s),",destination);
    }

    public static String inflictCasualtiesToPartyGroup(){
        return String.format("(inflict_casualties_to_party_group),");
    }

    public static String partySetBannerIcon(Variable partyId,Variable mapIconId){
        return String.format("(party_set_banner_icon,%s,%s),",partyId,mapIconId);
    }

    public static String setPositionDelta(Variable value,Variable value2,Variable value3){
        return String.format("(set_position_delta,%s,%s,%s),",value,value2,value3);
    }

    public static String troopSlotEq(Variable troopId,Variable slotNo,Variable value){
        return String.format("(troop_slot_eq,%s,%s,%s),",troopId,slotNo,value);
    }

    public static String scenePropGetNumInstances(Variable destination,Variable scenePropId){
        return String.format("(scene_prop_get_num_instances,%s,%s),",destination,scenePropId);
    }

    public static String troopSetType(Variable troopId,Variable gender){
        return String.format("(troop_set_type,%s,%s),",troopId,gender);
    }

    public static String partyTemplateSetSlot(Variable partyTemplateId,Variable slotNo,Variable value){
        return String.format("(party_template_set_slot,%s,%s,%s),",partyTemplateId,slotNo,value);
    }

    public static String partyTemplateSlotGe(Variable partyTemplateId,Variable slotNo,Variable value){
        return String.format("(party_template_slot_ge,%s,%s,%s),",partyTemplateId,slotNo,value);
    }

    public static String storeFreeInventoryCapacity(Variable destination,Variable troopId){
        return String.format("(store_free_inventory_capacity,%s,%s),",destination,troopId);
    }

    public static String teamGetHoldFireOrder(Variable destination,Variable teamNo,Variable subClass){
        return String.format("(team_get_hold_fire_order,%s,%s,%s),",destination,teamNo,subClass);
    }

    public static String callScript(Variable scriptId){
        return String.format("(call_script,%s),",scriptId);
    }

    public static String partyJoinAsPrisoner(){
        return String.format("(party_join_as_prisoner),");
    }

    public static String changeScreenBuyMercenaries(){
        return String.format("(change_screen_buy_mercenaries),");
    }

    public static String getPlayerAgentNo(Variable destination){
        return String.format("(get_player_agent_no,%s),",destination);
    }

    public static String finishMission(){
        return String.format("(finish_mission),");
    }

    public static String storeRemainingTeamNo(Variable destination){
        return String.format("(store_remaining_team_no,%s),",destination);
    }

    public static String overlaySetPosition(Variable overlayId,Variable positionNo){
        return String.format("(overlay_set_position,%s,%s),",overlayId,positionNo);
    }

    public static String createMeshOverlay(Variable destination,Variable meshId){
        return String.format("(create_mesh_overlay,%s,%s),",destination,meshId);
    }

    public static String partyIsInTown(Variable partyId1,Variable partyId2){
        return String.format("(party_is_in_town,%s,%s),",partyId1,partyId2);
    }

    public static String partyForceAddMembers(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_force_add_members,%s,%s,%s),",partyId,troopId,number);
    }

    public static String modifyVisitorsAtSite(Variable sceneId){
        return String.format("(modify_visitors_at_site,%s),",sceneId);
    }

    public static String factionSetSlot(Variable factionId,Variable slotNo,Variable value){
        return String.format("(faction_set_slot,%s,%s,%s),",factionId,slotNo,value);
    }

    public static String partyCanJoinParty(Variable joinerPartyId,Variable hostPartyId,Variable flipPrisoners){
        return String.format("(party_can_join_party,%s,%s,%s),",joinerPartyId,hostPartyId,flipPrisoners);
    }

    public static String overlaySetColor(Variable overlayId,Variable color){
        return String.format("(overlay_set_color,%s,%s),",overlayId,color);
    }

    public static String checkQuestFailed(Variable questId){
        return String.format("(check_quest_failed,%s),",questId);
    }

    public static String partyStackGetSize(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_stack_get_size,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String troopSlotGe(Variable troopId,Variable slotNo,Variable value){
        return String.format("(troop_slot_ge,%s,%s,%s),",troopId,slotNo,value);
    }

    public static String positionSetZToGroundLevel(Variable positionNo){
        return String.format("(position_set_z_to_ground_level,%s),",positionNo);
    }

    public static String partyGetPrisonerStackSize(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_get_prisoner_stack_size,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String storeRandomQuestInRange(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(store_random_quest_in_range,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String stopAllSounds(Variable options){
        return String.format("(stop_all_sounds,%s),",options);
    }

    public static String agentGetSlot(Variable destination,Variable agentId,Variable slotNo){
        return String.format("(agent_get_slot,%s,%s,%s),",destination,agentId,slotNo);
    }

    public static String troopRemoveItems(Variable troopId,Variable itemId,Variable number){
        return String.format("(troop_remove_items,%s,%s,%s),",troopId,itemId,number);
    }

    public static String getPartyAiCurrentObject(Variable destination,Variable partyId){
        return String.format("(get_party_ai_current_object,%s,%s),",destination,partyId);
    }

    public static String factionSlotGe(Variable factionId,Variable slotNo,Variable value){
        return String.format("(faction_slot_ge,%s,%s,%s),",factionId,slotNo,value);
    }

    public static String itemGetType(Variable destination,Variable itemId){
        return String.format("(item_get_type,%s,%s),",destination,itemId);
    }

    public static String valClamp(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(val_clamp,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String getPlayerAgentKillCount(Variable destination,Variable getWounded){
        return String.format("(get_player_agent_kill_count,%s,%s),",destination,getWounded);
    }

    public static String removeMemberFromParty(Variable troopId,Variable partyId){
        return String.format("(remove_member_from_party,%s,%s),",troopId,partyId);
    }

    public static String agentSetHitPoints(Variable agentId,Variable value,Variable absolute){
        return String.format("(agent_set_hit_points,%s,%s,%s),",agentId,value,absolute);
    }

    public static String partyAddTemplate(Variable partyId,Variable partyTemplateId,Variable reversePrisonerStatus){
        return String.format("(party_add_template,%s,%s,%s),",partyId,partyTemplateId,reversePrisonerStatus);
    }

    public static String troopSetHealth(){
        return String.format("(troop_set_health),");
    }

    public static String setPartyCreationRandomLimits(Variable minValue,Variable maxValue){
        return String.format("(set_party_creation_random_limits,%s,%s),",minValue,maxValue);
    }

    public static String changeScreenNotes(Variable noteType,Variable objectId){
        return String.format("(change_screen_notes,%s,%s),",noteType,objectId);
    }

    public static String positionTransformPositionToLocal(Variable destPositionNo,Variable positionNo,Variable positionNoToBeTransformed){
        return String.format("(position_transform_position_to_local,%s,%s,%s),",destPositionNo,positionNo,positionNoToBeTransformed);
    }

    public static String teamSetOrderListener(Variable teamNo,Variable subClass){
        return String.format("(team_set_order_listener,%s,%s),",teamNo,subClass);
    }

    public static String createImageButtonOverlay(Variable destination,Variable meshId,Variable meshId2){
        return String.format("(create_image_button_overlay,%s,%s,%s),",destination,meshId,meshId2);
    }

    public static String createTextOverlay(Variable destination,Variable stringId){
        return String.format("(create_text_overlay,%s,%s),",destination,stringId);
    }

    public static String agentGetPartyId(Variable destination,Variable agentId){
        return String.format("(agent_get_party_id,%s,%s),",destination,agentId);
    }

    public static String changeScreenExchangeMembers(){
        return String.format("(change_screen_exchange_members),");
    }

    public static String heroCanJoin(Variable partyId){
        return String.format("(hero_can_join,%s),",partyId);
    }

    public static String troopGetUpgradeTroop(Variable destination,Variable troopId,Variable upgradePath){
        return String.format("(troop_get_upgrade_troop,%s,%s,%s),",destination,troopId,upgradePath);
    }

    public static String changeScreenTradePrisoners(){
        return String.format("(change_screen_trade_prisoners),");
    }

    public static String storeNumRegularPrisoners(){
        return String.format("(store_num_regular_prisoners),");
    }

    public static String agentSetWalkForwardAction(Variable agentId,Variable animId){
        return String.format("(agent_set_walk_forward_action,%s,%s),",agentId,animId);
    }

    public static String agentGetKillCount(Variable destination,Variable agentId,Variable getWounded){
        return String.format("(agent_get_kill_count,%s,%s,%s),",destination,agentId,getWounded);
    }

    public static String storeAttackerCount(Variable destination){
        return String.format("(store_attacker_count,%s),",destination);
    }

    public static String overlaySetMeshRotation(Variable overlayId,Variable positionNo){
        return String.format("(overlay_set_mesh_rotation,%s,%s),",overlayId,positionNo);
    }

    public static String storeRandomTroopToRaise(Variable destination,Variable lowerBound,Variable upperBound){
        return String.format("(store_random_troop_to_raise,%s,%s,%s),",destination,lowerBound,upperBound);
    }

    public static String agentClearScriptedMode(Variable agentId){
        return String.format("(agent_clear_scripted_mode,%s),",agentId);
    }

    public static String agentIsDefender(Variable agentId){
        return String.format("(agent_is_defender,%s),",agentId);
    }

    public static String getPartyAiCurrentBehavior(Variable destination,Variable partyId){
        return String.format("(get_party_ai_current_behavior,%s,%s),",destination,partyId);
    }

    public static String dialogBox(){
        return String.format("(dialog_box),");
    }

    public static String addPointLight(Variable flickerMagnitude,Variable flickerInterval){
        return String.format("(add_point_light,%s,%s),",flickerMagnitude,flickerInterval);
    }

    public static String setResultString(Variable stringId){
        return String.format("(set_result_string,%s),",stringId);
    }

    public static String partySetAiInitiative(Variable partyId,Variable value){
        return String.format("(party_set_ai_initiative,%s,%s),",partyId,value);
    }

    public static String entryPointGetPosition(Variable positionNo,Variable entryNo){
        return String.format("(entry_point_get_position,%s,%s),",positionNo,entryNo);
    }

    public static String partyGetNumCompanions(Variable destination,Variable partyId){
        return String.format("(party_get_num_companions,%s,%s),",destination,partyId);
    }

    public static String musicSetSituation(Variable situationType){
        return String.format("(music_set_situation,%s),",situationType);
    }

    public static String storeTriggerParam1(Variable destination){
        return String.format("(store_trigger_param_1,%s),",destination);
    }

    public static String storeTriggerParam2(Variable destination){
        return String.format("(store_trigger_param_2,%s),",destination);
    }

    public static String createMeshOverlayWithTableauMaterial(Variable destination,Variable meshId,Variable tableauMaterialId,Variable value){
        return String.format("(create_mesh_overlay_with_tableau_material,%s,%s,%s,%s),",destination,meshId,tableauMaterialId,value);
    }

    public static String particleSystemAddNew(Variable parSysId,Variable positionNo){
        return String.format("(particle_system_add_new,%s,%s),",parSysId,positionNo);
    }

    public static String troopJoin(Variable troopId){
        return String.format("(troop_join,%s),",troopId);
    }

    public static String missionCamSetAparture(){
        return String.format("(mission_cam_set_aparture),");
    }

    public static String addTroopNoteTableauMesh(Variable troopId,Variable tableauMaterialId){
        return String.format("(add_troop_note_tableau_mesh,%s,%s),",troopId,tableauMaterialId);
    }

    public static String propInstanceSetPosition(){
        return String.format("(prop_instance_set_position),");
    }

    public static String startBackgroundPresentation(Variable presentationId){
        return String.format("(start_background_presentation,%s),",presentationId);
    }

    public static String valAdd(Variable destination,Variable value){
        return String.format("(val_add,%s,%s),",destination,value);
    }

    public static String overlayAddItem(Variable overlayId,Variable stringId){
        return String.format("(overlay_add_item,%s,%s),",overlayId,stringId);
    }

    public static String partyClear(Variable partyId){
        return String.format("(party_clear,%s),",partyId);
    }

    public static String missionTplEntrySetOverrideFlags(){
        return String.format("(mission_tpl_entry_set_override_flags),");
    }

    public static String elseTry(){
        return String.format("(else_try),");
    }

    public static String curTableauAddTroop(Variable troopId,Variable positionNo,Variable animationId,Variable instanceNo){
        return String.format("(cur_tableau_add_troop,%s,%s,%s,%s),",troopId,positionNo,animationId,instanceNo);
    }

    public static String talkInfoShow(){
        return String.format("(talk_info_show),");
    }

    public static String storeSqrt(Variable destinationFixedPoint,Variable valueFixedPoint){
        return String.format("(store_sqrt,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }

    public static String curTableauSetAmbientLight(Variable redFixedPoint,Variable greenFixedPoint,Variable blueFixedPoint){
        return String.format("(cur_tableau_set_ambient_light,%s,%s,%s),",redFixedPoint,greenFixedPoint,blueFixedPoint);
    }

    public static String partySetBanditAttraction(Variable partyId,Variable attaraction){
        return String.format("(party_set_bandit_attraction,%s,%s),",partyId,attaraction);
    }

    public static String storeTroopFaction(Variable destination,Variable troopId){
        return String.format("(store_troop_faction,%s,%s),",destination,troopId);
    }

    public static String troopGetXp(Variable destination,Variable troopId){
        return String.format("(troop_get_xp,%s,%s),",destination,troopId);
    }

    public static String teamGetMovementOrder(Variable destination,Variable teamNo,Variable subClass){
        return String.format("(team_get_movement_order,%s,%s,%s),",destination,teamNo,subClass);
    }

    public static String storeNumPartiesDestroyed(Variable destination,Variable partyTemplateId){
        return String.format("(store_num_parties_destroyed,%s,%s),",destination,partyTemplateId);
    }

    public static String curTableauAddSunLight(Variable mapIconId,Variable positionNo,Variable redFixedPoint,Variable greenFixedPoint,Variable blueFixedPoint){
        return String.format("(cur_tableau_add_sun_light,%s,%s,%s,%s,%s),",mapIconId,positionNo,redFixedPoint,greenFixedPoint,blueFixedPoint);
    }

    public static String storePartnerFaction(Variable destination){
        return String.format("(store_partner_faction,%s),",destination);
    }

    public static String mouseGetPosition(Variable positionNo){
        return String.format("(mouse_get_position,%s),",positionNo);
    }

    public static String teamGetWeaponUsageOrder(Variable destination,Variable teamNo,Variable subClass){
        return String.format("(team_get_weapon_usage_order,%s,%s,%s),",destination,teamNo,subClass);
    }

    public static String partyCountPrisonersOfType(Variable destination,Variable partyId,Variable troopId){
        return String.format("(party_count_prisoners_of_type,%s,%s,%s),",destination,partyId,troopId);
    }

    public static String storeRandomInRange(Variable destination,Variable rangeLow,Variable rangeHigh){
        return String.format("(store_random_in_range,%s,%s,%s),",destination,rangeLow,rangeHigh);
    }

    public static String overlayAnimateToSize(){
        return String.format("(overlay_animate_to_size),");
    }

    public static String sceneSetSlot(Variable sceneId,Variable slotNo,Variable value){
        return String.format("(scene_set_slot,%s,%s,%s),",sceneId,slotNo,value);
    }

    public static String agentDeliverDamageToAgent(Variable agentIdDeliverer,Variable agentId){
        return String.format("(agent_deliver_damage_to_agent,%s,%s),",agentIdDeliverer,agentId);
    }

    public static String troopRaiseProficiencyLinear(){
        return String.format("(troop_raise_proficiency_linear),");
    }

    public static String troopHasItemEquipped(Variable troopId,Variable itemId){
        return String.format("(troop_has_item_equipped,%s,%s),",troopId,itemId);
    }

    public static String partyStackGetNumWounded(Variable destination,Variable partyId,Variable stackNo){
        return String.format("(party_stack_get_num_wounded,%s,%s,%s),",destination,partyId,stackNo);
    }

    public static String propInstanceGetStartingPosition(Variable positionNo,Variable scenePropId){
        return String.format("(prop_instance_get_starting_position,%s,%s),",positionNo,scenePropId);
    }

    public static String storeConversationAgent(Variable destination){
        return String.format("(store_conversation_agent,%s),",destination);
    }

    public static String partyQuickAttachToCurrentBattle(){
        return String.format("(party_quick_attach_to_current_battle),");
    }

    public static String healParty(Variable partyId){
        return String.format("(heal_party,%s),",partyId);
    }

    public static String partyAddMembers(Variable partyId,Variable troopId,Variable number){
        return String.format("(party_add_members,%s,%s,%s),",partyId,troopId,number);
    }

    public static String storeProficiencyLevel(Variable destination,Variable troopId,Variable attributeId){
        return String.format("(store_proficiency_level,%s,%s,%s),",destination,troopId,attributeId);
    }

    public static String partyPrisonerStackGetTroopId(){
        return String.format("(party_prisoner_stack_get_troop_id),");
    }

    public static String spawnHorse(){
        return String.format("(spawn_horse),");
    }

    public static String troopRemoveItem(Variable troopId,Variable itemId){
        return String.format("(troop_remove_item,%s,%s),",troopId,itemId);
    }

    public static String positionGetRotationAroundZ(Variable destination,Variable positionNo){
        return String.format("(position_get_rotation_around_z,%s,%s),",destination,positionNo);
    }

    public static String missionTplEntryAddOverrideItem(){
        return String.format("(mission_tpl_entry_add_override_item),");
    }

    public static String changeScreenExchangeWithParty(Variable partyId){
        return String.format("(change_screen_exchange_with_party,%s),",partyId);
    }

    public static String missionTimeSpeedMoveToValue(){
        return String.format("(mission_time_speed_move_to_value),");
    }

    public static String addXpToTroop(Variable value,Variable troopId){
        return String.format("(add_xp_to_troop,%s,%s),",value,troopId);
    }

    public static String troopInventorySlotGetItemAmount(Variable destination,Variable troopId,Variable inventorySlotNo){
        return String.format("(troop_inventory_slot_get_item_amount,%s,%s,%s),",destination,troopId,inventorySlotNo);
    }

    public static String curItemSetTableuMaterial(Variable tableauMaterialId,Variable instanceCode){
        return String.format("(cur_item_set_tableu_material,%s,%s),",tableauMaterialId,instanceCode);
    }

    public static String changeScreenTraining(){
        return String.format("(change_screen_training),");
    }

    public static String partySlotEq(Variable partyId,Variable slotNo,Variable value){
        return String.format("(party_slot_eq,%s,%s,%s),",partyId,slotNo,value);
    }

    public static String setMercenarySourceParty(Variable partyId){
        return String.format("(set_mercenary_source_party,%s),",partyId);
    }

    public static String storeTroopCountCompanions(Variable destination,Variable troopId,Variable partyId){
        return String.format("(store_troop_count_companions,%s,%s,%s),",destination,troopId,partyId);
    }

    public static String partyGetCurrentTerrain(Variable destination,Variable partyId){
        return String.format("(party_get_current_terrain,%s,%s),",destination,partyId);
    }

    public static String missionGetTimeSpeed(Variable destinationFixedPoint){
        return String.format("(mission_get_time_speed,%s),",destinationFixedPoint);
    }

    public static String succeedQuest(Variable questId){
        return String.format("(succeed_quest,%s),",questId);
    }

    public static String curTableauAddHorse(Variable itemId,Variable positionNo,Variable animationId){
        return String.format("(cur_tableau_add_horse,%s,%s,%s),",itemId,positionNo,animationId);
    }

    public static String partyClearParticleSystems(Variable partyId){
        return String.format("(party_clear_particle_systems,%s),",partyId);
    }

    public static String partyIsInAnyTown(Variable partyId){
        return String.format("(party_is_in_any_town,%s),",partyId);
    }

    public static String strStoreTroopNameLink(Variable stringRegister,Variable troopId){
        return String.format("(str_store_troop_name_link,%s,%s),",stringRegister,troopId);
    }

    public static String valAbs(Variable destination){
        return String.format("(val_abs,%s),",destination);
    }

    public static String overlaySetHilightAlpha(Variable overlayId,Variable alpha){
        return String.format("(overlay_set_hilight_alpha,%s,%s),",overlayId,alpha);
    }

    public static String storeTan(Variable destinationFixedPoint,Variable valueFixedPoint){
        return String.format("(store_tan,%s,%s),",destinationFixedPoint,valueFixedPoint);
    }

    public static String curTableauAddMeshWithScaleAndVertexColor(Variable meshId,Variable positionNo,Variable positionNo2,Variable valueFixedPoint,Variable value){
        return String.format("(cur_tableau_add_mesh_with_scale_and_vertex_color,%s,%s,%s,%s,%s),",meshId,positionNo,positionNo2,valueFixedPoint,value);
    }

    public static String overlayAnimateToHighlightColor(){
        return String.format("(overlay_animate_to_highlight_color),");
    }

    public static String overlaySetText(Variable overlayId,Variable stringId){
        return String.format("(overlay_set_text,%s,%s),",overlayId,stringId);
    }

    public static String partyGetIcon(Variable destination,Variable partyId){
        return String.format("(party_get_icon,%s,%s),",destination,partyId);
    }

    public static String agentSetStandAction(Variable agentId,Variable animId){
        return String.format("(agent_set_stand_action,%s,%s),",agentId,animId);
    }

    public static String createCheckBoxOverlay(Variable destination){
        return String.format("(create_check_box_overlay,%s),",destination);
    }

    public static String createGameButtonOverlay(Variable destination,Variable stringId){
        return String.format("(create_game_button_overlay,%s,%s),",destination,stringId);
    }

    public static String troopGetType(Variable destination,Variable troopId){
        return String.format("(troop_get_type,%s,%s),",destination,troopId);
    }

    public static String storeAttributeLevel(Variable destination,Variable troopId,Variable attributeId){
        return String.format("(store_attribute_level,%s,%s,%s),",destination,troopId,attributeId);
    }

    public static String partyIsActive(Variable partyId){
        return String.format("(party_is_active,%s),",partyId);
    }

    public static String createButtonOverlay(Variable destination,Variable stringId){
        return String.format("(create_button_overlay,%s,%s),",destination,stringId);
    }

    public static String missionTplEntryClearOverrideItems(){
        return String.format("(mission_tpl_entry_clear_override_items),");
    }

    public static String resetItemProbabilities(){
        return String.format("(reset_item_probabilities),");
    }

    public static String storeMissionTimerB(Variable destination){
        return String.format("(store_mission_timer_b,%s),",destination);
    }

    public static String factionSetName(Variable factionId,Variable stringId){
        return String.format("(faction_set_name,%s,%s),",factionId,stringId);
    }

    public static String valDiv(Variable destination,Variable value){
        return String.format("(val_div,%s,%s),",destination,value);
    }

    public static String storeMissionTimerA(Variable destination){
        return String.format("(store_mission_timer_a,%s),",destination);
    }

    public static String missionDisableTalk(){
        return String.format("(mission_disable_talk),");
    }

    public static String curTableauSetOverrideFlags(Variable value){
        return String.format("(cur_tableau_set_override_flags,%s),",value);
    }

    public static String storeMul(Variable destination,Variable value,Variable value2){
        return String.format("(store_mul,%s,%s,%s),",destination,value,value2);
    }

    public static String storeMissionTimerC(Variable destination){
        return String.format("(store_mission_timer_c,%s),",destination);
    }

    public static String partySetFlag(Variable partyId,Variable flag,Variable clearOrSet){
        return String.format("(party_set_flag,%s,%s,%s),",partyId,flag,clearOrSet);
    }

    public static String partySetAiTargetPosition(Variable partyId,Variable positionNo){
        return String.format("(party_set_ai_target_position,%s,%s),",partyId,positionNo);
    }

    public static String setSpawnPosition(){
        return String.format("(set_spawn_position),");
    }

    public static String missionCamAnimateToPositionAndAparture(){
        return String.format("(mission_cam_animate_to_position_and_aparture),");
    }

    public static String changeScreenEquipOther(Variable troopId){
        return String.format("(change_screen_equip_other,%s),",troopId);
    }

    public static String overlaySetAreaSize(Variable overlayId,Variable positionNo){
        return String.format("(overlay_set_area_size,%s,%s),",overlayId,positionNo);
    }

    public static String setJumpEntry(Variable entryNo){
        return String.format("(set_jump_entry,%s),",entryNo);
    }

    public static String selectEnemy(Variable value){
        return String.format("(select_enemy,%s),",value);
    }

    public static String storeNumFreeStacks(Variable destination,Variable partyId){
        return String.format("(store_num_free_stacks,%s,%s),",destination,partyId);
    }

    public static String storeScriptParam1(Variable destination){
        return String.format("(store_script_param_1,%s),",destination);
    }

    public static String storeScriptParam2(Variable destination){
        return String.format("(store_script_param_2,%s),",destination);
    }

    public static String startQuest(Variable questId){
        return String.format("(start_quest,%s),",questId);
    }

    public static String simulateBattle(Variable value){
        return String.format("(simulate_battle,%s),",value);
    }

    public static String curTableauAddTableauMesh(Variable tableauMaterialId,Variable value,Variable positionRegisterNo){
        return String.format("(cur_tableau_add_tableau_mesh,%s,%s,%s),",tableauMaterialId,value,positionRegisterNo);
    }

    public static String storeQuestItem(Variable destination,Variable itemId){
        return String.format("(store_quest_item,%s,%s),",destination,itemId);
    }

    public static String agentGetWieldedItem(Variable destination,Variable agentId,Variable handNo){
        return String.format("(agent_get_wielded_item,%s,%s,%s),",destination,agentId,handNo);
    }

    public static String partySlotGe(Variable partyId,Variable slotNo,Variable value){
        return String.format("(party_slot_ge,%s,%s,%s),",partyId,slotNo,value);
    }

    public static String removeTroopsFromCompanions(Variable troopId,Variable value){
        return String.format("(remove_troops_from_companions,%s,%s),",troopId,value);
    }

    public static String storeRandomEquipment(){
        return String.format("(store_random_equipment),");
    }

    public static String gameKeyClicked(){
        return String.format("(game_key_clicked),");
    }

    public static String positionRotateX(Variable positionNo,Variable angle){
        return String.format("(position_rotate_x,%s,%s),",positionNo,angle);
    }

    public static String positionRotateY(Variable positionNo,Variable angle){
        return String.format("(position_rotate_y,%s,%s),",positionNo,angle);
    }

    public static String tutorialMessage(Variable stringId,Variable color){
        return String.format("(tutorial_message,%s,%s),",stringId,color);
    }

    public static String getGlobalHazeAmount(Variable destination){
        return String.format("(get_global_haze_amount,%s),",destination);
    }

    public static String troopSetSlot(Variable troopId,Variable slotNo,Variable value){
        return String.format("(troop_set_slot,%s,%s,%s),",troopId,slotNo,value);
    }

    public static String positionRotateZ(Variable positionNo,Variable angle){
        return String.format("(position_rotate_z,%s,%s),",positionNo,angle);
    }

    public static String displayMessage(Variable stringId,Variable hexColourCode){
        return String.format("(display_message,%s,%s),",stringId,hexColourCode);
    }

    public static String partyCountMembersOfType(Variable destination,Variable partyId,Variable troopId){
        return String.format("(party_count_members_of_type,%s,%s,%s),",destination,partyId,troopId);
    }

    public static String setItemProbabilityInMerchandise(Variable itmId,Variable value){
        return String.format("(set_item_probability_in_merchandise,%s,%s),",itmId,value);
    }

    public static String storePartySizeWoPrisoners(Variable destination,Variable partyId){
        return String.format("(store_party_size_wo_prisoners,%s,%s),",destination,partyId);
    }

    public static String troopClearInventory(Variable troopId){
        return String.format("(troop_clear_inventory,%s),",troopId);
    }

    public static String storeTroopValue(Variable destination,Variable troopId){
        return String.format("(store_troop_value,%s,%s),",destination,troopId);
    }

    public static String restForHours(Variable restPeriod,Variable timeSpeed,Variable remainAttackable){
        return String.format("(rest_for_hours,%s,%s,%s),",restPeriod,timeSpeed,remainAttackable);
    }

    public static String partyAddXpToStack(Variable partyId,Variable stackNo,Variable xpAmount){
        return String.format("(party_add_xp_to_stack,%s,%s,%s),",partyId,stackNo,xpAmount);
    }

    public static String troopsCanJoinAsPrisoner(Variable value){
        return String.format("(troops_can_join_as_prisoner,%s),",value);
    }

    public static String replaceSceneProps(Variable oldScenePropId,Variable newScenePropId){
        return String.format("(replace_scene_props,%s,%s),",oldScenePropId,newScenePropId);
    }

    public static String setJumpMission(Variable missionTemplateId){
        return String.format("(set_jump_mission,%s),",missionTemplateId);
    }

    public static String completeQuest(Variable questId){
        return String.format("(complete_quest,%s),",questId);
    }

    public static String setupQuestGiver(Variable questId,Variable stringId){
        return String.format("(setup_quest_giver,%s,%s),",questId,stringId);
    }

    public static String addGoldToParty(Variable value,Variable partyId){
        return String.format("(add_gold_to_party,%s,%s),",value,partyId);
    }

    public static String propInstanceGetPosition(Variable positionNo,Variable scenePropId){
        return String.format("(prop_instance_get_position,%s,%s),",positionNo,scenePropId);
    }

    public static String strStoreTroopNameByCount(Variable stringRegister,Variable troopId,Variable number){
        return String.format("(str_store_troop_name_by_count,%s,%s,%s),",stringRegister,troopId,number);
    }

    public static String tryForAgents(Variable destination){
        return String.format("(try_for_agents,%s),",destination);
    }

    public static String storeTroopCountPrisoners(Variable destination,Variable troopId,Variable partyId){
        return String.format("(store_troop_count_prisoners,%s,%s,%s),",destination,troopId,partyId);
    }

    public static String sceneSlotGe(Variable sceneId,Variable slotNo,Variable value){
        return String.format("(scene_slot_ge,%s,%s,%s),",sceneId,slotNo,value);
    }

    public static String agentGetHorse(Variable destination,Variable agentId){
        return String.format("(agent_get_horse,%s,%s),",destination,agentId);
    }


}
