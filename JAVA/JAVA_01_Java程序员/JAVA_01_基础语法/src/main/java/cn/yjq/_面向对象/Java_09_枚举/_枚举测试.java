package cn.yjq._面向对象.Java_09_枚举;

import org.junit.Test;

public class _枚举测试 {

    @Test
    public void _测试枚举() {
        _枚举类 枚举对象 = _枚举类.常量_1;

        switch (枚举对象) {
            case 常量_1: System.out.println(枚举对象);
            case 常量_2: System.out.println(枚举对象);
            case 常量_3: System.out.println(枚举对象);
            default:;
        }
    }
}
