package com.tcf.ms;

import com.tcf.ms.command.core.base.Position;
import com.tcf.ms.command.core.command.Script;
import com.tcf.ms.command.core.object.*;
import org.junit.Test;

public class CommandTest {

//    @Test
//    public void testGe(){
//        System.out.println(new Ge(new NumberVariable(18),new NumberVariable(22)).toScriptString());
//        System.out.println(new Ge(new LocalVariable("name"),new NumberVariable(22)).toScriptString());
//        System.out.println(new Ge(new LocalVariable("name"),new GlobalVariable("local")).toScriptString());
//        System.out.println(new Ge(new LocalVariable("name"),new ConstantVariable("local")).toScriptString());
//    }
//
//    @Test
//    public void testTryForRange(){
//        System.out.println(new TryForRange(new NumberVariable(18),new NumberVariable(0),new NumberVariable(22)).toScriptString());
//        System.out.println(new TryForRange(new LocalVariable("name"),new NumberVariable(0),new NumberVariable(22)).toScriptString());
//        System.out.println(new TryForRange(new LocalVariable("name"),new NumberVariable(0),new GlobalVariable("local")).toScriptString());
//        System.out.println(new TryForRange(new LocalVariable("name"),new NumberVariable(0),new ConstantVariable("local")).toScriptString());
//    }


    @Test
    public void testScript(){
        System.out.println(new Script());
    }


    @Test
    public void testParty(){
        Party party = new Party();
        party.setPartyId("main_party");
        party.setPartyName("Main Party");
        party.setPartyflags(new PartyHeader.PartyFlag[]{PartyHeader.PartyFlag.pf_always_visible,PartyHeader.PartyFlag.pf_hide_defenders});
        party.setFaction(new Faction().setFactionId("swadian"));
        party.setPartyTemplateId("bbb");
        party.setPersonalities(new PartyHeader.Personality[]{PartyHeader.Personality.aggressiveness_0});
        party.setAiBehavior(new PartyHeader.AiBhvr[]{PartyHeader.AiBhvr.ai_bhvr_attack_party});
        party.setAiTarget(0);
        party.setLocation(new Position(10,18));
        party.setDegree(80);
        System.out.println(party.toScriptString());
    }


    //["swadian_recruit","Swadian Recruit","Swadian Recruits",tf_guarantee_armor,0,0,fac_neutral,
    //   [itm_scythe,itm_hatchet,itm_pickaxe,itm_club,itm_stones,itm_tab_shield_heater_a,itm_leather_cap,itm_felt_hat,itm_felt_hat,
    //    itm_shirt,itm_coarse_tunic,itm_leather_apron,itm_nomad_boots,itm_wrapping_boots],
    //   def_attrib|level(4),wp(60),knows_common,swadian_face_younger_1, swadian_face_middle_2],
    @Test
    public void testTroop(){
        Troop troop = new Troop();
        troop.setTroopId("swadian_recruit");
        troop.setTroopName("swadian_recruit");
        troop.setPluralTroopName("Swadian Recruits");
        troop.setFlags(new TroopHeader.TroopFlag[]{TroopHeader.TroopFlag.tf_guarantee_armor});
        troop.setFaction(new Faction().setFactionId("swadian"));
        troop.setInventory(new int[]{18,22,32});
        troop.setAttribute(Troop.Attribute.def_attrib().setLevel(4));
        troop.setProficiency(new Troop.Wp(60));
        troop.setSkill(Troop.Skill.knows_common());
        troop.setFaceCode1("face1");
        troop.setFaceCode2("face2");
        System.out.println(troop.toScriptString());
    }
}
