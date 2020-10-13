package cn.yjq._反射;

import org.junit.Test;
import static java.lang.System.out;
/**
 * @ClassName _反射知识
 * @Date 2020/10/9 9:28
 * @Author YangJQ
 * @Description
 *      当我们用到 new一个对象 的时候，JVM会产生一个class对象来描述这个类。每个类只会产生一个class对象
 *      反射就是在 没有new时得到class对象。用class对象来动态的创建和操作实际的类对象。
 *
 *      获取class对象的方法：
 *
 **/
public class _反射知识 {

    public static void main(String[] args) {
        try {
            Class _类的class对象_forName = Class.forName("cn.yjq._反射._类");
        } catch (ClassNotFoundException e) {
            out.println("没有找到此类");
        }
    }

    @Test
    public void _反射() {

        //通过对象获取class对象
        Class _类的class对象_getClass = new _类().getClass();
        //通过静态变量获取class
        Class _类的class对象_静态class = _类.class;
        //通过静态方法获取
        try {
            Class _类的class对象_forName = Class.forName("cn.yjq._反射._类");
        } catch (ClassNotFoundException e) {
            out.println("没有找到此类");
        }
    }
}
