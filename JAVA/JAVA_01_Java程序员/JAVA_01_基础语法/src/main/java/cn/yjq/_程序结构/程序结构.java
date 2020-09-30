package cn.yjq._程序结构;

import org.junit.Test;

public class 程序结构 {

    /**
     * 顺序结构不能使用 break 和 continue
     */
    @Test
    public void 顺序结构() {

    }

    /**
     * 分支结构只能使用 break 不能使用 continue
     */
    @Test
    public void 分支结构() {
        //普通判断
        if (true) {

        }

        //普通分支
        if (true) {

        } else {

        }

        //多分支
        if (true) {

        } else if (true) {

        } else {

        }

        //switch语句
        int index = 2;
        switch (index) {
            case 1: {
                System.out.println("case 1");
                break;
            }
            case 2: {
                System.out.println("case 2");
                break;
            }
            case 3: {
                System.out.println("case 3");
                break;
            }
            default: {
                System.out.println("default");
            }
        }
    }

    /**
     * 循环结构 break 和 continue 都能使用
     */
    @Test
    public void 循环结构() {

        //while 循环
        while(true) {
            break;

        }

        //do...while 循环
        do {
            break;
        } while(true);

        //for 循环
        for (;;) {
            break;
        }
    }
}
