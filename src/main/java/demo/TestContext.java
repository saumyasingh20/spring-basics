package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContext {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
        Student student = context.getBean(Student.class);
        student.getInfo();
        student.setStudentId(78);
        student.setName("Saumya");
        System.out.println("Student id = "+ student.getStudentId()+ " Student name = "+ student.getName());
        context.getBean(Student.class).getInfo();

    }
}
