package com.tcf.ms;

import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.object.ItemHeader;
import org.junit.Test;

import java.beans.Transient;

public class ItemTest {

    @Test
    public void test(){
        //["no_item","INVALID ITEM", [("practice_sword",0)], itp_type_one_handed_wpn|itp_primary|itp_secondary, itc_longsword, 3,weight(1.5)|spd_rtng(103)|weapon_length(90)|swing_damage(16,blunt)|thrust_damage(10,blunt),imodbits_none],
        Item item = new Item().setItemId("no_item").setItemName("INVALID ITEM").setMeshes(new Item.MesheItem[]{new Item.MesheItem("practice_sword", ItemHeader.ItemMetheFlag.ixmesh_none)}).setFlags(new ItemHeader.ItemFlag[]{ItemHeader.ItemFlag.itp_type_one_handed_wpn}).setCapabilities(new ItemHeader.ItemCapability[]{ItemHeader.ItemCapability.itcf_parry_left_polearm}).setItemStats(Item.ItemStatHelper.get().weight(1).spdRtng(103).getValue()).setModifier(ItemHeader.ItemModifier.imodbits_armor);
        System.out.println(item.toScriptString());
    }
}
