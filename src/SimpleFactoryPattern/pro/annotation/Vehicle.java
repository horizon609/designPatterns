/**
 * 
 */
package SimpleFactoryPattern.pro.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
/**
 * @author echoplex_x email:wangting-xy@360.cn
 * @date 2016年6月12日
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Vehicle {
    String type() default "";
}
