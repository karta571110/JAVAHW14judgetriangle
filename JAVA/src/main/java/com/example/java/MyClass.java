package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;

        while (true) {
            System.out.println("�п�J3�Ʀr�N��T���Ϊ��T���:(�H�ť�����})");
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("��3����i�H�զX��1�ӤT����!");
            }
            else {
                System.out.println("��3�������զX��1�ӤT����!");
            }
        }
    }
}
