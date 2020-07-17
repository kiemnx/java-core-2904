package exceptions;

import java.util.Scanner;

public class UncheckedExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        try {
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (Exception e){
            System.out.println("Du lieu nhap khong phai la so nguyen");
        }
    }
}
