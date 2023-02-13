package kenchang8787.com.custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 基本上一個 Annotation 勢必要有這兩個 Annotation
// 一個表明它可以宣告在哪裡, 此例中只能宣告給 Type (class, interface, enum...)
// 另一個表明它會在甚麼時候被注入, 基本使用上都是RUNTIME, 但有一些比較特別的可以看 lombok 的 @Data

@Target(ElementType.TYPE)
// @Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {}
