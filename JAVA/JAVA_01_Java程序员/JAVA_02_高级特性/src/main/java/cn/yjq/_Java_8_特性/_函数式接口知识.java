package cn.yjq._Java_8_特性;

import org.junit.Test;
import static java.lang.System.out;
/**
 * @ClassName _函数式接口知识
 * @Date 2020/10/9 10:31
 * @Author YangJQ
 * @Description
 *      函数式接口(Functional Interface)就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 *      函数式接口可以被隐式转换为 lambda 表达式。
 *      Lambda 表达式和方法引用（实际上也可认为是Lambda表达式）上。
 **/
public class _函数式接口知识 {

    @Test
    public void _测试函数式接口() {

        _函数式接口 函数式接口 = (参数1, 参数2) -> 参数1 + 参数2;

        函数式接口._非抽象方法(10,5);
    }

    @FunctionalInterface
    interface  _函数式接口 {
         int _抽象方法(int _参数1, int _参数2);

         default void _非抽象方法 (int _参数1, int _参数2) {
            System.out.println(_抽象方法(_参数1, _参数2));
         }
    }
}
