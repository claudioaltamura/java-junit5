package de.claudioaltamura.java.junit5.annotation;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@Target(value={ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(FailFromCondition.class)
@Documented
public @interface FailFrom {
    String date() default "";
    String reason() default "";
}
