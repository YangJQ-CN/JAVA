package cn.yjq._算法可视化._算法界面;

import javax.swing.*;
import java.awt.*;

public class _冒泡排序 extends Box {

    private JButton 开始按钮 = new JButton("开始");


    public _冒泡排序() {
        super(BoxLayout.Y_AXIS);

        JPanel 算法操作栏 = new JPanel();
        算法操作栏.setMaximumSize(new Dimension(WIDTH, 50));
        算法操作栏.add(this.开始按钮);

        this.add(算法操作栏);


    }
}
