package kenchang8787.com.custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 定義作用在方法
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RumImmediately {

  // 定義可傳入參數, 並可以設定預設值
  int times() default 1;
}
