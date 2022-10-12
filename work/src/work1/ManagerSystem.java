package work1;

public interface ManagerSystem {
    void insert(StudentGrade studentGrade) throws Exception;
    void select(int id) throws Exception;
    void update(int id,StudentGrade studentGrade) throws Exception;
    void delete(int id) throws Exception;
    void show();
}
