package cn.yjq._算法可视化._算法界面._冒泡排序借鉴;

import javax.swing.JFrame;

public class BubbleSortApplication {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BubbleSortVisualizationFrame frame = new BubbleSortVisualizationFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}