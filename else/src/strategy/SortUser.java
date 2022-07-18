package strategy;


public class SortUser {
    public void sort(User[] users, Comparator comparator){
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = 0; j < users.length - i - 1; j++) {
                if (comparator.compare(users[j], users[j + 1]) > 0) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
    }
}
