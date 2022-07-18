package strategy;

public class CompareHeightStrategy implements Comparator {
    public double compare(User user1, User user2) {
        return user1.getHeight() - user2.getHeight();
    }
}