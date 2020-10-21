package cn.yjq._测试;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static java.lang.System.out;
/**
 * @ClassName _测试
 * @Date 2020/10/12 11:26
 * @Author YangJQ
 * @Description TODO
 **/
public class _测试 {


    @Test
    public void _测试除法() {
        out.println(100.0 == 100.0 / 3 * 2 + 100.0 /3 * 1);
    }


    @Test
    public void _强转() {

//        A_子类2 a2 = new A_子类2();
//        A a = new A();
//        a = a2;
//        A_子类1 a1 = (A_子类1)a;

        A a = new A_子类1();

        A_子类1 a1 = (A_子类1)a;



    }
}

class A {

}

class A_子类1 extends A{

}

class A_子类2 extends A {

}
