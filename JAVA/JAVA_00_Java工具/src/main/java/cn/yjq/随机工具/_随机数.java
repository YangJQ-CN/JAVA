package cn.yjq.随机工具;

import java.util.Random;

public class _随机数 {

    public static int _获取指定范围的int随机数(int startNum, int endNum) {
        return new Random().nextInt(endNum) + startNum;
    }
}
