package com.tcf.ms.command.core;


import com.tcf.ms.command.core.object.Faction;
import com.tcf.ms.command.core.object.Item;

import java.util.List;

/**
 * 每一个module代表一个功能，每一个功能需要由很多的数据和功能组成
 * 可以添加
 * 1.阵营
 * 2.物品
 * 3.兵种
 * 4.队伍
 * 等等
 */
public interface module {
    void factions(List<Faction> factions);
    void items(List<Item> items);
}
