package cn.yjq._算法可视化._算法界面._冒泡排序借鉴;

import cn.yjq._算法可视化._算法界面._通用组件._数字矩形;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

public class BubbleSortPanel extends JPanel {

	private static final long serialVersionUID = -9149581857139587792L;

	private static final String[] BUBBLE_SOURCE_CODE = {
			"public void bubbleSort(int[] data) {       ",
			"  for (int i = 0; i < data.length - 1; i++) {",
			"    for (int j = 0; j < data.length - i - 1; j++) {",
			"      if (data[j] > data[j + 1]) {          ",
			"        int temp = data[j + 1];         ",
			"        data[j + 1] = data[j];           ",
			"        data[j] = temp;             ",
			"      }                              ",
			"    }                                ",
			"  }                                  ",
			"}                                    " };

	private JList<String> codeList = new JList<String>(BUBBLE_SOURCE_CODE);

	/**
	 * 初始化10个数据
	 */
	private List<_数字矩形> numbers = initialNumberRectangles();

	
	public TimerAction timerAction;

	public Timer timer;

	public BubbleSortVisualizationFrame frame;

	public BubbleSortPanel(BubbleSortVisualizationFrame frame) {

		timerAction = new TimerAction();
		timer = new Timer(1000, timerAction);

		codeList.setSelectedIndex(1);
		JScrollPane scrollPane1 = new JScrollPane(codeList);
		this.setLayout(new BorderLayout());
		this.add(scrollPane1, BorderLayout.EAST);

		this.frame = frame;
	}

	/**
	 * 判断排序是否已经结束
	 */
	private boolean completed = false;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		drawNumberRectangles(g2);
	}

	private void drawNumberRectangles(Graphics2D g2) {
		for (_数字矩形 rectangle : numbers) {
			rectangle.draw(g2);
		}
	}

	int outerLoop = 0;
	int innerLoop = 0;
	int selectedIndex = 1;

	private class TimerAction implements ActionListener, Serializable {

		private static final long serialVersionUID = -8671813189049345697L;

		public void actionPerformed(ActionEvent event) {
			if (completed) {
				return;
			}

			switch (selectedIndex) {
			case 1:
				if (outerLoop < 10) {
					innerLoop = 0;
					codeList.setSelectedIndex(selectedIndex++);
				} else {
					selectedIndex = 10;
				}
				break;
			case 2:
				if (innerLoop < 10 - outerLoop - 1) {
					numbers.get(innerLoop).setColor(Color.RED);
					numbers.get(innerLoop + 1).setColor(Color.BLUE);
					codeList.setSelectedIndex(selectedIndex++);
				} else {
					outerLoop++;
					selectedIndex = 1;
				}
				break;
			case 3:
				if (numbers.get(innerLoop).getValue() > numbers.get(
						innerLoop + 1).getValue()) {
					codeList.setSelectedIndex(selectedIndex++);
				} else {
					numbers.get(innerLoop + 1).setColor(Color.GREEN);
					numbers.get(innerLoop).setColor(Color.GREEN);
					innerLoop++;
					selectedIndex = 2;
				}
				break;
			case 4:
				codeList.setSelectedIndex(selectedIndex++);
				break;
			case 5:
				codeList.setSelectedIndex(selectedIndex++);
				break;

			case 6:
				codeList.setSelectedIndex(selectedIndex);
				int tempValue1 = numbers.get(innerLoop).getValue();
				int tempValue2 = numbers.get(innerLoop + 1).getValue();
				numbers.get(innerLoop + 1).setValue(tempValue1);
				numbers.get(innerLoop).setValue(tempValue2);
				numbers.get(innerLoop + 1).setColor(Color.GREEN);
				numbers.get(innerLoop).setColor(Color.GREEN);
				selectedIndex = 2;
				innerLoop++;
				break;

			case 10:
				if (selectedIndex == 10) {
					completed = true;
					codeList.setSelectedIndex(selectedIndex);
				}
				break;
			default:
				break;
			}

			repaint();

		}
	}

	private List<_数字矩形> initialNumberRectangles() {
		List<_数字矩形> list = new ArrayList<_数字矩形>();
		/**
		 * 随机产生10个数组
		 */
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			list.add(new _数字矩形(i, 1, random.nextInt(15) + 1,
					Color.GREEN));
		}
		return list;
	}

}