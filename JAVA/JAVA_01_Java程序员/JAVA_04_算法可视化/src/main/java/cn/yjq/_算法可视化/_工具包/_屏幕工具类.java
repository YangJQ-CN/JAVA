package cn.yjq._算法可视化._工具包;

import java.awt.*;

public class _屏幕工具类 {

    public static int _获得屏幕宽度() {
        return Toolkit.getDefaultToolkit().getScreenSize().width;
    }

    public static int _获得屏幕高度() {
        return Toolkit.getDefaultToolkit().getScreenSize().height;
    }
}
