package cn.yjq._面向对象.Java_08_异常类;

/**
 * @ClassName _异常类
 * @Date 2020/9/29 9:20
 * @Author YangJQ
 * @Description
 *   error 和 exception 的区别，CheckedException，RuntimeException 的区别
 *   java.lang.Throwable是所有异常的根
 *
 *   java.lang.Error是错误信息
 *        当程序发生不可控的错误时，通常做法是通知用户并中止程序的执行。与异常不同的是Error及其子类的对象不应被抛出。
 *        Error是throwable的子类，代表编译时间和系统错误，用于指示合理的应用程序不应该试图捕获的严重问题。
 *        Error由Java虚拟机生成并抛出，包括动态链接失败，虚拟机错误等。程序对其不做处理。
 *
 *   java.lang.Exception是异常信息
 *        Checked异常
 *            1 当前方法知道如何处理该异常，则用try...catch块来处理该异常。
 *            2 当前方法不知道如何处理，则在定义该方法是声明抛出该异常。
 *
 *            Java.lang.ClassNotFoundException
 *            Java.lang.NoSuchMethodException
 *            java.io.IOException
 *        RuntimeException
 *            Java.lang.ArithmeticException
 *            Java.lang.ArrayStoreException
 *            Java.lang.ClassCastException
 *            Java.lang.IndexOutOfBoundsException
 *            Java.lang.NullPointerException
 **/
public class _异常类 {
}
