package cn.yjq;


import org.junit.Test;

public class Main {

    /**
     * @Test 不支持多线程
     *       主线程执行完了不会等待子线程
     *       可以让主线程睡眠
     */
    @Test
    public void 集成单元测试() {
        System.out.println("集成单元测试");
    }
}
