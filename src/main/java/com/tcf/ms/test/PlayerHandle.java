package com.tcf.ms.test;

import com.tcf.ms.command.core.operation.SetPlayerTroop;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.RaceCompletedByPlayer;
import com.tcf.ms.command.core.operation.GetPlayerAgentOwnTroopKillCount;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.PartyIgnorePlayer;
import com.tcf.ms.command.core.operation.GetPlayerAgentNo;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.PlayerHasItem;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.object.Item;
import com.tcf.ms.command.core.object.PartyTemplate;
import com.tcf.ms.command.core.operation.StoreNumPartiesDestroyedByPlayer;
import com.tcf.ms.command.core.operation.MainPartyHasTroop;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.operation.GetPlayerAgentKillCount;
import com.tcf.ms.command.core.base.var.StringVariable;

public class PlayerHandle {

    private StringVariable variable;

    public PlayerHandle(StringVariable variable) {
        this.variable = variable;
    }

    /**
     *   (store_num_parties_destroyed_by_player,<destination>,<party_template_id>),
     * @return
     */
    public static Operation storeNumPartiesDestroyedByPlayer(Variable destination,PartyTemplate partyTemplate){
        return new StoreNumPartiesDestroyedByPlayer(destination,partyTemplate.getVar());
    }

    /**
     *   (party_ignore_player, <party_id>,<duration_in_hours>),  don't pursue player party for this duration
     * @return
     */
    public static Operation partyIgnorePlayer(Party party,Variable durationInHours){
        return new PartyIgnorePlayer(party.getVar(),durationInHours);
    }

    /**
     *   (race_completed_by_player),
     * @return
     */
    public static Operation raceCompletedByPlayer(){
        return new RaceCompletedByPlayer();
    }

    /**
     *   (set_player_troop,<troop_id>),
     * @return
     */
    public static Operation setPlayerTroop(Troop troop){
        return new SetPlayerTroop(troop.getVar());
    }

    /**
     *   (player_has_item,<item_id>),
     * @return
     */
    public static Operation playerHasItem(Item item){
        return new PlayerHasItem(item.getVar());
    }

    /**
     *   (get_player_agent_own_troop_kill_count,<destination>,[get_wounded]),  Set second value to non-zero to getGroup wounded count
     * @return
     */
    public static Operation getPlayerAgentOwnTroopKillCount(Variable destination,Variable getWounded){
        return new GetPlayerAgentOwnTroopKillCount(destination,getWounded);
    }

    /**
     *   (main_party_has_troop,<troop_id>),
     * @return
     */
    public static Operation mainPartyHasTroop(Troop troop){
        return new MainPartyHasTroop(troop.getVar());
    }

    /**
     *   (get_player_agent_no,<destination>),
     * @return
     */
    public static Operation getPlayerAgentNo(Variable destination){
        return new GetPlayerAgentNo(destination);
    }

    /**
     *   (get_player_agent_kill_count,<destination>,[get_wounded]),  Set second value to non-zero to getGroup wounded count. returns lifetime kill counts
     * @return
     */
    public static Operation getPlayerAgentKillCount(Variable destination,Variable getWounded){
        return new GetPlayerAgentKillCount(destination,getWounded);
    }


}