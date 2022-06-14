package org.example.HomeWord;
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương.
//Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
/*Bản đồ Use Case
- Nhập vào một số
- Nhập vào một phần tử số nguyên dương
- Xuất ra phần tử có giá trị lớn nhất

 */

import java.util.Scanner;

public class MaxNumber {
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
        //gán phần tử đầu là max rồi so sánh với các phần tử tiếp theo
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //In ra kết quả Giá trị lớn nhất;
        System.out.println("So lon nhat la: "+max);
    }
}
