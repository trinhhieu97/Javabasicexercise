package org.example.HomeWord;

import java.util.Scanner;
//Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
/*Sơ đồ Use Case
- nhập vào n
- nhập tiếp vào phần tử số nguyên --> lưu các số vào mảng
- từ mảng kết hợp với vòng loop cho mảng chạy ngược từ giá trị n-1 về
 */
public class ReverseArray {
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
        //Chạy ngược mảng và in ra các giá trị
        System.out.print("So lon nhat la: ");
        for (int i = n-1; i>=0; i--){
            //In ra kết quả mảng đảo ngược;
            System.out.print(arr[i] + " ");
            }
    }
}