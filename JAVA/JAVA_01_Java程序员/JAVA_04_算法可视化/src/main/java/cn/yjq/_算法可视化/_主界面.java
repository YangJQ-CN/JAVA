package cn.yjq._算法可视化;

import cn.yjq._算法可视化._工具包._屏幕工具类;
import cn.yjq._算法可视化._算法界面._冒泡排序;
import cn.yjq._算法可视化._算法界面._冒泡排序借鉴.BubbleSortVisualizationFrame;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class _主界面 {


    JFrame 主窗口 = new JFrame("算法可视化");
    private final int _距离上边 = _屏幕工具类._获得屏幕宽度()/8;
    private final int _距离左边 = _屏幕工具类._获得屏幕高度()/8;



    public void _初始化() {
        主窗口.setBounds(_距离上边, _距离左边 , _距离上边 * 6, _距离左边 * 6);
        主窗口.setResizable(false);


        //内容面板
        JSplitPane 内容面板 = new JSplitPane();

        内容面板.setContinuousLayout(true);
        内容面板.setDividerLocation(200);
        内容面板.setDividerSize(7);

        //设置左侧算法菜单
        DefaultMutableTreeNode 根目录 = new DefaultMutableTreeNode("算法");
        DefaultMutableTreeNode 冒泡排序 = new DefaultMutableTreeNode("冒泡排序");
        DefaultMutableTreeNode 选择排序 = new DefaultMutableTreeNode("选择排序");
        DefaultMutableTreeNode 插入排序 = new DefaultMutableTreeNode("插入排序");
        DefaultMutableTreeNode 快速排序 = new DefaultMutableTreeNode("快速排序");

        根目录.add(冒泡排序);
        根目录.add(选择排序);
        根目录.add(插入排序);
        根目录.add(快速排序);

        JTree 算法目录 = new JTree(根目录);
        内容面板.setLeftComponent(算法目录);

        JPanel 冒泡排序面板 = new JPanel();
        冒泡排序面板.add(new _冒泡排序());
        内容面板.setRightComponent(new _冒泡排序());

        主窗口.add(内容面板);
        主窗口.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        主窗口.setVisible(true);
    }

    public static void main(String[] args) {

        _主界面 主界面 = new _主界面();

        主界面._初始化();

    }


}
