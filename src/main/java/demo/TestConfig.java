package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        context.getBean(Customer.class).info();
    }
}
