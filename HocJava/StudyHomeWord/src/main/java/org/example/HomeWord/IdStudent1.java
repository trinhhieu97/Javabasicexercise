package org.example.HomeWord;
//Viết chương trình cho phép người dùng nhập vào 5 mã số sinh viên.
//Kiểm tra xem mã số sinh viên này có đúng với định dạng hay chưa.
//Với định dạng mã số sinh viên là “B170xxxx” với x là số nguyên từ 1-9.

import java.util.Scanner;

/* bản đồ Use Case
- Nhập vào 5 mã số sinh viên
+ nhập thủ công bằng việc lặp lại các hàm
+ nhập thủ công kết hợp với vòng lặp for và cho các kết quả vào mảng
- Kiếm tra xem mã số sinh viên đó phù hợp định dạng không
+ kiếm tra lần lượt bằng việc gọi hàm từng mã + kết hợp luôn việc in ra
+ kiểm tra bằng vòng lặp và in ra kết quả
 */
public class IdStudent1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung thuộc tính
        String arr[] = new String[5];
        //Tạo một mảng có kích thước là 5 để chứa các mã Id
        for (int i = 0; i < 5; i++){
            System.out.println("Nhap ma ID "+(i+1)+" :");
            arr[i] = Scanner.next();
        }
        //Kiểm tra các mã Id rồi in ra kq kiểm tra
        for (int i = 0; i < 5; i++){
            if (arr[i].matches("^(B170)[1-9]{4}")){
            System.out.println("Nhap ma ID "+(i+1)+" : Dung dinh dang");
            }else {
                System.out.println("Nhap ma ID "+(i+1)+" : Sai dinh dang");
            }
        }
    }

}
