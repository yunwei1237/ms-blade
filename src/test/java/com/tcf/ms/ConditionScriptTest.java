package com.tcf.ms;

import com.tcf.ms.command.core.command.ConditableGroup;
import com.tcf.ms.command.core.command.ConditionScript;
import org.junit.Test;

public class ConditionScriptTest {


    @Test
    public void test(){

        //不推荐使用
        final ConditableGroup[] conditableGroup = {null};
        new ConditableGroup(){{
            conditableGroup[0] = orGroup(
                    andGroup(lt("age", 18), eq("sex", "male")),
                    orGroup(andGroup(gt("age", 80), eq("sex", "female")), eq("name", "troopName"))
            );
        }};
        System.out.println(new ConditionScript() {{
            group(() -> conditableGroup[0]);
        }}.toScriptString());
    }



    @Test
    public void test2(){
        System.out.println(new ConditionScript() {{
            group(() -> new ConditableGroup(){{
                //开始构建复杂条件
                create(
                    //或者
                    orGroup(
                        andGroup(lt("age", 18), eq("sex", "male")),
                        orGroup(andGroup(gt("age", 80), eq("sex", "female")), eq("name", "troopName"))
                    )
                );
            }});
        }}.toScriptString());
    }
}
