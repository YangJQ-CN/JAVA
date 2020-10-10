package cn.yjq._多线程;


import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

/**
 * @ClassName _线程
 * @Date 2020/10/10 14:15
 * @Author YangJQ
 * @Description
 *
 *      继承Thread
 **/
public class _线程 {

    public static void main(String[] args) {
        //new一个实现callable接口的对象
        NumThread numThread = new NumThread();

        //通过futureTask对象的get方法来接收futureTask的值
        FutureTask futureTask = new FutureTask(numThread);

        Thread t1 = new Thread(futureTask);
        t1.setName("线程1");
        t1.start();

        try {
            //get返回值即为FutureTask构造器参数callable实现类重写的call的返回值
            Object sum = futureTask.get();
            System.out.println(Thread.currentThread().getName()+":"+sum);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

/**
 * 继承 Thread 实现多线程
 */
class _窗口继承Thread extends Thread {

    private static Integer _票的数量 = 100;

    @Override
    public void run() {
        while (true) {
            if (_票的数量 > 0) {
                out.println(getName()+"当前售出第 " + _票的数量 + " 张票");
                _票的数量--;
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }

        }
    }
}

/**
 * 实现Runnable接口
 */
class _窗口实现Runnable implements Runnable {
    private static Integer _票的数量 = 100;

    @Override
    public void run() {
        while (true) {
            if (_票的数量 > 0) {
                out.println(Thread.currentThread().getName()+"当前售出第 " + _票的数量 + " 张票");
                _票的数量--;
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }

        }
    }
}

//实现callable接口的call方法
class NumThread implements Callable {

    private int sum=0;//

    //可以抛出异常
    @Override
    public Object call() throws Exception {
        for(int i = 0;i<=100;i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                sum += i;
            }
        }
        return sum;
    }
}
