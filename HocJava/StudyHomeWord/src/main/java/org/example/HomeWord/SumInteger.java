package org.example.HomeWord;
//Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.

import java.util.Scanner;

/* Phân tích sơ đồ USE CASE;
- Nhập vào số nguyên dương
_ Tính tổng tổng các số chẵn từ 0--> n
- In ra màn hình tong so chan

 */
public class SumInteger {
    public static void main(String[] args) {
        int number = setNumber();
        int sum = sumNumber(number);
        printSum(sum);
    }
    public static void printSum(int sum) {
        System.out.println("Tong so chan la: "+sum);
    }
    public static int sumNumber(int number) {
        int sum = 0;
            for(int i = 0;i<=number;i++){
                if (i%2==0){
                    sum = sum +i;
                }
            }
        return sum;
    }
    public static int setNumber() {
        System.out.println("Nhap so:");
        Scanner Scanner = new Scanner(System.in);
        int h = Scanner.nextInt();
        return h;
    }

}
