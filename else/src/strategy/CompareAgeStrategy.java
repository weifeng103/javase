package strategy;

public class CompareAgeStrategy implements Comparator {
    public double compare(User user1, User user2){
        return user1.getAge() - user2.getAge();
    }
}
