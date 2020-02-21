package com.tcf.ms.command.core.operations.presentation.create;

import com.tcf.ms.command.Operation;
import com.tcf.ms.command.core.base.var.Variable;

public class CreateImageButtonOverlay implements Operation {
    /**
     * 图片按钮组件
     */
    private Variable destination;
    /**
     * 模型id 没有点击时显示
     */
    private Variable meshId1;
    /**
     * 模型id 点击后显示
     */
    private Variable meshId2;

    public CreateImageButtonOverlay(Variable destination, Variable meshId1, Variable meshId2) {
        this.destination = destination;
        this.meshId1 = meshId1;
        this.meshId2 = meshId2;
    }

    @Override
    public String toScriptString() {
        return String.format("(create_image_button_overlay,%s,%s,%s),",destination,meshId1,meshId2);
    }
}
