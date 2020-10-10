package cn.yjq._Java_8_特性;

import org.junit.Test;

/**
 * @ClassName _Lambda表达式
 * @Date 2020/10/9 10:30
 * @Author YangJQ
 * @Description
 *      Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
 *      Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
 *      使用 Lambda 表达式可以使代码变的更加简洁紧凑。
 **/
public class _Lambda表达式 {

    @Test
    public void _测试Lambda表达式() {
        _Lambda表达式 tester = new _Lambda表达式();

        // 类型声明
        MathOperation 加法Lambda表达式实现 = (int a, int b) -> a + b;
        MathOperation 加法匿名类实现 = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, 加法Lambda表达式实现));
        System.out.println("10 + 5 = " + tester.operate(10, 5, 加法匿名类实现));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }

    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
