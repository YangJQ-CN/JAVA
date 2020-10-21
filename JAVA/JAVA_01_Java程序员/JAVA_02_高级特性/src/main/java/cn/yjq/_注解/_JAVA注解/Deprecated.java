package cn.yjq._注解._JAVA注解;

import cn.yjq._注解._JAVA注解._元注解.Documented;
import cn.yjq._注解._JAVA注解._元注解.Retention;
import cn.yjq._注解._JAVA注解._元注解.Target;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
