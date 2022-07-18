package Singleton;

public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

        System.out.println(singleton == singleton2);
        System.out.println(singleton2 == singleton3);
    }

}
