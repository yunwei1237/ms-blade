package com.tcf.ms.command.core.base;

import lombok.Data;

/**
 * 坐标
 */
@Data
public class Position {
    private double x;
    private double y;
    private double z;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
