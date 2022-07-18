package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int num = 10;
        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        try {
            int result = num / num2;
            System.out.println(result);
        }catch (Exception e) {
            System.out.println("除数不能为0");
        }
    }
}
