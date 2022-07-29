package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //scope = singleton
        System.out.println("Welcome to Spring");
//        System.out.println("Core Java way of creating object");
//        Doctor doc = new Doctor();
//        doc.assist();
        System.out.println("Spring Way of creating object");
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Doctor springDoctor = context.getBean(Doctor.class);
        springDoctor.assist();
        System.out.println("Qualification - "+springDoctor.getQualification());
        System.out.println("id - "+ springDoctor.getId());

        Nurse nurse = (Nurse)context.getBean("nurse");
//        nurse.assist();

        System.out.println("Nurse "+nurse.getName()+" with id "+nurse.getId()+" is helping doctor");

        Staff staff= context.getBean(Doctor.class);
        staff.assist();
        staff=context.getBean(Nurse.class);
        staff.assist();

        System.out.println("Embedding nurse object into the doctor object");

        System.out.println("Doctor id- "+ springDoctor.getId()+" Nurse - "+springDoctor.getNurse().getName());
    }
}
