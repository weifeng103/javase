package strategy;

@FunctionalInterface
public interface Comparator {
      double compare(User userOne, User userTwo);
}
