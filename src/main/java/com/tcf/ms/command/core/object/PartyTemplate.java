package com.tcf.ms.command.core.object;


import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.BladeException;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import lombok.Data;
import lombok.experimental.Accessors;

//####################################################################################################################
//#  Each party template record contains the following fields:
//#  1) Party-template id: used for referencing party-templates in other files.
//#     The prefix pt_ is automatically added before each party-template id.
//#  2) Party-template name.
//#  3) Party flags. See header_parties.py for a list of available flags
//#  4) Menu. ID of the menu to use when this party is met. The value 0 uses the default party encounter system.
//#  5) Faction
//#  6) Personality. See header_parties.py for an explanation of personality flags.
//#  7) List of stacks. Each stack record is a tuple that contains the following fields:
//#    7.1) Troop-id.
//#    7.2) Minimum number of troops in the stack.
//#    7.3) Maximum number of troops in the stack.
//#    7.4) Member flags(optional). Use pmf_is_prisoner to note that this member is a prisoner.
//#     Note: There can be at most 6 stacks.
//####################################################################################################################
public class PartyTemplate implements CanVariable {
    /**
     * 模板id
     */
    private String partyTemplateId;
    /**
     * 模板名称
     */
    private String partyTemplateName;
    /**
     * 图标
     */
    private String icon;
    /**
     * 标识
     */
    private PartyHeader.PartyFlag[] flags;
    /**
     * 携带商品数量
     */
    private int carriesGoods;
    private int menu;
    private Faction faction;
    private PartyHeader.Personality[] personalities;
    private PartyTemplateStack[] partyTemplateStacks;

    @Override
    public StringVariable getVar() {
        return Variable.constant(String.format("pt_%s", this.partyTemplateId));
    }

    @Override
    public void setVar(StringVariable variable) {
        throw new BladeException("数据对象无法设置变量");
    }


    @Data
    @Accessors(chain = true)
    public static class PartyTemplateStack{
        /**
         * 兵种
         */
        private Troop troop;
        /**
         * 至少生成士兵数量
         */
        private int minimum;
        /**
         * 最多生成士兵数量
         */
        private int maximum;
        /**
         * 士兵是作为队友还是俘虏
         * 队友：0
         * 俘虏：1（pmf_is_prisoner）
         */
        private int flags;

        public PartyTemplateStack(Troop troop, int minimum, int maximum) {
            this(troop,minimum,maximum,0);
        }

        public PartyTemplateStack(Troop troop, int minimum, int maximum, int flags) {
            this.troop = troop;
            this.minimum = minimum;
            this.maximum = maximum;
            this.flags = flags;
        }
    }

}
