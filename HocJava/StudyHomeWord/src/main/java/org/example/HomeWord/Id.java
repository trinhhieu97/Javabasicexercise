package org.example.HomeWord;

import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào 5 mã số, lưu 5 mã số này vào một mảng.
//Chương trình sẽ kiểm tra xem trong 5 mã số này có mã số nào sai định dạng hay không
// (định dạng là “00yLxxxx” với y là số nguyên từ 2 - 5, x là số nguyên từ 0-9).
//Nếu có bất kỳ mã số nào sai định dạng thì chương trình in ra “Sai rồi” rồi kết thúc chương trình, ngược lại thì in ra “Đúng rồi”.
/*
- Nhập 5 mã số rồi lưu vào mảng
- Kiểm tra xem 5 mã trong mảng đã đúng hay chưa nếu có mã sai thì break; in ra sai hoặc ngược lại
 */
public class Id {
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
            if (arr[i].matches("^(00)[2-5]{1}[0-9]{4}")){
                System.out.println("Nhap ma ID "+(i+1)+" : Dung dinh dang");
            }else {
                System.out.println("Nhap ma ID "+(i+1)+" : Sai dinh dang");
                break;
            }
        }
    }
}