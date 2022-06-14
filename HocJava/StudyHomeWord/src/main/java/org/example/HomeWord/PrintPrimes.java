package org.example.HomeWord;
//Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//In ra tất cả số nguyên tố trong khoảng từ 0 - n.

import java.sql.SQLOutput;
import java.text.Format;
import java.util.Scanner;

/*Sơ Đồ Use Case:
- Nhap so nguyen n
- Kiểm từng số xem số đó có phải số nguyên tố hay không bằng vòng loop for
+ số xét đến là 1 hoặc 2
+ số xét đến không phải 1 hoặc 2: nhận từng số trong loop ---> kiểm tra xem từng số đó có phải số nguyên tố hay không bằng loopfor -- > in ra số đó luôn
 */
public class PrintPrimes {
    public static void main(String[] args) {
        int number = setNumber();
        printPrimes(number);
    }
    public static void printPrimes(int number) {
        int i;
        int j;
        boolean h = true;
        if (number == 1) {
            System.out.println("Cac so nguyen to la: 1");
        } else if (number == 2) {
            System.out.println("Cac so nguyen to la: 1 2");
        } else {
            System.out.print("Cac so nguyen to la: 1 2 ");
            for (i = 3; i <= number; i++) {
                h = true;
                int canbien = i/2+1;
                for (j = 2; j < canbien; j++) {
                    if (i % j == 0) {
                        h = false;
                    }
                }
                if (h == true) {
                    System.out.print(i + " ");
                }
            }

        }
    }

    public static int setNumber() {
        System.out.println("Nhap so");
        Scanner Scanner = new Scanner(System.in);
        int b = Scanner.nextInt();
        return b;
    }


}
