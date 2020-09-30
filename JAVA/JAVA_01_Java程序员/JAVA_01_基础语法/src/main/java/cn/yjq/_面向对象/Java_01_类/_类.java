package cn.yjq._面向对象.Java_01_类;

import cn.yjq._面向对象.Java_01_类._测试._测试类_不同包;
import org.junit.Test;

/**
 * @ClassName _有内部类的类
 * @Date 2020/9/29 9:15
 * @Author YangJQ
 * @Description TODO
 **/
public class _类 {

    /**
     * OO 设计理念（面向对象设计）
     * 类中的数据成员和成员函数据具有的访问权限包括：public、protect、default、private（包访问权限）
     * 作用域		当前类	同一package	子孙类	其他package
     * public   	√    	√         	√       √
     * protected    √      	√           √       ×
     * default      √       √           ×       ×
     * private      √       ×           ×       ×
     *
     * public           所有类可见
     * protected      	本包和所有子类都可见（本包中的子类非子类均可访问，不同包中的子类可以访问，不是子类不能访问）
     * default          本包可见（即默认的形式）（本包中的子类非子类均可访问，不同包中的类及子类均不能访问）不写修饰符
     * private          本类可见
     */
    @Test
    public void 测试访问饰符 () {

        _测试类_不同包 测试类_不同包 = new _测试类_不同包("私有属性","受保护属性","默认属性","公开属性");

        //不同包只有公开属性可见
        System.out.println(测试类_不同包.公开属性);
        _测试类_同包 测试类_同包 = new _测试类_同包("私有属性","受保护属性","默认属性","公开属性");

        //同包可见 公开属性，受保护属性，默认属性；
        System.out.println(测试类_同包.公开属性);
        System.out.println(测试类_同包.受保护属性);
        System.out.println(测试类_同包.默认属性);

    }

    /**
     * final 修饰符可以修饰：属性，方法，类，局部变量（方法中的变量）
     *      属性: final 修饰的属性可在编译期，亦可以在运行期，初始化后不能改变。
     *      方法：final 修饰的方法表示该方法在子类中不能被重写。
     *      类：final 修饰的类不能被继承。
     *
     * 基本数据类型被修饰，值不能修改。
     * 对象被 final 修饰，只是引用不能改变，指向一个对象后就不能指向另一个对象，但是对象中的数据可以改变。
     * 数组同对象一样。
     */
    @Test
    public void 测试_final() {

    }

    /**
     * static 可以修饰：属性，方法，代码段，内部类（静态内部类 和 嵌套内部类）
     *      在类加载的时候初始化，每个对象只有一份
     */
    @Test
    public void 测试_static() {

    }


}
