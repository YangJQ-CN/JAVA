package cn.yjq._面向对象.Java_07_匿名类;

import org.junit.Test;

/**
 * @ClassName _匿名类
 * @Date 2020/9/29 9:19
 * @Author YangJQ
 * @Description TODO
 **/
public class _匿名类 {

    _匿名类的父接口 匿名对象 = new _匿名类的父接口() {

        @Override
        public void _匿名类的方法() {
            System.out.println("匿名类的方法");
        }

    };

    @Test
    public void _测试匿名类() {
        匿名对象._匿名类的方法();
    }

}

interface _匿名类的父接口 {

    public void _匿名类的方法();
}
