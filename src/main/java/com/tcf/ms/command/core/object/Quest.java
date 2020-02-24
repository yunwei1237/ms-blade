package com.tcf.ms.command.core.object;
//####################################################################################################################
//#  Each quest record contains the following fields:
//#  1) Quest id: used for referencing quests in other files. The prefix qst_ is automatically added before each quest-id.
//#  2) Quest Name: Name displayed in the quest screen.
//#  3) Quest flags. See header_quests.py for a list of available flags
//#  4) Quest Description: Description displayed in the quest screen.
//#
//# Note that you may call the opcode setup_quest_text for setting up the name and description
//####################################################################################################################

import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Quest implements CanVariable {
    /**
     * 任务id
     */
    private String questId;
    /**
     * 任务名称（标题）
     */
    private String questName;
    /**
     * 标识
     */
    private QuestHeader.QuestFlag[] flags;
    /**
     * 描述
     */
    private String description;

    @Override
    public Variable getVar() {
        return Variable.constant(String.format("qst_", this.questId));
    }

    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("数据对象无法设置变量");
    }
}
