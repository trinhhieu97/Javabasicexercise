package org.example.HomeWord;

import java.sql.SQLOutput;
import java.util.Scanner;
//•	Viết chương trình cho phép nhập vào một chuỗi, kiểm tra xem chuỗi này có xuất hiện số hay không.
//•	Nếu có tin ra “Có”, ngược lại, in ra “Không”.
/*Map Use Case
- Nhập vào chuỗi
- Kiểm tra chuổi:
+ Lấy ra lần lượt các ký tự trong chuỗi --> so sánh với ký tự số ---> kết quả
+ Dùng biểu thức chính qua và phương thức matches để kiểm tra
- In ra kết quả

 */
public class NumberString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung phương thức của đối tượng.
        System.out.println("Nhap mot chuoi:");
        String str = Scanner.nextLine();
        //Nhập một chuỗi
        boolean ketqua = false;
        for (int i = 0; i < str.length(); i++){
            char h = str.charAt(i);
            //lấy ra từng giá trị ký tự trong chuỗi
            if (h=='0'||h=='1'||h=='2'||h=='3'||h=='4'||h=='5'||h=='6'||h=='7'||h=='8'||h=='9'){
                ketqua = true;
                //so sánh ký tự lấy trong chuỗi và các ký tự số
            }
        }
        if (ketqua == true){
            // Có số thì in ra kết quả
            System.out.println("Co so xuat hien");
        }else {
            System.out.println("Khong co so xuat hien");
        }
    }
}
