package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        ScopeDemo sd = context.getBean(ScopeDemo.class);
        sd.setTitle("Title 1");
        ScopeDemo sd2 = context.getBean(ScopeDemo.class);
        System.out.println("Title of obj 1= "+sd.getTitle());

        System.out.println("Title of obj 2= "+sd2.getTitle());

    }
}
