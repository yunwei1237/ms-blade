package com.tcf.ms.command.core.base;

import com.tcf.ms.command.core.object.handle.slot.AbstractSlotOperation;
import com.tcf.ms.command.core.object.handle.slot.AgentSlot;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;

import java.util.HashMap;
import java.util.Map;

public class Context {
    //用于保存全部的slot数据
    public static Map<String, Map<String, AbstractSlotOperation.Slot>> slots = new HashMap<>();

    static {
        slots.put("agent",new HashMap<>());
        slots.put("faction",new HashMap<>());
        slots.put("item",new HashMap<>());
        slots.put("party",new HashMap<>());
        slots.put("partyTemplate",new HashMap<>());
        slots.put("quest",new HashMap<>());
        slots.put("scene",new HashMap<>());
        slots.put("troop",new HashMap<>());
    }
}
