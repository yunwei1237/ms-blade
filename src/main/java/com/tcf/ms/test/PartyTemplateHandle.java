package com.tcf.ms.test;

import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.StoreRandomPartyOfTemplate;
import com.tcf.ms.command.core.operation.StoreNumPartiesDestroyed;
import com.tcf.ms.command.core.operation.SpawnAroundParty;
import com.tcf.ms.command.Operation;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.operation.StoreNumPartiesOfTemplate;
import com.tcf.ms.command.core.operation.StoreNumPartiesCreated;
import com.tcf.ms.command.core.object.handle.slot.PartyTemplateSlot;
import com.tcf.ms.command.core.object.Party;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class PartyTemplateHandle {

    private StringVariable variable;

    public PartyTemplateHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new PartyTemplateSlot(this.variable);
    }

    /**
     *   ID of spawned party is put into reg(0)  (spawn_around_party,<party_id>,<party_template_id>),
     * @return
     */
    public Operation spawnAroundParty(Party party){
        return new SpawnAroundParty(party.getVar(),this.variable);
    }

    /**
     *   (store_num_parties_created,<destination>,<party_template_id>),
     * @return
     */
    public Operation storeNumPartiesCreated(Variable destination){
        return new StoreNumPartiesCreated(destination,this.variable);
    }

    /**
     *   (store_num_parties_of_template,<destination>,<party_template_id>),
     * @return
     */
    public Operation storeNumPartiesOfTemplate(Variable destination){
        return new StoreNumPartiesOfTemplate(destination,this.variable);
    }

    /**
     *   fails if no party exists with tempolate_id (expensive)  (store_random_party_of_template,<destination>,<party_template_id>),
     * @return
     */
    public Operation storeRandomPartyOfTemplate(Variable destination){
        return new StoreRandomPartyOfTemplate(destination,this.variable);
    }

    /**
     *   (store_num_parties_destroyed,<destination>,<party_template_id>),
     * @return
     */
    public Operation storeNumPartiesDestroyed(Variable destination){
        return new StoreNumPartiesDestroyed(destination,this.variable);
    }


}