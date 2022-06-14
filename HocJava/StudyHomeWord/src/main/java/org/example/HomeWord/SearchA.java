package org.example.HomeWord;

import java.util.Scanner;
//•	Viết chương trình cho phép nhập vào một chuỗi
//•	Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//•	In ra số lần đó.
/*Map Case;
- Nhập vào một chuỗi
- kiểm tra a xuất hiện bao nhiêu lần;
+ Không có a
+ Có a: dùng vòng loop for + charat gán giá trị biến sum --> có được số lần
- In kết quả ra màn hình
 */
public class SearchA {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung phương thức của đối tượng.
        System.out.println("Nhap mot chuoi:");
        String str = Scanner.nextLine();
        //Nhập một chuỗi
        boolean ketqua = false;
        int sum =0;
        for (int i = 0; i < str.length(); i++){
            char h = str.charAt(i);
            //lấy ra từng giá trị ký tự trong chuỗi
            if (h=='a'){
                sum = sum +1;
                ketqua = true;
            }
        }
        if (ketqua == true){
            // Có số thì in ra kết quả
            System.out.println("So lan a xuat hien la :"+sum);
        }else {
            System.out.println("Không có a");
        }
    }
}
