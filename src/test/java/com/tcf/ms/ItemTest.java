package com.tcf.ms;

import com.tcf.ms.command.OperationWithResult;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ConditionScript;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.object.ItemHeader;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.object.handle.ItemHandle;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import org.junit.Test;

public class ItemTest {

    @Test
    public void test(){
        System.out.println("[\"no_item\",\"INVALID ITEM\", [(\"practice_sword\",0)], itp_type_one_handed_wpn|itp_primary|itp_secondary, itc_longsword, 3,weight(1.5)|spd_rtng(103)|weapon_length(90)|swing_damage(16,blunt)|thrust_damage(10,blunt),imodbits_none],");
        Item item = new Item().setItemId("no_item").setItemName("INVALID ITEM").setMeshes(new Item.MesheItem[]{new Item.MesheItem("practice_sword", ItemHeader.ItemMetheFlag.ixmesh_none)}).setFlags(new ItemHeader.ItemFlag[]{ItemHeader.ItemFlag.itp_type_one_handed_wpn,ItemHeader.ItemFlag.itp_primary,ItemHeader.ItemFlag.itp_secondary}).setCapabilities(new ItemHeader.ItemCapability[]{ItemHeader.ItemCapability.itc_longsword}).setValue(3).setItemStats(Item.ItemStatHelper.get().weight(1.5).spdRtng(103).weaponLength(90).swingDamage(16, Item.ItemStat.DamageType.blunt).thrustDamage(10, Item.ItemStat.DamageType.blunt).getValue()).setModifier(ItemHeader.ItemModifier.imodbits_none).setScriptSpan(new ScriptSpan(){{
            If(new ConditionScript(){{
                and(
                    le(1,2)
                );
            }},new ScriptSpan(){{
                forAgents(agentHandle -> new ScriptSpan(){{
                    fori(Variable.local("num"),0,18, variable -> new ScriptSpan(){{
                        SlotOperation slot = agentHandle.slot();
                        slot.createSlot("item",Item.class);
                        If(new ConditionScript(){{
                            and(
                                    slot.eq("name",Variable.number(18))
                            );
                        }},new ScriptSpan(){{
                            action(slot.set("item",new Item()));
                            OperationWithResult item2 = actionWithResult(slot.get("item"));
                            ItemHandle itemHandle = item2.get(ItemHandle.class);
                        }}).Else(new ScriptSpan(){{
                            action(slot.set("item",new Item()));
                        }});
                    }});
                }});
            }});
        }});
        System.out.println(item.toScriptString());
    }
}
