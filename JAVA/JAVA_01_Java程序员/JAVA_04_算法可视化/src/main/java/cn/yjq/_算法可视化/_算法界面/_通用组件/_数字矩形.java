package cn.yjq._算法可视化._算法界面._通用组件;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class _数字矩形 {

	private int x;

	private int y;

	private int value;

	private Color color;

	public _数字矩形() {
	}

	public _数字矩形(int x, int y, int value, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.value = value;

	}

	public void draw(Graphics2D g2) {
		int clientX = 30 + x * 30;
		int clientY = 20 + y * 10;
		Rectangle2D.Double rect = new Rectangle2D.Double(clientX, clientY, 20,
				value * 20);
		g2.setPaint(color);
		g2.fill(rect);
		g2.setPaint(Color.BLACK);
		g2.draw(rect);
		g2.drawString(String.valueOf(value), clientX, clientY - 10);
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
	public int getX() {
		return x;
	}

	/**
	 * @param x
	 *            the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y
	 *            the y to set
	 */
	public void setY(int y) {
		this.y = y;
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