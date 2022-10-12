package work2;

import java.util.Objects;

public class ManageStudentGrade implements Manager {
    public final StudentGrade headNode = new StudentGrade();

    @Override
    public void insert(Object studentGrade) throws Exception {
        StudentGrade temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = (StudentGrade) studentGrade;
        if (Objects.equals(temp.id, ((StudentGrade) studentGrade).id)) {
            throw new Exception("学号有误，添加失败！");
        }
    }

    @Override
    public void select(int id) throws Exception {
        StudentGrade temp = headNode;
        if (temp.next == null) {
            throw new Exception("链表为空~");
        }
        while (true) {
            if (!Objects.equals(temp.id, id)) {
                if (temp.next != null) {
                    temp = temp.next;
                } else {
                    throw new Exception("学号有误，查询失败！");
                }
            } else {
                break;
            }
        }
        System.out.println(temp);
    }

    @Override
    public void update(int id, Object studentGrade) throws Exception {
        StudentGrade temp = headNode;
        if (temp.next == null) {
            throw new Exception("链表为空~");
        }
        while (true) {
            if (!Objects.equals(temp.id, id)) {
                if (temp.next != null) {
                    temp = temp.next;
                } else {
                    throw new Exception("学号有误，更新失败！");
                }
            } else {
                break;
            }
        }
        temp.id = ((StudentGrade) studentGrade).id;
        temp.name = ((StudentGrade) studentGrade).name;
        temp.gender = ((StudentGrade) studentGrade).gender;
        temp.math = ((StudentGrade) studentGrade).math;
        temp.english = ((StudentGrade) studentGrade).english;
    }

    @Override
    public void delete(int id) throws Exception {
        StudentGrade temp = headNode;
        if (temp.next == null) {
            throw new Exception("链表为空~");
        }
        while (true) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        if (temp.next == null) {
            throw new Exception("学号有误，添加失败！");
        }
    }

    @Override
    public void show() throws Exception {
        StudentGrade temp = headNode;
        if (temp.next == null) {
            throw new Exception("链表为空~");
        }
        while (temp.next != null) {
            temp = temp.next;
            System.out.println(temp);
        }
    }
}
