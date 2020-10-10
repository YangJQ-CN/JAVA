package cn.yjq._包装类知识;

import org.junit.Test;

/**
 * @ClassName _包装类知识
 * @Date 2020/10/9 10:04
 * @Author YangJQ
 * @Description TODO
 **/
public class _包装类知识 {

    /**
     * 基本类型(int,long)
     * 优点
     *      a.用于计算是效率高(effective java书上讲过的)
     *      b.不会由于常量池引起比较大小错误(例如java integer对象判断两个数字是否相等)
     * 缺点
     *      1.当数据库中查询出结果之后封装结果集时如果返回的值时null时,
     *        如果直接赋值给这个基本类型的字段时,会在运行时报出异常,
     *        不能将null赋给一个基本类型,而用Integer就不存在这样都的情况
     *        这个情况好像没有合适的避免办法.当没有默认值的情况下
     *      2.当用spring的表单对象时如果页面传来的值是只有字段没有值是如果表单对象中有基本类型的值时会抛出异常.(可能存在,以前遇到过,记不清了)
     *
     * 包装类型(Integer,Long)
     * 优点
     *      1.可以存放null,从数据库中查出值时可能会有null
     *      2.表示一个值(不用于计算,只用于保存值时和int类型一样);
     * 缺点
     *      1.不能用于两个Integer对象双等判断两个对象的值相等,会出现错误的,
     *        java中Integer,String判断相等与integer的比较大小不适合频繁(intger.maxvalue次左右)的用于计算,
     *        这个缺陷一般项目都遇不到的(猜测)规避确定的方法:要用双等判断两个对象的值是否相等时,要调用intValue方法
     *
     *  ...
     *
     */
    @Test
    public void _包装类 () {

    }
}
