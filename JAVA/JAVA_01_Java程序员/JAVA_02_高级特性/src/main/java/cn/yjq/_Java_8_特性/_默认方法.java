package cn.yjq._Java_8_特性;

import org.junit.Test;

/**
 * @ClassName _默认方法
 * @Date 2020/10/9 10:31
 * @Author YangJQ
 * @Description TODO
 **/
public class _默认方法 {

    @Test
    public void _测试默认方法() {
        Vehicle vehicle = new Car();
        vehicle.print();
    }

    interface Vehicle {
        default void print(){
            System.out.println("我是一辆车!");
        }

        static void blowHorn(){
            System.out.println("按喇叭!!!");
        }
    }

    interface FourWheeler {
        default void print(){
            System.out.println("我是一辆四轮车!");
        }
    }

    class Car implements Vehicle, FourWheeler {
        public void print() {
            Vehicle.super.print();
            FourWheeler.super.print();
            Vehicle.blowHorn();
            System.out.println("我是一辆汽车!");
        }
    }


}
