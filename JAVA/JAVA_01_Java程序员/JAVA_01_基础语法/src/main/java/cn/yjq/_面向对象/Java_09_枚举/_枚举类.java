package cn.yjq._面向对象.Java_09_枚举;

/**
 * 每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的
 */
public enum _枚举类 {
    常量_1, 常量_2, 常量_3;

    public void _测试枚举() {
        _枚举类 枚举对象 = _枚举类.常量_1;

        switch (枚举对象) {
            case 常量_1:;
            case 常量_2:;
            case 常量_3:;
            default:;
        }
    }
}

