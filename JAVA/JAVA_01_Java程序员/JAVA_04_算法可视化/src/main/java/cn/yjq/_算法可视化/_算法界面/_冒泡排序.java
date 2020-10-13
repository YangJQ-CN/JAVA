package cn.yjq._算法可视化._算法界面;

import cn.yjq._算法可视化._算法界面._通用组件._数字矩形;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class _冒泡排序 extends JPanel {

    private static final String[] __排序代码 = {
            "public void bubbleSort(int[] data) {",
            "  for (int i = 0; i < data.length - 1; i++) {",
            "    for (int j = 0; j < data.length - i - 1; j++) {",
            "      if (data[j] > data[j + 1]) {",
            "        int temp = data[j + 1];",
            "        data[j + 1] = data[j];",
            "        data[j] = temp;",
            "      }",
            "    }",
            "  }",
            "}"
    };

    private JList<String> _排序代码 = new JList<String>(__排序代码);

    /**
     * 初始化10个数据
     */
    private java.util.List<_数字矩形> _矩形数组 = initialNumberRectangles(50);

    private JLabel _数据量标题 = new JLabel("数据量：");
    private JTextField _数据量输入框 = new JTextField(5);
    private JButton _确定数据量按钮 = new JButton("确定");
    private JButton _开始按钮 = new JButton("开始");
    private JButton _暂停按钮 = new JButton("暂停");
    private JButton _继续按钮 = new JButton("继续");
    private JButton _加速按钮 = new JButton("加速");
    private JButton _减速按钮 = new JButton("减速");
    private JButton _下一步按钮 = new JButton("下一步");

    public _代码步骤控制器 _排序步骤控制器;
    private int _速度 = 100;
    public Timer _排序触发器;

    /**
     * 判断排序是否已经结束
     */
    private boolean _排序完成 = false;


    public _冒泡排序() {

        JPanel _操作面板 = new JPanel();
        _操作面板.setLayout(new FlowLayout(FlowLayout.LEFT));
        _操作面板.add(_数据量标题);
        _数据量输入框.setText("50");
        _操作面板.add(_数据量输入框);
        _操作面板.add(_确定数据量按钮);
        _操作面板.add(_开始按钮);
        _操作面板.add(_暂停按钮);
        _操作面板.add(_继续按钮);
        _操作面板.add(_加速按钮);
        _操作面板.add(_减速按钮);
        _操作面板.add(_下一步按钮);

        this.setLayout(new BorderLayout());
        this.add(_操作面板, BorderLayout.NORTH);

        _排序步骤控制器 = new _代码步骤控制器();
        _排序触发器 = new Timer(_速度, _排序步骤控制器);
        _排序代码.setSelectedIndex(1);
        JScrollPane scrollPane1 = new JScrollPane(_排序代码);
        this.add(scrollPane1, BorderLayout.EAST);

        _确定数据量按钮.addActionListener(new _数据量确认按钮监听器());
        _开始按钮.addActionListener(new _开始按钮监听器());
        _暂停按钮.addActionListener(new _暂停按钮监听器());
        _继续按钮.addActionListener(new _继续按钮监听器());
        _加速按钮.addActionListener(new _速度调节监听器());
        _减速按钮.addActionListener(new _速度调节监听器());
        _下一步按钮.addActionListener(new _代码步骤控制器());

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        _画矩形(g2);
    }

    private void _画矩形(Graphics2D g2) {
        for (_数字矩形 rectangle : _矩形数组) {
            rectangle.draw(g2);
        }
    }

    int _外循环 = 0;
    int _内循环 = 0;
    int _当前步骤 = 1;

    private class _代码步骤控制器 implements ActionListener, Serializable {

        public void actionPerformed(ActionEvent event) {
            if (_排序完成) {
                return;
            }
            int _数据量 =  Integer.valueOf(_数据量输入框.getText());
            switch (_当前步骤) {
                case 1:
                    if (_外循环 < _数据量) {
                        _内循环 = 0;
                        _排序代码.setSelectedIndex(_当前步骤++);
                    } else {
                        _当前步骤 = 10;
                    }
                    break;
                case 2:
                    if (_内循环 < _数据量 - _外循环 - 1) {
                        _矩形数组.get(_内循环).setColor(Color.RED);
                        _矩形数组.get(_内循环 + 1).setColor(Color.BLUE);
                        _排序代码.setSelectedIndex(_当前步骤++);
                    } else {
                        _外循环++;
                        _当前步骤 = 1;
                    }
                    break;
                case 3:
                    if (_矩形数组.get(_内循环).getValue() > _矩形数组.get(
                            _内循环 + 1).getValue()) {
                        _排序代码.setSelectedIndex(_当前步骤++);
                    } else {
                        _矩形数组.get(_内循环 + 1).setColor(Color.BLACK);
                        _矩形数组.get(_内循环).setColor(Color.BLACK);
                        _内循环++;
                        _当前步骤 = 2;
                    }
                    break;
                case 4:
                    _排序代码.setSelectedIndex(_当前步骤++);
                    break;
                case 5:
                    _排序代码.setSelectedIndex(_当前步骤++);
                    break;
                case 6:
                    _排序代码.setSelectedIndex(_当前步骤);
                    int tempValue1 = _矩形数组.get(_内循环).getValue();
                    int tempValue2 = _矩形数组.get(_内循环 + 1).getValue();
                    _矩形数组.get(_内循环 + 1).setValue(tempValue1);
                    _矩形数组.get(_内循环).setValue(tempValue2);
                    _矩形数组.get(_内循环 + 1).setColor(Color.BLACK);
                    _矩形数组.get(_内循环).setColor(Color.BLACK);
                    _当前步骤 = 2;
                    _内循环++;
                    break;
                case 10:
                    if (_当前步骤 == _数据量) {
                        _排序完成 = true;
                        _排序代码.setSelectedIndex(_当前步骤);
                    }
                    break;
                default:
                    break;
            }

            repaint();

        }
    }

    private java.util.List<_数字矩形> initialNumberRectangles(Integer size) {
        java.util.List<_数字矩形> list = new ArrayList<_数字矩形>();
        Random random = new Random();
        for (Integer index = 1; index <= size; index++) {
            list.add(new _数字矩形(index, 575.0F / size , random.nextInt(470) + 1, Color.BLACK));
        }
        return list;
    }

    private Double _计算矩形宽度(Integer _整个宽度, Integer _数据量) {
        return (_整个宽度 * 1.0) / _数据量;
    }

    private class _开始按钮监听器 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (!_排序触发器.isRunning()) {
                _排序触发器.start();
            }
        }
    }

    private class _暂停按钮监听器 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (_排序触发器.isRunning()) {
                _排序触发器.stop();
            }
        }
    }

    private class _继续按钮监听器 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!_排序触发器.isRunning()) {
                _排序触发器.restart();
            }
        }
    }

    private class _数据量确认按钮监听器 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int _数据量 = 10;
            Pattern pattern = Pattern.compile("[0-9]*");
            if (pattern.matcher(_数据量输入框.getText()).matches() && !_数据量输入框.getText().equals("")) {
                _数据量 = Integer.valueOf(_数据量输入框.getText());
            } else {
                _数据量 = 50;
            }
            _矩形数组 = initialNumberRectangles(Integer.valueOf(_数据量));
            repaint();
        }
    }

    private class _速度调节监听器 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            switch (e.getActionCommand()) {
                case "加速":
                    if (_速度 > 10) {
                        _速度 -= 10;
                        _排序触发器.setDelay(_速度);
                    }
                    break;
                case "减速":
                    if (_速度 < 2000) {
                        _速度 += 10;
                        _排序触发器.setDelay(_速度);
                    }
                    break;
                default: System.out.println(e.getActionCommand());
            }
        }
    }
}
