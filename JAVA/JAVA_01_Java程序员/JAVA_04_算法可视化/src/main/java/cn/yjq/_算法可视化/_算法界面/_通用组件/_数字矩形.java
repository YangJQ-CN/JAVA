package cn.yjq._算法可视化._算法界面._通用组件;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class _数字矩形 {

	private Integer index;

	private Float width;

	private int value;

	private Color color;

	public _数字矩形() {
	}

	public  _数字矩形(int index, float width, int value, Color color) {
		this.index = index;
		this.width = width;
		this.color = color;
		this.value = value;
	}

	public void draw(Graphics2D g2) {

		Float clientX =this.width / 5 + (index - 1) * this.width;
		int clientY = 545 -30 - this.value;
//		System.out.println(this.width + " : " + clientX);
        Rectangle2D.Double rect = new Rectangle2D.Double(clientX, clientY, this.width / 3 * 2, this.value);
		g2.setPaint(color);
		g2.fill(rect);
		g2.setPaint(Color.BLACK);
		g2.draw(rect);
		if (this.width > 20) {
            g2.drawString(String.valueOf(value / 3), clientX, clientY + this.value + 15);
        } else {
            g2.drawString("-", clientX, clientY + this.value + 15);
        }
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the x
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index
	 *            the x to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * @return the y
	 */
	public Float getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the y to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}