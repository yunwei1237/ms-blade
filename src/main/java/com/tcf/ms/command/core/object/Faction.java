package com.tcf.ms.command.core.object;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.CanVariable;
import com.tcf.ms.command.core.base.var.StringVariable;
import com.tcf.ms.command.core.base.var.Variable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.stream.Collectors;

//####################################################################################################################
//#  Each faction record contains the following fields:
//#  1) Faction id: used for referencing factions in other files.
//#     The prefix fac_ is automatically added before each faction id.
//#  2) Faction name.
//#  3) Faction flags. See header_factions.py for a list of available flags
//#  4) Faction coherence. Relation between members of this faction.
//#  5) Relations. This is a list of relation records.
//#     Each relation record is a tuple that contains the following fields:
//#    5.1) Faction. Which other faction this relation is referring to
//#    5.2) Value: Relation value between the two factions.
//#         Values range between -1 and 1.
//#  6) Ranks
//#  7) Faction color (default is gray)
//####################################################################################################################
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Faction implements Operation, CanVariable {
    /**
     * 阵营id
     */
    private String factionId;
    /**
     * 阵营名称
     */
    private String factionName;
    /**
     * 阵营标识
     */
    private FactionHeader.FactionFlag[] flags;
    /**
     * 一致性,团结性，相互支援可能性
     * 取值为：0-1.0
     */
    private double coherence;
    /**
     * 国家之间关系
     */
    private FactionRelation[] relations;
    /**
     * 排行，暂时没有使用
     */
    private Rank[] ranks;
    /**
     * 阵营颜色
     */
    private String factionColor;

    public Faction(String factionId, String factionName, FactionHeader.FactionFlag[] flags, double coherence, FactionRelation[] relations) {
        this(factionId,factionName,flags,coherence,relations,null,"0");
    }
    public Faction(String factionId, String factionName, FactionHeader.FactionFlag[] flags, double coherence, FactionRelation[] relations, String factionColor) {
        this(factionId,factionName,flags,coherence,relations,null,factionColor);
    }

    public Faction(String factionId, String factionName, FactionHeader.FactionFlag[] flags, double coherence, FactionRelation[] relations, Rank[] ranks, String factionColor) {
        this.factionId = factionId;
        this.factionName = factionName;
        this.flags = flags;
        this.coherence = coherence;
        this.relations = relations;
        this.ranks = ranks;
        this.factionColor = factionColor;
    }

    @Override
    public String toScriptString() {
        return String.format("(\"%s\",\"%s\", %s, %s,[%s], [],%s),",this.factionId,this.factionName, FactionHeader.FactionFlag.getValue(this.flags),this.coherence,String.join(",", Arrays.stream(this.relations).map(relation->String.format("(\"%s\",%s)",relation.faction.factionId,relation.relation)).collect(Collectors.toList())),this.factionColor);
    }

    @Override
    public StringVariable getVar() {
        return Variable.constant(String.format("fac_%s",this.factionId));
    }

    @Data
    public static class FactionRelation{
        /**
         * 阵营
         */
        private Faction faction;
        /**
         * 关系
         *  -1 到 1之间
         */
        private double relation;

    }

    /**
     * 排行，暂时没有用
     */
    public static class Rank{

    }
}
