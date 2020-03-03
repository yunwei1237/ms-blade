package com.tcf.ms.test;

import com.tcf.ms.command.core.base.var.SregVariable;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.CurTableauAddOverrideItem;
import com.tcf.ms.command.core.base.var.PosVariable;
import com.tcf.ms.command.core.operation.OverlayAddItem;
import com.tcf.ms.command.core.operation.StrStoreItemNamePlural;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.ContextMenuAddItem;
import com.tcf.ms.command.core.operation.StoreItemValue;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.operation.ResetItemProbabilities;
import com.tcf.ms.command.core.operation.AgentGetWieldedItem;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.operation.CurItemSetTableauMaterial;
import com.tcf.ms.command.core.operation.StrStoreItemName;
import com.tcf.ms.command.core.object.ItemKind;
import com.tcf.ms.command.core.operation.TroopInventorySlotSetItemAmount;
import com.tcf.ms.command.core.operation.ItemGetType;
import com.tcf.ms.command.core.operation.MissionTplEntryAddOverrideItem;
import com.tcf.ms.command.core.operation.StoreItemKindCount;
import com.tcf.ms.command.core.object.Overlay;
import com.tcf.ms.command.core.operation.MissionTplEntryClearOverrideItems;
import com.tcf.ms.command.core.operation.StoreQuestItem;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.SetPriceRateForItemType;
import com.tcf.ms.command.core.object.handle.slot.ItemSlot;
import com.tcf.ms.command.core.operation.StrStoreItemNameByCount;
import com.tcf.ms.command.core.object.Animation;
import com.tcf.ms.command.core.object.MissionTemplate;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.AgentGetItemId;
import com.tcf.ms.command.core.operation.TroopEquipItems;
import com.tcf.ms.command.core.object.Agent;
import com.tcf.ms.command.core.operation.TroopInventorySlotGetItemMaxAmount;
import com.tcf.ms.command.core.operation.SetPriceRateForItem;
import com.tcf.ms.command.core.object.ItemType;
import com.tcf.ms.command.core.operation.SpawnItem;
import com.tcf.ms.command.core.operation.CurTableauAddHorse;
import com.tcf.ms.command.core.operation.TroopInventorySlotGetItemAmount;
import com.tcf.ms.command.core.object.GameString;
import com.tcf.ms.command.core.operation.CurTableauClearOverrideItems;
import com.tcf.ms.command.core.operation.SetItemProbabilityInMerchandise;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class ItemHandle {

    private StringVariable variable;

    public ItemHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new ItemSlot(this.variable);
    }

    /**
     *   (cur_tableau_clear_override_items),
     * @return
     */
    public static Operation curTableauClearOverrideItems(){
        return new CurTableauClearOverrideItems();
    }

    /**
     *   (agent_get_item_id,<destination>, <agent_id>), (works only for horses, returns -1 otherwise)
     * @return
     */
    public static Operation agentGetItemId(Variable destination,Agent agent){
        return new AgentGetItemId(destination,agent.getVar());
    }

    /**
     *   (set_price_rate_for_item_type,<item_type_id>,<value_percentage>),
     * @return
     */
    public static Operation setPriceRateForItemType(ItemType itemType,Variable valuePercentage){
        return new SetPriceRateForItemType(itemType.getVar(),valuePercentage);
    }

    /**
     *   (troop_inventory_slot_get_item_max_amount,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public static Operation troopInventorySlotGetItemMaxAmount(Variable destination,Troop troop,Variable inventorySlotNo){
        return new TroopInventorySlotGetItemMaxAmount(destination,troop.getVar(),inventorySlotNo);
    }

    /**
     *   (troop_equip_items,<troop_id>),  equips the items in the inventory automatically
     * @return
     */
    public static Operation troopEquipItems(Troop troop){
        return new TroopEquipItems(troop.getVar());
    }

    /**
     *   (troop_inventory_slot_set_item_amount,<troop_id>,<inventory_slot_no>,<value>),
     * @return
     */
    public static Operation troopInventorySlotSetItemAmount(Troop troop,Variable inventorySlotNo,Variable value){
        return new TroopInventorySlotSetItemAmount(troop.getVar(),inventorySlotNo,value);
    }

    /**
     *   (cur_item_set_tableu_material, <tableau_material_id>, <instance_code>),  only call inside ti_on_init_item in module_items
     * @return
     */
    public static Operation curItemSetTableauMaterial(TableauMaterial tableauMaterial,Variable instanceCode){
        return new CurItemSetTableauMaterial(tableauMaterial.getVar(),instanceCode);
    }

    /**
     *   (spawn_item, <item_kind_id>, <item_modifier>) 
     * @return
     */
    public static Operation spawnItem(ItemKind itemKind,Variable itemModifier){
        return new SpawnItem(itemKind.getVar(),itemModifier);
    }

    /**
     *   (right_mouse_menu_add_item, <string_id>, <value>),  must be called only inside script_game_right_mouse_menu_get_buttons
     * @return
     */
    public static Operation contextMenuAddItem(GameString string,Variable value){
        return new ContextMenuAddItem(string.getVar(),value);
    }

    /**
     *   (cur_tableau_add_override_item, <item_kind_id>),
     * @return
     */
    public static Operation curTableauAddOverrideItem(ItemKind itemKind){
        return new CurTableauAddOverrideItem(itemKind.getVar());
    }

    /**
     *   (overlay_add_item, <overlay_id>, <string_id>),   adds an item to the combo box
     * @return
     */
    public static Operation overlayAddItem(Overlay overlay,GameString string){
        return new OverlayAddItem(overlay.getVar(),string.getVar());
    }

    /**
     *   (mission_entry_add_override_item, <mission_template_id>, <entry_no>, <item_kind_id>),
     * @return
     */
    public static Operation missionTplEntryAddOverrideItem(MissionTemplate missionTemplate,Variable entryNo,ItemKind itemKind){
        return new MissionTplEntryAddOverrideItem(missionTemplate.getVar(),entryNo,itemKind.getVar());
    }

    /**
     *   (troop_inventory_slot_get_item_amount,<destination>,<troop_id>,<inventory_slot_no>),
     * @return
     */
    public static Operation troopInventorySlotGetItemAmount(Variable destination,Troop troop,Variable inventorySlotNo){
        return new TroopInventorySlotGetItemAmount(destination,troop.getVar(),inventorySlotNo);
    }

    /**
     *   (mission_entry_clear_override_items, <mission_template_id>, <entry_no>),
     * @return
     */
    public static Operation missionTplEntryClearOverrideItems(MissionTemplate missionTemplate,Variable entryNo){
        return new MissionTplEntryClearOverrideItems(missionTemplate.getVar(),entryNo);
    }

    /**
     *   (reset_item_probabilities),
     * @return
     */
    public static Operation resetItemProbabilities(){
        return new ResetItemProbabilities();
    }

    /**
     *   (agent_get_wielded_item,<destination>,<agent_id>,<hand_no>),
     * @return
     */
    public static Operation agentGetWieldedItem(Variable destination,Agent agent,Variable handNo){
        return new AgentGetWieldedItem(destination,agent.getVar(),handNo);
    }

    /**
     *   (set_item_probability_in_merchandise,<itm_id>,<value>),
     * @return
     */
    public static Operation setItemProbabilityInMerchandise(Item itm,Variable value){
        return new SetItemProbabilityInMerchandise(itm.getVar(),value);
    }

    /**
     *   (store_item_value,<destination>,<item_id>),
     * @return
     */
    public Operation storeItemValue(Variable destination){
        return new StoreItemValue(destination,this.variable);
    }

    /**
     *   (set_price_rate_for_item,<item_id>,<value_percentage>),
     * @return
     */
    public Operation setPriceRateForItem(Variable valuePercentage){
        return new SetPriceRateForItem(this.variable,valuePercentage);
    }

    /**
     *   (str_store_item_name_by_count,<string_register>,<item_id>),
     * @return
     */
    public Operation strStoreItemNameByCount(SregVariable stringRegister){
        return new StrStoreItemNameByCount(stringRegister.getVar(),this.variable);
    }

    /**
     *   (store_item_kind_count,<destination>,<item_id>,[troop_id]),
     * @return
     */
    public Operation storeItemKindCount(Variable destination,Troop troop){
        return new StoreItemKindCount(destination,this.variable,troop.getVar());
    }

    /**
     *   (str_store_item_name_plural,<string_register>,<item_id>),
     * @return
     */
    public Operation strStoreItemNamePlural(SregVariable stringRegister){
        return new StrStoreItemNamePlural(stringRegister.getVar(),this.variable);
    }

    /**
     *   (str_store_item_name,<string_register>,<item_id>),
     * @return
     */
    public Operation strStoreItemName(SregVariable stringRegister){
        return new StrStoreItemName(stringRegister.getVar(),this.variable);
    }

    /**
     *   (item_get_type, <destination>, <item_id>),  returned values are listed at header_items.py (values starting with itp_type_)
     * @return
     */
    public Operation itemGetType(Variable destination){
        return new ItemGetType(destination,this.variable);
    }

    /**
     *   (cur_tableau_add_horse, <item_id>, <position_no>, <animation_id>),
     * @return
     */
    public Operation curTableauAddHorse(PosVariable position,Animation animation){
        return new CurTableauAddHorse(this.variable,position.getVar(),animation.getVar());
    }

    /**
     *   (store_quest_item,<destination>,<item_id>),
     * @return
     */
    public Operation storeQuestItem(Variable destination){
        return new StoreQuestItem(destination,this.variable);
    }


}