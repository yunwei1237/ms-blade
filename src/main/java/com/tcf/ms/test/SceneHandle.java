package com.tcf.ms.test;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.operation.RemoveTroopFromSite;
import com.tcf.ms.command.core.operation.ScenePropGetInstance;
import com.tcf.ms.command.core.object.Troop;
import com.tcf.ms.command.core.operation.JumpToScene;
import com.tcf.ms.command.core.object.TableauMaterial;
import com.tcf.ms.command.core.operation.GetSceneBoundaries;
import com.tcf.ms.command.core.operation.ScenePropGetNumInstances;
import com.tcf.ms.command.core.object.handle.slot.SceneSlot;
import com.tcf.ms.command.core.operation.CurScenePropSetTableauMaterial;
import com.tcf.ms.command.core.base.var.Variable;
import com.tcf.ms.command.core.operation.AddTroopToSite;
import com.tcf.ms.command.core.operation.StoreCurrentScene;
import com.tcf.ms.command.Conditable;
import com.tcf.ms.command.core.object.SceneProp;
import com.tcf.ms.command.core.operation.ReplaceSceneProps;
import com.tcf.ms.command.core.operation.ModifyVisitorsAtSite;
import com.tcf.ms.command.core.operation.AddVisitorsToCurrentScene;
import com.tcf.ms.command.core.object.handle.slot.SlotOperation;
import com.tcf.ms.command.core.base.var.StringVariable;

public class SceneHandle {

    private StringVariable variable;

    public SceneHandle(StringVariable variable) {
        this.variable = variable;
    }

    public SlotOperation slot(){
        return new SceneSlot(this.variable);
    }

    /**
     *   (scene_prop_get_instance,<destination>, <scene_prop_id>, <instance_no>),
     * @return
     */
    public static Operation scenePropGetInstance(Variable destination,SceneProp sceneProp,Variable instanceNo){
        return new ScenePropGetInstance(destination,sceneProp.getVar(),instanceNo);
    }

    /**
     *   (get_scene_boundaries, <position_min>, <position_max>),
     * @return
     */
    public static Operation getSceneBoundaries(Variable positionMin,Variable positionMax){
        return new GetSceneBoundaries(positionMin,positionMax);
    }

    /**
     *   (cur_scene_prop_set_tableau_material, <tableau_material_id>, <instance_code>),  only call inside ti_on_init_scene_prop in module_scene_props
     * @return
     */
    public static Operation curScenePropSetTableauMaterial(TableauMaterial tableauMaterial,Variable instanceCode){
        return new CurScenePropSetTableauMaterial(tableauMaterial.getVar(),instanceCode);
    }

    /**
     *   (add_visitors_to_current_scene,<entry_no>,<troop_id>,<number_of_troops>),
     * @return
     */
    public static Operation addVisitorsToCurrentScene(Variable entryNo,Troop troop,Variable numberOfTroops){
        return new AddVisitorsToCurrentScene(entryNo,troop.getVar(),numberOfTroops);
    }

    /**
     *   (store_current_scene,<destination>),
     * @return
     */
    public static Operation storeCurrentScene(Variable destination){
        return new StoreCurrentScene(destination);
    }

    /**
     *   (scene_prop_get_num_instances,<destination>, <scene_prop_id>),
     * @return
     */
    public static Operation scenePropGetNumInstances(Variable destination,SceneProp sceneProp){
        return new ScenePropGetNumInstances(destination,sceneProp.getVar());
    }

    /**
     *   (replace_scene_props, <old_scene_prop_id>,<new_scene_prop_id>), ---------------------------  Mission Consequence types ---------------------------
     * @return
     */
    public static Operation replaceSceneProps(Variable oldScenePropId,Variable newScenePropId){
        return new ReplaceSceneProps(oldScenePropId,newScenePropId);
    }

    /**
     *   (remove_troop_from_site,<troop_id>,<scene_id>),
     * @return
     */
    public Operation removeTroopFromSite(Troop troop){
        return new RemoveTroopFromSite(troop.getVar(),this.variable);
    }

    /**
     *   (jump_to_scene,<scene_id>,<entry_no>),
     * @return
     */
    public Operation jumpToScene(Variable entryNo){
        return new JumpToScene(this.variable,entryNo);
    }

    /**
     *   (add_troop_to_site,<troop_id>,<scene_id>,<entry_no>),
     * @return
     */
    public Operation addTroopToSite(Troop troop,Variable entryNo){
        return new AddTroopToSite(troop.getVar(),this.variable,entryNo);
    }

    /**
     *   (modify_visitors_at_site,<scene_id>),
     * @return
     */
    public Operation modifyVisitorsAtSite(){
        return new ModifyVisitorsAtSite(this.variable);
    }


}