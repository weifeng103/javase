package work1;

public class StudentList {
    public  StudentGrade[] studentGrades;
    int current =  0;
    int before = -1;
    int maxSize = 0;
    public StudentList(int maxSize) {
        this.maxSize = maxSize;
        studentGrades = new StudentGrade[maxSize];
    }
}
