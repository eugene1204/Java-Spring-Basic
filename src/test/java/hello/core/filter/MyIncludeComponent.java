package hello.core.filter;
import java.lang.annotation.*;

@Target(ElementType.TYPE) // type이면 클래스레벨에 붙는다.
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
