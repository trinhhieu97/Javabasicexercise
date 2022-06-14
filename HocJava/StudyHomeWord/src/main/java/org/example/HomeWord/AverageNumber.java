package org.example.HomeWord;

import java.util.Scanner;

//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này.
/* Bản đồ Use Case
- Nhập vào n + nhập vào n phần tử số nguyên -->
- dùng vòng lặp thu được giá trị trung bình
- In kết sum ra màn hình
 */
public class AverageNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung thuộc tính
        System.out.println("Nhap vao mot so n:");
        int n = Scanner.nextInt();
        // Nhập vào số n
        int arr[] = new int[n];
        //Tạo một mảng có kích thước là n để chứa các phần tử số nguyên
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phần tử "+(i+1)+" :");
            arr[i] = Scanner.nextInt();
        }
        //Công các phần tử số nguyên
        float sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
            }
        //In ra kết quả số trung bình;
        System.out.println("So trung binh la: "+sum/n);
    }
}

