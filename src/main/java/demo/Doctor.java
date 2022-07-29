package demo;

public class Doctor implements  Staff{
    private int id;
    private String qualification;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    private Nurse nurse;

    public Doctor(int id, String qualification, Nurse nurse) {
        this.id = id;
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public Doctor(int id, String qualification) {
        this.id = id;
        this.qualification = qualification;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("doctor assisting");
    }
}
