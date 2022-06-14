package org.example.HomeWord;

import java.util.Scanner;
// Cách 2 của bài trước
public class NumberString2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung phương thức của đối tượng.
        System.out.println("Nhap mot chuoi:");
        String str = Scanner.nextLine();
        //Nhập một chuỗi
        if (str.matches("^.[0-9]{1}.")){
            // Có số thì in ra kết quả
            System.out.println("Co so xuat hien");
        }else {
            System.out.println("Khong co xuat hien");
        }
    }
}
