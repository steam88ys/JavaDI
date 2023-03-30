package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
    @Bean   // constructor
    public TestBean1 java1() {
        TestBean1 t = new TestBean1(2, 2.2, "spring2");
        return t;
    }


    @Bean
    public TestBean1 java2() {
        TestBean1 t1 = new TestBean1();
        t1.setData1(4);
        t1.setData2(4.4);
        t1.setData3("spring4");
        return t1;
    }

}
