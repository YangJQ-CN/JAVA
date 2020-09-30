package cn.yjq._面向对象.Java_05_内部类;

/**
 * @ClassName _有内部类的类
 * @Date 2020/9/29 9:19
 * @Author YangJQ
 * @Description TODO
 **/
public class _有内部类的类 {

    private String 属性;
    private _内部类 内部类;

    private static String 静态属性;

    public _有内部类的类() {
        this.内部类 = new _内部类();
        this.属性 = "属性";
    }

    public void _打印内部类的参数() {
        System.out.println(内部类.内部类属性);
    }

    public void set内部类属性(String 内部类属性) {

        内部类.set内部类属性(内部类属性);

    }

    public class _内部类 {

        private String 内部类属性;

        private _内部类() {
            this.内部类属性 = "内部类属性";
        }

        private void set内部类属性(String 内部类属性) {
            this.内部类属性 = 内部类属性;
        }

    }
}
