package cn.yjq._面向对象.Java_01_类._测试;

import cn.yjq._面向对象.Java_01_类._测试类_同包;
import org.junit.Test;

/**
 * @ClassName _不同包_子类
 * @Date 2020/9/30 9:51
 * @Author YangJQ
 * @Description TODO
 **/
public class _不同包_子类 extends _测试类_同包 {

    public _不同包_子类(String 私有属性, String 受保护属性, String 默认属性, String 公开属性) {
        super(私有属性, 受保护属性, 默认属性, 公开属性);
    }

    @Override
    public String get私有属性() {
        return super.get私有属性();
    }

    @Override
    public void set私有属性(String 私有属性) {
        super.set私有属性(私有属性);
    }

    @Override
    public String get受保护属性() {
        return super.get受保护属性();
    }

    @Override
    public void set受保护属性(String 受保护属性) {
        super.set受保护属性(受保护属性);
    }

    @Override
    public String get默认属性() {
        return super.get默认属性();
    }

    @Override
    public void set默认属性(String 默认属性) {
        super.set默认属性(默认属性);
    }

    @Override
    public String get公开属性() {
        return super.get公开属性();
    }

    @Override
    public void set公开属性(String 公开属性) {
        super.set公开属性(公开属性);
    }

    @Test
    public void 测试访问修饰符() {
        this.set公开属性(super.公开属性);
        this.set受保护属性(super.受保护属性);
        //不同包子孙类不能访问默认属性
       // this.set默认属性(super.默认属性);
    }
}
