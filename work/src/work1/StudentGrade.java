package work1;

public class StudentGrade {
    private Integer id;
    private String name;
    private String gender;
    private Double English;
    private Double math;

    public StudentGrade() {
    }

    public StudentGrade(Integer id, String name, String gender, Double english, Double math) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        English = english;
        this.math = math;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getEnglish() {
        return English;
    }

    public void setEnglish(Double english) {
        English = english;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "StudentGrade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", English=" + English +
                ", math=" + math +
                '}';
    }
}
