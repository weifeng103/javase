package work1;

import java.util.Objects;

public class StudentManagerSystem extends StudentList implements ManagerSystem {
    public StudentManagerSystem(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insert(StudentGrade studentGrade) throws Exception {
        if (current > 0 && Objects.equals(studentGrade.getId(), studentGrades[before].getId())) {
            throw new Exception("学生id重复,请重新添加");
        }
        studentGrades[current] = studentGrade;
        current++;
        before++;
    }

    @Override
    public void select(int id) throws Exception {
        int idCount = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade != null && studentGrade.getId() == id) {
                System.out.println(studentGrade);
                idCount++;
            }
        }
        if (idCount == 0) {
            throw new Exception("没有该id或表为空");
        }
    }

    @Override
    public void update(int id, StudentGrade studentGrade) throws Exception {
        int index = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] != null && studentGrades[i].getId() == id) {
                studentGrades[i] = studentGrade;
                index = i;
            }
            if (i != index && Objects.equals(studentGrade.getId(), studentGrades[i].getId())) {
                throw new Exception("学生id重复,请重新添加");
            }
        }
    }

    @Override
    public void delete(int id) throws Exception {
        int idCount = 0;
        int nullCount = 0;
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade == null) {
                nullCount++;
            }
        }
        if (nullCount == maxSize) {
            throw new Exception("学生表为空");
        }
        for (StudentGrade studentGrade : studentGrades) {
            if (studentGrade != null && studentGrade.getId() == id) {
                idCount++;
            }
        }
        if (idCount == 0) {
            throw new Exception("学生id不存在,请重新输入");
        }
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] != null && studentGrades[i].getId() == id) {
                studentGrades[i] = null;
            }
        }
    }

    @Override
    public void show() {
        for (StudentGrade studentGrade : studentGrades) {
            System.out.println(studentGrade);
        }
    }
}
