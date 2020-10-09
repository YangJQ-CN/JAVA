package cn.yjq._泛型;

import org.junit.Test;

/**
 * @ClassName _泛型知识
 * @Date 2020/10/9 9:36
 * @Author YangJQ
 * @Descriptio
 *
 *  泛型用于解决因为不同的数据类型而二重复的代码。
 *  一些常用的泛型类型变量：
 *      E：元素（Element），多用于java集合框架
 *      K：关键字（Key）
 *      N：数字（Number）
 *      T：类型（Type）
 *      V：值（Value）
 *  泛型的使用：
 *      类上
 *      接口上
 *      方法上
 *
 *  限定泛型变量
 *      上界
 *      下界
 *      没有限定
 *
 **/
public class _泛型知识 {

    @Test
    public void _泛型实例() {
        /**
         * 不用泛型要写三个方法
         */
        _int相加(1, 2);
        _float相加(1f, 2f);
        _double相加(1d, 2d);

        /**
         * 应用泛型只需要写一个方法
         */
        _应用泛型相加(Integer.valueOf(1), Integer.valueOf(2));
        _应用泛型相加(Float.valueOf(1), Float.valueOf(2));
        _应用泛型相加(Double.valueOf(1), Double.valueOf(2));
    }

    private static int _int相加(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static float _float相加(float a, float b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static double _double相加(double a, double b) {
        System.out.println(a + "+" + b + "=" + (a + b));
        return a + b;
    }

    private static <T extends Number> double _应用泛型相加(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    @Test
    public void _测试方法泛型() {
    }


    private <T> void _测试方法上的泛型(T t){

        System.out.println(t);

    }



}
