package work2;

public class StudentGrade {
    public Integer id;
    public String name;
    public String gender;
    public Double english;
    public Double math;
    public  StudentGrade next;

    public StudentGrade() {
    }

    public StudentGrade(Integer id, String name, String gender, Double english, Double math) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", English=" + english +
                ", math=" + math +
                '}';
    }
}
