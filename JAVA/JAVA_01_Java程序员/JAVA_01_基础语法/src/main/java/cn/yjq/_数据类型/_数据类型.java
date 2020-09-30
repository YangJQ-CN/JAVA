package cn.yjq._数据类型;


import cn.yjq.随机工具._随机数;
import org.junit.Test;

public class _数据类型 {

    @Test
    void 基本数据类型() {

        /**
         * byte为例 一字节  初始值：0
         * 值        127            -127             0                        -128
         * 源码      01111111       11111111         00000000（10000000）      无
         * 反码      01111111       10000000         00000000（11111111）      无
         * 补码      01111111       10000001         00000000                 10000000 [（-127） + （-1） = 10000001 + 11111111 = 10000000]
         * 补码零唯一，运算符合方便
         */
        byte byte_var = (byte) _随机数._获取指定范围的int随机数(-128, 127);

        /**
         * short 二字节 初始值：0
         */
        short short_var = (short) _随机数._获取指定范围的int随机数(-32768, 32767);
        /**
         * int 四字节 初始值：0
         */
        int int_var = _随机数._获取指定范围的int随机数(-2147483648, 2147483647);
        /**
         * long 八字节 初始值：0l
         */
        long long_var;
        /**
         * float 四字节 初始值：0f
         */
        float float_var;
        /**
         * double 八字节 初始值：0d
         */
        double double_var;
        /**
         * boolean 一字节 初始值：false
         */
        boolean boolean_var;
        /**
         * char 二字节 初始值： \u0000
         */
        char char_var;

    }

    /**
     * String
     * （public final class String）因为有final修饰，不能重写
     */
    @Test
    void 字符串类型() {

        /**
         * 常量池中只有一份str
         */
        String str1 = "str";
        String str2 = "str";
        /**
         * 堆区创建一个str对象
         */
        String str3 = new String("str");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));

    }

    @Test
    public void 数组类型() {

        int[] 数组1 = new int[10];
        int[] 数组2 = {1,2,3,4,5,6,7,8,9,10};
        int[] 数组3 = new int[]{1,2,3,4,5,6,7,8,9,10};

    }

}
