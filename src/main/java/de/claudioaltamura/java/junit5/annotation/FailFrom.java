package de.claudioaltamura.java.junit5.annotation;

import java.lang.annotation.*;
import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ExtendWith;

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(FailFromCondition.class)
@Documented
@API(status = API.Status.EXPERIMENTAL)
public @interface FailFrom {
  String date() default "";

  String reason() default "";
}
