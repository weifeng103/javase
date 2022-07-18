package strategy;

import java.util.Arrays;

public class Client  {
    public static void main(String[] args) {
    User user1 = new User("С��",12,180);
    User user2 = new User("С��",13,181);
    User user3 = new User("С��",14,182);
    User user4 = new User("С��", 15, 183);

    User[] users = new User[]{user1, user2, user3, user4};
    SortUser sortUser = new SortUser();
//    sortUser.sort(users,new CompareAgeStrategy());
    sortUser.sort(users,((userOne, userTwo) ->
            userOne.getAge() - userTwo.getAge()));

    System.out.println(Arrays.toString(users));
    }

}
