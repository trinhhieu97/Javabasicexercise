package org.example.HomeWord;

import java.util.Scanner;

//•	Viết chương trình cho phép người dùng nhập vào một chuỗi, sau đó nhập vào một ký tự.
//•	Kiểm tra xem ký tự nhập vào đó nằm ở vị trí thứ mấy trong chuỗi(nếu có, số đếm bắt đầu từ 0).
//•	Nếu nó có xuất hiện trong chuỗi thì in ra vị trí của nó trong chuỗi, nếu không thì in ra “Không tồn tại trong chuỗi”.
/* Map Use Case:
- Nhập vào một chuỗi sau đó nhập vào một ký tự
- kiểm tra vị trí của ký tự đó trong chuỗi: dùng phương thức indexof và dùng vòng for để kiểm tra vị trí
- In ra kết quả sau khi đã kiểm tra

 */
public class CharString1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //Tạo đối tượng lớp Sanner để sử dung phương thức của đối tượng.
        System.out.println("Nhap mot chuoi:");
        String str = Scanner.nextLine();
        //Nhập một chuỗi
        System.out.println("Nhap mot ky tu:");
        char ch = Scanner.next().charAt(0);
        // Nhập một ký tự
        int h = 0;
        boolean k = false;
        for (int i =0; i < str.length();i++){
            // Dùng vòng loop kiểm tra xem ký tự có xuất hiện trong chuỗi hay không
            if (ch == str.charAt(i)){
                // Kiểm tra giá trị
                h = i;
                k = true;
                break;
            }
        }
        if (k){
            System.out.println("Ky tu xuat hien trong chuoi tại vị trí: "+h);
        }else{
            System.out.println("Ky tu khong xuat hien trong chuoi");
        }
    }
}