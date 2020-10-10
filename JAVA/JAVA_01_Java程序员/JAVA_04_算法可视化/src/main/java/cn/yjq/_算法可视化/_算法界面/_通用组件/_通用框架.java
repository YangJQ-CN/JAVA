package cn.yjq._算法可视化._算法界面._通用组件;

import cn.yjq._算法可视化._算法界面._冒泡排序;
import cn.yjq._算法可视化._算法界面._冒泡排序借鉴.BubbleSortPanel;
import cn.yjq._算法可视化._算法界面._冒泡排序借鉴.BubbleSortVisualizationFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _通用框架 extends JPanel {

    private Container contentPane;

    /**
     * 设置三个Menu Item，分别用于开始程序，调整运行的速度以及退出程序
     *
     */
    private JMenuItem startMI = new JMenuItem("Start");

    private JMenu speedMenu = new JMenu("Speed");

    private JMenuItem exitMI = new JMenuItem("Exit");

    /**
     * 设定5个速度级别
     */
    private JRadioButtonMenuItem speedMI1 = new JRadioButtonMenuItem("Speed1",
            true);

    private JRadioButtonMenuItem speedMI2 = new JRadioButtonMenuItem("Speed2",
            false);

    private JRadioButtonMenuItem speedMI3 = new JRadioButtonMenuItem("Speed3",
            false);

    private JRadioButtonMenuItem speedMI4 = new JRadioButtonMenuItem("Speed4",
            false);

    private JRadioButtonMenuItem speedMI5 = new JRadioButtonMenuItem("Speed5",
            false);

    public int speedFlag = 1;

    /**
     * 冒泡排序可视化的Panel
     */
    private _冒泡排序 panel;

    public _通用框架(){


        JMenuBar menuBar = new JMenuBar();

        JMenu setMenu = new JMenu("Set");

        setMenu.setMnemonic('s');

        menuBar.add(setMenu);

        setMenu.add(startMI);
        setMenu.addSeparator();

        setMenu.addSeparator();
        setMenu.add(speedMenu);
        setMenu.addSeparator();
        setMenu.add(exitMI);

        ButtonGroup group = new ButtonGroup();
        group.add(speedMI1);
        group.add(speedMI2);
        group.add(speedMI3);
        group.add(speedMI4);
        group.add(speedMI5);

        speedMenu.add(speedMI1);
        speedMenu.add(speedMI2);
        speedMenu.add(speedMI3);
        speedMenu.add(speedMI4);
        speedMenu.add(speedMI5);

//        startMI.addActionListener(new BubbleSortVisualizationFrame.StartAction());
//        speedMI1.addActionListener(new BubbleSortVisualizationFrame.SpeedAction());
//        speedMI2.addActionListener(new BubbleSortVisualizationFrame.SpeedAction());
//        speedMI3.addActionListener(new BubbleSortVisualizationFrame.SpeedAction());
//        speedMI4.addActionListener(new BubbleSortVisualizationFrame.SpeedAction());
//        speedMI5.addActionListener(new BubbleSortVisualizationFrame.SpeedAction());
//        exitMI.addActionListener(new BubbleSortVisualizationFrame.ExitAction());

        this.add(menuBar, BorderLayout.NORTH);
        startMI.setEnabled(true);
    }

    private class StartAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            startMI.setEnabled(false);
//            panel.timer.start();
        }
    }

    private class ExitAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    private class SpeedAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object speed = event.getSource();
            if (speed == speedMI1) {
                speedFlag = 1;
            } else if (speed == speedMI2) {
                speedFlag = 2;
            } else if (speed == speedMI3) {
                speedFlag = 3;
            } else if (speed == speedMI4) {
                speedFlag = 4;
            } else if (speed == speedMI5) {
                speedFlag = 5;
            }

//            panel.timer.setDelay(1000 - 200 * (speedFlag - 1));
        }
    }
}
