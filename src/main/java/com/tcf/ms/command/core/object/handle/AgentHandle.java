package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.operation.AgentGetAmmo;
import com.tcf.ms.command.core.operation.AgentDeliverDamageToAgent;
import com.tcf.ms.command.core.operation.AgentGetLookPosition;
import com.tcf.ms.command.core.operation.AgentIsWounded;
import com.tcf.ms.command.core.operation.AgentGetEntryNo;
import com.tcf.ms.command.core.operation.StrStoreAgentName;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.AgentPlaySound;
import com.tcf.ms.command.core.operation.AgentSetScriptedDestination;
import com.tcf.ms.command.core.operation.AgentGetWieldedItem;
import com.tcf.ms.command.core.operation.AgentGetRider;
import com.tcf.ms.command.core.operation.AgentGetSimpleBehavior;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.operation.AgentGetScriptedDestination;
import com.tcf.ms.command.core.operation.AgentGetItemId;
import com.tcf.ms.command.core.operation.AgentSetSpeedLimit;
import com.tcf.ms.command.core.operation.AgentIsAlly;
import com.tcf.ms.command.core.operation.AgentGetSlot;
import com.tcf.ms.command.core.operation.MissionCamClearTargetAgent;
import com.tcf.ms.command.core.operation.AgentHasItemEquipped;
import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.operation.AgentRefillAmmo;
import com.tcf.ms.command.core.operation.AgentGetTeam;
import com.tcf.ms.command.core.operation.AgentSetWalkForwardAnimation;
import com.tcf.ms.command.core.operation.StoreAgentHitPoints;
import com.tcf.ms.command.core.operation.AgentSetTeam;
import com.tcf.ms.command.core.operation.AgentGetPosition;
import com.tcf.ms.command.core.operation.AgentSetAnimation;
import com.tcf.ms.command.core.operation.AgentSetSlot;
import com.tcf.ms.command.core.operation.AgentGetPartyId;
import com.tcf.ms.command.core.operation.AgentGetClass;
import com.tcf.ms.command.core.operation.AgentSlotEq;
import com.tcf.ms.command.core.operation.AgentIsDefender;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.operation.AgentGetHorse;
import com.tcf.ms.command.core.operation.MissionCamSetTargetAgent;
import com.tcf.ms.command.core.operation.AgentSetAnimationProgress;
import com.tcf.ms.command.core.object.Sound;
import com.tcf.ms.command.core.operation.SpawnAgent;
import com.tcf.ms.command.core.operation.AgentAiSetAlwaysAttackInMelee;
import com.tcf.ms.command.core.operation.AgentSlotGe;
import com.tcf.ms.command.core.operation.AgentSetStandAnimation;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.AgentIsHuman;
import com.tcf.ms.command.core.operation.AgentSetHitPoints;
import com.tcf.ms.command.core.object.Animation;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.AgentGetTroopId;
import com.tcf.ms.command.core.operation.AgentGetCombatState;
import com.tcf.ms.command.core.operation.AgentGetKillCount;
import com.tcf.ms.command.core.operation.AgentClearScriptedMode;
import com.tcf.ms.command.core.operation.AgentIsAlive;
import com.tcf.ms.command.core.operation.AgentSetPosition;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class AgentHandle {

    private StringVariable variable;

    public AgentHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new AgentSlot(this.variable);
    }

    /**
     *   (agent_slot_ge,<agent_id>,<slot_no>,<value>),
     * @return
     */
    public Conditable agentSlotGe(Variable slotNo,Variable value){
        return new AgentSlotGe(this.variable,slotNo,value);
    }

    /**
     *   (agent_set_animation, <agent_id>, <anim_id>),
     * @return
     */
    public Operation agentSetAnimation(Animation anim){
        return new AgentSetAnimation(this.variable,anim.getVar());
    }

    /**
     *   (agent_set_scripted_destination,<agent_id>,<position_no>,<auto_set_z_to_ground_level>),  auto_set_z_to_ground_level can be 0 (false) or 1 (true)
     * @return
     */
    public Operation agentSetScriptedDestination(Variable positionNo,Variable autoSetZToGroundLevel){
        return new AgentSetScriptedDestination(this.variable,positionNo,autoSetZToGroundLevel);
    }

    /**
     *   (agent_get_rider,<destination>,<agent_id>),
     * @return
     */
    public Operation agentGetRider(Variable destination){
        return new AgentGetRider(destination,this.variable);
    }

    /**
     *   (agent_get_class ,<destination>, <agent_id>),
     * @return
     */
    public Operation agentGetClass(Variable destination){
        return new AgentGetClass(destination,this.variable);
    }

    /**
     *   (agent_is_ally,<agent_id>),
     * @return
     */
    public Conditable agentIsAlly(){
        return new AgentIsAlly(this.variable);
    }

    /**
     *   (spawn_agent,<troop_id>), (stores agent_id in reg0)
     * @return
     */
    public static Operation spawnAgent(Troop troop){
        return new SpawnAgent(troop.getVar());
    }

    /**
     *   (agent_get_item_id,<destination>, <agent_id>), (works only for horses, returns -1 otherwise)
     * @return
     */
    public Operation agentGetItemId(Variable destination){
        return new AgentGetItemId(destination,this.variable);
    }

    /**
     *   (agent_get_entry_no,<destination>,<agent_id>),
     * @return
     */
    public Operation agentGetEntryNo(Variable destination){
        return new AgentGetEntryNo(destination,this.variable);
    }

    /**
     *   (agent_set_animation_progress, <agent_id>, <value_fixed_point>),  value should be between 0-1 (as fixed point)
     * @return
     */
    public Operation agentSetAnimationProgress(Variable valueFixedPoint){
        return new AgentSetAnimationProgress(this.variable,valueFixedPoint);
    }

    /**
     *   (agent_is_wounded,<agent_id>),
     * @return
     */
    public Conditable agentIsWounded(){
        return new AgentIsWounded(this.variable);
    }

    /**
     *   (agent_set_position,<agent_id>,<position_no>),
     * @return
     */
    public Operation agentSetPosition(Variable positionNo){
        return new AgentSetPosition(this.variable,positionNo);
    }

    /**
     *   (agent_slot_eq,<agent_id>,<slot_no>,<value>),
     * @return
     */
    public Conditable agentSlotEq(Variable slotNo,Variable value){
        return new AgentSlotEq(this.variable,slotNo,value);
    }

    /**
     *   (agent_has_item_equipped,<agent_id>,<item_id>),
     * @return
     */
    public Conditable agentHasItemEquipped(Item item){
        return new AgentHasItemEquipped(this.variable,item.getVar());
    }

    /**
     *   (agent_set_walk_forward_action, <agent_id>, <anim_id>),
     * @return
     */
    public Operation agentSetWalkForwardAnimation(Animation anim){
        return new AgentSetWalkForwardAnimation(this.variable,anim.getVar());
    }

    /**
     *   (agent_ai_set_always_attack_in_melee, <agent_id>,<value>),  to be used in sieges so that agents don't wait on the ladder.
     * @return
     */
    public Operation agentAiSetAlwaysAttackInMelee(Variable value){
        return new AgentAiSetAlwaysAttackInMelee(this.variable,value);
    }

    /**
     *   (agent_play_sound, <agent_id>, <sound_id>),
     * @return
     */
    public Operation agentPlaySound(Sound sound){
        return new AgentPlaySound(this.variable,sound.getVar());
    }

    /**
     *   (agent_is_alive,<agent_id>),
     * @return
     */
    public Conditable agentIsAlive(){
        return new AgentIsAlive(this.variable);
    }

    /**
     *   (agent_is_human,<agent_id>),
     * @return
     */
    public Conditable agentIsHuman(){
        return new AgentIsHuman(this.variable);
    }

    /**
     *   (agent_get_position,<position_no>,<agent_id>),
     * @return
     */
    public Operation agentGetPosition(Variable positionNo){
        return new AgentGetPosition(positionNo,this.variable);
    }

    /**
     *   (agent_set_speed_limit,<agent_id>,<speed_limit(kilometers/hour)>),  Affects AI only 
     * @return
     */
    public static Operation agentSetSpeedLimit(){
        return new AgentSetSpeedLimit();
    }

    /**
     *   (agent_get_ammo,<destination>,<agent_id>),
     * @return
     */
    public Operation agentGetAmmo(Variable destination){
        return new AgentGetAmmo(destination,this.variable);
    }

    /**
     *   (agent_refill_ammo,<agent_id>),
     * @return
     */
    public Operation agentRefillAmmo(){
        return new AgentRefillAmmo(this.variable);
    }

    /**
     *   (agent_set_slot,<agent_id>,<slot_no>,<value>),
     * @return
     */
    public Operation agentSetSlot(Variable slotNo,Variable value){
        return new AgentSetSlot(this.variable,slotNo,value);
    }

    /**
     *   set absolute to 1 to retrieve actual hps, otherwise will return relative hp in range [0..100]  (store_agent_hit_points,<destination>,<agent_id>,[absolute]),
     * @return
     */
    public Operation storeAgentHitPoints(Variable destination,Variable absolute){
        return new StoreAgentHitPoints(destination,this.variable,absolute);
    }

    /**
     *   (agent_get_troop_id,<destination>, <agent_id>),
     * @return
     */
    public Operation agentGetTroopId(Variable destination){
        return new AgentGetTroopId(destination,this.variable);
    }

    /**
     *   (mission_cam_clear_target_agent)
     * @return
     */
    public static Operation missionCamClearTargetAgent(){
        return new MissionCamClearTargetAgent();
    }

    /**
     *   (str_store_agent_name,<string_register>,<agent_id>),
     * @return
     */
    public Operation strStoreAgentName(Variable stringRegister){
        return new StrStoreAgentName(stringRegister,this.variable);
    }

    /**
     *   (agent_get_team  ,<destination>, <agent_id>),
     * @return
     */
    public Operation agentGetTeam(Variable destination){
        return new AgentGetTeam(destination,this.variable);
    }

    /**
     *   (agent_set_team  , <agent_id>, <value>),
     * @return
     */
    public Operation agentSetTeam(Variable value){
        return new AgentSetTeam(this.variable,value);
    }

    /**
     *   (agent_get_simple_behavior, <destination>, <agent_id>),  constants are written in header_mission_templates.py, starting with aisb_
     * @return
     */
    public Operation agentGetSimpleBehavior(Variable destination){
        return new AgentGetSimpleBehavior(destination,this.variable);
    }

    /**
     *   (mission_cam_set_target_agent, <agent_id>, <value>)  if value = 0 then do not use agent's rotation, else use agent's rotation
     * @return
     */
    public Operation missionCamSetTargetAgent(Variable value){
        return new MissionCamSetTargetAgent(this.variable,value);
    }

    /**
     *   (agent_get_look_position, <position_no>, <agent_id>),
     * @return
     */
    public Operation agentGetLookPosition(Variable positionNo){
        return new AgentGetLookPosition(positionNo,this.variable);
    }

    /**
     *   (agent_set_stand_action, <agent_id>, <anim_id>),
     * @return
     */
    public Operation agentSetStandAnimation(Animation anim){
        return new AgentSetStandAnimation(this.variable,anim.getVar());
    }

    /**
     *   (agent_get_scripted_destination,<position_no>,<agent_id>),
     * @return
     */
    public Operation agentGetScriptedDestination(Variable positionNo){
        return new AgentGetScriptedDestination(positionNo,this.variable);
    }

    /**
     *   (agent_get_combat_state, <destination>, <agent_id>),
     * @return
     */
    public Operation agentGetCombatState(Variable destination){
        return new AgentGetCombatState(destination,this.variable);
    }

    /**
     *   (agent_get_slot,<destination>,<agent_id>,<slot_no>),
     * @return
     */
    public Operation agentGetSlot(Variable destination,Variable slotNo){
        return new AgentGetSlot(destination,this.variable,slotNo);
    }

    /**
     *   set absolute to 1 if value is absolute, otherwise value will be treated as relative number in range [0..100]  (agent_set_hit_points,<agent_id>,<value>,[absolute]),
     * @return
     */
    public Operation agentSetHitPoints(Variable value,Variable absolute){
        return new AgentSetHitPoints(this.variable,value,absolute);
    }

    /**
     *   (agent_get_party_id,<destination>,<agent_id>),
     * @return
     */
    public Operation agentGetPartyId(Variable destination){
        return new AgentGetPartyId(destination,this.variable);
    }

    /**
     *   (agent_get_kill_count,<destination>,<agent_id>,[get_wounded]),  Set second value to non-zero to getGroup wounded count
     * @return
     */
    public Operation agentGetKillCount(Variable destination,Variable getWounded){
        return new AgentGetKillCount(destination,this.variable,getWounded);
    }

    /**
     *   (agent_clear_scripted_mode,<agent_id>),
     * @return
     */
    public Operation agentClearScriptedMode(){
        return new AgentClearScriptedMode(this.variable);
    }

    /**
     *   (agent_is_defender,<agent_id>),
     * @return
     */
    public Conditable agentIsDefender(){
        return new AgentIsDefender(this.variable);
    }

    /**
     *   (agent_deliver_damage_to_agent,<agent_id_deliverer>,<agent_id>),
     * @return
     */
    public Operation agentDeliverDamageToAgent(Variable agentIdDeliverer){
        return new AgentDeliverDamageToAgent(agentIdDeliverer,this.variable);
    }

    /**
     *   (agent_get_wielded_item,<destination>,<agent_id>,<hand_no>),
     * @return
     */
    public Operation agentGetWieldedItem(Variable destination,Variable handNo){
        return new AgentGetWieldedItem(destination,this.variable,handNo);
    }

    /**
     *   (agent_get_horse,<destination>,<agent_id>),
     * @return
     */
    public Operation agentGetHorse(Variable destination){
        return new AgentGetHorse(destination,this.variable);
    }


}