package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;

        while (true) {
            System.out.println("請輸入3數字代表三角形的三邊長:(以空白鍵分開)");
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("此3邊長可以組合成1個三角形!");
            }
            else {
                System.out.println("此3邊長不能組合成1個三角形!");
            }
        }
    }
}
