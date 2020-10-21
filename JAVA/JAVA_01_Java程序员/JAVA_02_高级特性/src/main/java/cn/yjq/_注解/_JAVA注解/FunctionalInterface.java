package cn.yjq._注解._JAVA注解;

import cn.yjq._注解._JAVA注解._元注解.Documented;
import cn.yjq._注解._JAVA注解._元注解.Retention;
import cn.yjq._注解._JAVA注解._元注解.Target;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}