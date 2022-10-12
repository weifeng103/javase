package work1;

public class SystemTest {
    public static void main(String[] args) throws Exception {
        StudentGrade studentGrade = new StudentGrade(1,"lili","女",100.0,99.0);
        StudentGrade studentGrade2 = new StudentGrade(2,"lisa","女",80.0,99.0);
        StudentGrade studentGrade3 = new StudentGrade(3,"li","女",100.0,99.0);
        StudentGrade studentGrade4 = new StudentGrade(3,"haha","女",90.0,99.0);
        StudentManagerSystem studentManagerSystem = new StudentManagerSystem(3);
        studentManagerSystem.insert(studentGrade);
        studentManagerSystem.insert(studentGrade2);
        studentManagerSystem.insert(studentGrade3);
        studentManagerSystem.show();
        System.out.println("---------------------");
        studentManagerSystem.delete(1);
        studentManagerSystem.show();
        System.out.println("---------------------");
        studentManagerSystem.select(2);
        System.out.println("---------------------");
        studentManagerSystem.update(3,studentGrade4);
        studentManagerSystem.show();

    }
}
