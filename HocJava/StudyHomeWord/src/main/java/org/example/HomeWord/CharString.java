package org.example.HomeWord;

import java.util.Scanner;
//•	Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//•	Kiểm tra xem ký tự đó có xuất hiện trong chuỗi hay không? Nếu có in ra “Có”, ngược lại in ra “Không”.
/*Bản đồ Use Case
- Nhập vào một chuỗi
- Nhập vào một ký tự
- Kiểm tra xem ký tự đó có có xuất hiện trong chuỗi hay không --> lấy ra tất cả các thứ từ trong chuỗi lưu vào mảng
dùng vòng lặp for để kiểm tra định dạng của kí tự trong chuỗi--> >1 thì có xuất hiện
 */


public class CharString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung phương thức của đối tượng.
        System.out.println("Nhap mot chuoi:");
        String str = Scanner.nextLine();
        //Nhập một chuỗi
        System.out.println("Nhap mot ky tu:");
        char ch = Scanner.next().charAt(0);
        // Nhập một ký tự
        boolean h = false;
        for (int i =0; i < str.length();i++){
            // Dùng vòng loop kiểm tra xem ký tự có xuất hiện trong chuỗi hay không
            if (ch == str.charAt(i)){
                // Kiểm tra giá trị
                h = true;
                break;
            }
        }
        if (h){
            System.out.println("Ky tu xuat hien trong chuoi");
        }else{
            System.out.println("Ky tu khong xuat hien trong chuoi");
        }
    }
}