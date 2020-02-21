package com.tcf.ms;

import com.tcf.ms.command.core.command.ConditableGroup;
import org.junit.Test;

public class ConditableGroupTest {

    @Test
    public void test(){
        System.out.println(new ConditableGroup() {{
            create(
                orGroup(
                        andGroup(lt("age",18),eq("sex","male")),
                        orGroup(andGroup(gt("age",80),eq("sex","female")),eq("name","troopName"))
                )
            );
        }}.getGroup().toScriptString());
    }
}
