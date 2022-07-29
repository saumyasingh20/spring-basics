package demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int StudentId;
    private  String name;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(){
        System.out.println("hi i am student");
    }
}
