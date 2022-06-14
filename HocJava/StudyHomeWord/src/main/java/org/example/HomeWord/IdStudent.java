package org.example.HomeWord;
//+ Viết chương trình cho phép người dùng nhập vào mã số sinh viên
//+ Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
//+ Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9.

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

/* Phân tích sơ đồ USE Case;
- Nhập vào mã số sinh viên
- Kiểm tra xem mã số sinh viên này đúng với định dạng không
* Sử dụng biểu thức chính quy đến kiểm tra
+ Nếu không đúng định dạng trả về không đúng và dừng chương trình
+ Nếu đúng trả về false
- In ra màn hình đúng định dạng.
 */
public class IdStudent {
    public static void main(String[] args) {
        String id = setNumber();
        boolean testid = testId(id);
        printid(testid);
    }
    private static void printid(boolean testid) {
        if (testid == true){
            System.out.println("dung dinh dang");
        }
    }
    private static boolean testId(String id) {
        if (id.matches("^(B)[1-9]{7}")){
            return true;
        }
        System.out.println("Sai dinh dang");
            return false;
    }
    public static String setNumber() {
        System.out.println("Nhap vao ma id:");
        Scanner Scanner = new Scanner(System.in);
        String h = Scanner.next();
        return h;
    }
}
