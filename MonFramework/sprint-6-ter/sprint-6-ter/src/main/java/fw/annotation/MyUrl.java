package fw.annotation.url;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
<<<<<<<< HEAD:MonFramework/sprint-7/src/main/java/fw/annotation/url/GetUrl.java
import fw.helper.HttpMethods;

========
>>>>>>>> main:MonFramework/sprint-6-ter/sprint-6-ter/src/main/java/fw/annotation/MyUrl.java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GetUrl {
    String value() default "";
    String method() default HttpMethods.GET;
}