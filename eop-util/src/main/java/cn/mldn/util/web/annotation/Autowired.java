package cn.mldn.util.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义业务层的注解
 */
@Documented
@Target({ ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowired {
	// 定义的是类的标记，应该根据标记来获取指定的类对象
	public String name() default "nothing" ;
}
