package vn.hieu.exercises;
import java.util.Scanner;
//Tim số Fibonaci tương ứng với 2 giá trị đầu là 1 và 1;
public class Fibonaci {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen");
        for (int k = 0; k < 1000;k++) { // Tạo vòng lặp để nhập được nhiều lần
            int number = Scanner.nextInt(); // Đoc số nhập vào
            if (number==0||number==1){ // Đoc số nhập vào loại bỏ 2 trường hợp đầu tiên
                System.out.println("so Fibonaci tuong ung la: " + 1);
            }else {
                int f0 = 1;
                int f1 = 1;
                int f2 = 0;
                for (int avarible = 2; avarible <= number; avarible++) {
                    f2 = f0 + f1;
                    f0 = f1;
                    f1 = f2;
                    if (number == avarible) { // nếu số nhập vào bằng biến chạy thì gán biến số nhập vào bằng f2
                        number = f2;
                        System.out.println("so Fibonaci tuong ung f(" +avarible+") : " + number);
                        break;
                    }
                }
            }
        }
    }
}
