package cn.yjq._注解._JAVA注解;

import cn.yjq._注解._JAVA注解._元注解.Retention;
import cn.yjq._注解._JAVA注解._元注解.Target;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface SuppressWarnings {

    String[] value();
}