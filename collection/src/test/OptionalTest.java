package test;

import java.util.Optional;
import java.util.Scanner;

public class OptionalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        User user = new User("jerry",12);
        if (i == 0) {
            user = null;
        }
        Optional<User> optional = Optional.of(user);
        System.out.println(optional.get());
    }
}
