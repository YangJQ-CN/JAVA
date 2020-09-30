package cn.yjq._面向对象.Java_01_类._测试;

/**
 * @ClassName _测试类_不同包
 * @Date 2020/9/30 9:25
 * @Author YangJQ
 * @Description TODO
 **/
public class _测试类_不同包 {

    private String 私有属性;
    protected String 受保护属性;
    String 默认属性;
    public String 公开属性;

    public _测试类_不同包(String 私有属性, String 受保护属性, String 默认属性, String 公开属性) {
        this.私有属性 = 私有属性;
        this.受保护属性 = 受保护属性;
        this.默认属性 = 默认属性;
        this.公开属性 = 公开属性;
    }

    public String get私有属性() {
        return 私有属性;
    }

    public void set私有属性(String 私有属性) {
        this.私有属性 = 私有属性;
    }

    public String get受保护属性() {
        return 受保护属性;
    }

    public void set受保护属性(String 受保护属性) {
        this.受保护属性 = 受保护属性;
    }

    public String get默认属性() {
        return 默认属性;
    }

    public void set默认属性(String 默认属性) {
        this.默认属性 = 默认属性;
    }

    public String get公开属性() {
        return 公开属性;
    }

    public void set公开属性(String 公开属性) {
        this.公开属性 = 公开属性;
    }
}
