package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1: "+obj1.getData1());
        System.out.println("data2: "+obj1.getData2());
        System.out.println("data3: "+obj1.getData3());

        TestBean1 obj12 = ctx.getBean("t2", TestBean1.class);
        System.out.println("\ndata1: "+obj12.getData1());
        System.out.println("data2: "+obj12.getData2());
        System.out.println("data3: "+obj12.getData3());

        ctx.close();

        System.out.println("=================================================================================");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 obj2 = ctx2.getBean("java1", TestBean1.class);
        System.out.println("data1: "+obj2.getData1());
        System.out.println("data2: "+obj2.getData2());
        System.out.println("data3: "+obj2.getData3());

        TestBean1 obj22 = ctx2.getBean("java2", TestBean1.class);
        System.out.println("\ndata1: "+obj22.getData1());
        System.out.println("data2: "+obj22.getData2());
        System.out.println("data3: "+obj22.getData3());

        ctx2.close();

    }
}