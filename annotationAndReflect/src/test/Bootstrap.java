package test;

import java.net.URL;

public class Bootstrap {
    public static void main(String[] args) {
        URL resource = Thread.currentThread().getContextClassLoader().getResource("");

    }
}
