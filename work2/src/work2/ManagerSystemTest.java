package work2;

public class ManagerSystemTest {
    public static void main(String[] args) throws Exception {
        StudentGrade studentGrade = new StudentGrade(2008001, "Alan", "女", 93.0, 88.0);
        StudentGrade studentGrade2 = new StudentGrade(2008002, "Danie", "男", 75.0, 69.0);
        StudentGrade studentGrade3 = new StudentGrade(2008003, "Helen", "男", 56.0, 77.0);
        StudentGrade studentGrade4 = new StudentGrade(2008004, "Bill", "女", 87.0, 90.0);
        StudentGrade studentGrade5 = new StudentGrade(2008006, "Peter", "男", 79.0, 86.0);
        StudentGrade studentGrade6 = new StudentGrade(2008006, "Amy", "女", 68.0, 75.0);
        StudentGrade studentGrade7 = new StudentGrade(2008007, "liHua", "女", 99.0, 88.0);
        ManageStudentGrade studentManagerSystem = new ManageStudentGrade();
        studentManagerSystem.insert(studentGrade);
        studentManagerSystem.insert(studentGrade2);
        studentManagerSystem.insert(studentGrade3);
        studentManagerSystem.insert(studentGrade4);
        studentManagerSystem.insert(studentGrade6);
        studentManagerSystem.show();
        System.out.println("--------------------");
        studentManagerSystem.select(2008002);
        System.out.println("--------------------");
        studentManagerSystem.update(2008006,studentGrade7);
        studentManagerSystem.show();

    }
}
