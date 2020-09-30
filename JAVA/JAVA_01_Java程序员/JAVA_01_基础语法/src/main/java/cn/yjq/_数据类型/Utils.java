package cn.yjq._数据类型;

import java.util.Random;

public class Utils {

    public static int getRandomNum(int startNum, int endNum) {
        return new Random().nextInt(endNum) + startNum;
    }
}
