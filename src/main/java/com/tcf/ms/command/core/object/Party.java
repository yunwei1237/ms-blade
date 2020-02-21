package com.tcf.ms.command.core.object;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.Position;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
//####################################################################################################################
//#  Each party record contains the following fields:
//#  1) Party id: used for referencing parties in other files.
//#     The prefix p_ is automatically added before each party id.
//#  2) Party name.
//#  3) Party flags. See header_parties.py for a list of available flags
//#  4) Menu. ID of the menu to use when this party is met. The value 0 uses the default party encounter system.
//#  5) Party-template. ID of the party template this party belongs to. Use pt_none as the default value.
//#  6) Faction.
//#  7) Personality. See header_parties.py for an explanation of personality flags.
//#  8) Ai-behavior
//#  9) Ai-target party
//# 10) Initial coordinates.
//# 11) List of stacks. Each stack record is a triple that contains the following fields:
//#   11.1) Troop-id.
//#   11.2) Number of troops in this stack.
//#   11.3) Member flags. Use pmf_is_prisoner to note that this member is a prisoner.
//# 12) Party direction in degrees [optional]
//####################################################################################################################

@Data
@Accessors(chain = true)
public class Party implements Operation, CanVariable {
    /**
     * 队伍id，全局唯一
     */
    private String partyId;
    /**
     * 队伍名称
     */
    private String partyName;
    /**
     * 队伍标志
     */
    private PartyHeader.PartyFlag[] Partyflags;
    /**
     * 队伍菜单
     */
    private Variable menu = PartyHeader.no_menu;
    /**
     * 队伍模板
     */
    private String partyTemplateId;
    /**
     * 队伍阵营
     */
    private Faction faction;
    /**
     * 队伍特性
     */
    private PartyHeader.Personality[] personalities;
    /**
     * ai行为
     */
    private PartyHeader.AiBhvr[] aiBehavior;
    /**
     * ai的目标
     */
    private int aiTarget = 0;
    /**
     * 初始坐标
     */
    private Position location;
    /**
     * 队伍中的兵种
     */
    private List<TroopStack> troopStack;
    /**
     * 队伍方向
     */
    private double degree;


    private String getTroopStackStr(){
        if(Objects.isNull(troopStack) || troopStack.size() == 0){
            return "";
        }
        return String.join(",", this.troopStack.stream()
                .map(troopStack->
                        String.format("(%s,%s,%s)",troopStack.troopId,troopStack.nums,troopStack.flags)
                ).collect(Collectors.toList()));
    }

    @Override
    public String toScriptString() {
        return String.format("(" +
                "\"%s\"," +
                "\"%s\"," +
                "%s, " +
                "%s, " +
                "%s," +
                "%s," +
                "%s," +
                "%s," +
                "%s," +
                "(%s, %s)," +
                "[%s]),",
                this.partyId,
                this.partyName,
                PartyHeader.PartyFlag.getValue(this.Partyflags),
                this.menu,
                this.partyTemplateId,
                this.faction.getVar(),
                PartyHeader.Personality.getValue(this.personalities),
                PartyHeader.AiBhvr.getValue(this.aiBehavior),
                this.aiTarget,
                this.location.getX(),this.location.getY(),
                this.getTroopStackStr()
                );
    }

    @Override
    public StringVariable getVar() {
        return Variable.constant(String.format("p_%s",this.partyId));
    }


    @Data
    public static class TroopStack{
        /**
         * 兵种id
         */
        private String troopId;
        /**
         * 兵种数量
         */
        private int nums;
        /**
         * 是否为俘虏：
         * 0：否
         * 1: 是
         */
        private int flags;

        public TroopStack(String troopId, int nums) {
            this.troopId = troopId;
            this.nums = nums;
            this.flags = 0;
        }

        public TroopStack(String troopId, int nums, int flags) {
            this.troopId = troopId;
            this.nums = nums;
            this.flags = flags;
        }
    }
}
