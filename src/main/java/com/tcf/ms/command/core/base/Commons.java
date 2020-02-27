package com.tcf.ms.command.core.base;

public class Commons {
    public enum Side{
        player(0,"player","玩家"),
        enemy(1,"enemy","敌人")
        ;
        private int value;
        private String name;
        private String desc;

        Side(int value, String name, String desc) {
            this.value = value;
            this.name = name;
            this.desc = desc;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }
    }

    /**
     * 升级兵种时选项
     */
    public enum UpgradePath{
        random(0,"random","玩家"),
        first(1,"first","第一个"),
        second(2,"second","第二个")
        ;
        private int value;
        private String name;
        private String desc;

        UpgradePath(int value, String name, String desc) {
            this.value = value;
            this.name = name;
            this.desc = desc;
        }

        public int getValue() {
            return value;
        }

        public String getName() {
            return name;
        }

        public String getDesc() {
            return desc;
        }
    }
}
