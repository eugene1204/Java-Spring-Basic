package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredTestOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }
    static class TestBean{
        @Autowired(required = false)
        public void setNoBean1(Member member1){
            System.out.println("setNoBean1 = " + member1); // 호출되지 않 //
        }

        @Autowired
        public void setNoBean2(@Nullable Member member1){
            System.out.println("setNoBean2 = " + member1); // setNoBean2 = null
        }
        @Autowired(required = false)
        public void setNoBean3(Optional<Member> member1){
            System.out.println("setNoBean3 = " + member1); // setNoBean3 = Optional.empty
        }
    }
}
