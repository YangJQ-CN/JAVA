package cn.yjq._Java_8_特性;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName _方法引用
 * @Date 2020/10/9 10:30
 * @Author YangJQ
 * @Description TODO
 **/
public class _方法引用 {


    @Test
    public void _方法引用() {
        List<String> names = new ArrayList();

        names.add("滔博");
        names.add("京东");
        names.add("苏宁");
        names.add("老干爹");

        /**
         * 引用静态方法
         */
        names.forEach(System.out::println);

        /**
         * forEach 的参数是一个函数式接口，可以传入lambda表达式
         */
        names.forEach((_参数1) -> System.out.println(_参数1));
    }
}
