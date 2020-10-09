package cn.yjq._算法可视化._算法界面._通用组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _通用框架 extends JPanel {

    private Container contentPane;
    /**
     * 设置三个Menu Item，分别用于开始程序，调整运行的速度以及退出程序
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
