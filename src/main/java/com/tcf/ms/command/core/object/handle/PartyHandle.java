package com.tcf.ms.command.core.object.handle;

import com.tcf.ms.command.core.Conditable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.command.ScriptSpan;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.operation.*;

public class PartyHandle {

    private StringVariable variable;

    private ScriptSpan scriptSpan;

    public PartyHandle(StringVariable variable,ScriptSpan scriptSpan) {
        this.variable = variable;
        this.scriptSpan = scriptSpan;
    }

    public PartyHandle(Party party,ScriptSpan scriptSpan) {
        this(party.getVar(),scriptSpan);
    }

    /**
     * 英雄是否能够加入本队伍
     * @return
     */
    public Conditable heroCanJoin(){
        return new HeroCanJoin(this.variable);
    }

    /**
     * 英雄是否能够作为俘虏加入本队伍
     * @return
     */
    public Conditable heroCanJoinAsPrisoner(){
        return new HeroCanJoinAsPrisoner(this.variable);
    }

    /**
     * 当前部队是否能够加入指定部队
     * @param party 指定部队
     * @param isPrisoner 以何种方式加入，true:俘虏 false:队友
     * @return
     */
    public Conditable partyCanJoinParty(Party party,boolean isPrisoner){
        return new PartyCanJoinParty(this.variable,party.getVar(), Variable.number(isPrisoner ? 1 : 0));
    }

    /**
     * 当前部队是否能够以友军的方式加入指定部队
     * @param party 指定部队
     * @return
     */
    public Conditable partyCanJoinParty(Party party){
        return partyCanJoinParty(party, false);
    }

    /**
     * 当前部队是否驻扎在指定城中
     * @param town
     * @return
     */
    public Conditable partyIsInTown(Party town){
        return new PartyIsInTown(this.variable,town.getVar());
    }

    /**
     * 当前部队是否驻扎在任何城中
     * @return
     */
    public Conditable partyIsInAnyTown(){
        return new PartyIsInAnyTown(this.variable);
    }

    /**
     * 当前部队是否没有被打败，也就是存在于游戏世界中
     * @return
     */
    public Conditable party_is_active(){
        return new PartyIsActive(this.variable);
    }
}
