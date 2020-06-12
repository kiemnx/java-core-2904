package oop.activity51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.println("Nhap vao tong so sach: ");
        int n = scanner.nextInt();

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Cuon sach " + (i+1) + " Ten: ");
            String name = scanner.nextLine();
            System.out.println("  -  Tac Gia: ");
            String author = scanner.nextLine();
            System.out.println(" ! Gia ban: ");
            long price = scanner.nextLong();
            System.out.println(" -> Tong so ban da ban duoc: ");
            long totalSold = scanner.nextLong();
            System.out.println();
            scanner.nextLine();
            Book book = new Book(name, author, price ,totalSold);
            books.add(book);
        }

        BookManagement bookManagement = new BookManagement(books);

        for (int i = 0; i < n; i++) {
            System.out.println("Cuon sach " + (i+1) + "" +
                                "\nTen: " + books.get(i).getName() + "" +
                                "\nTac gia: " + books.get(i).getAuthor());
            System.out.println("\nGia ban: " + books.get(i).getPrice() + "" +
                                "\nTong so da ban duoc: " + books.get(i).getTotalSold());
            System.out.println();
        }

        System.out.println(" Tong so cuon sach thuoc top Best Seller : " + bookManagement.demBestSeller());

        System.out.println(" Quyen sach ban chay nhat la: ");
        Book topBestSeller = bookManagement.topBestSeller();

        System.out.println("  - Ten: " + topBestSeller.getName());
        System.out.println("  - Tac gia: " + topBestSeller.getAuthor());
        System.out.println("  - Gia: " + topBestSeller.getPrice());
        System.out.println("  - Tong so da ban: " + topBestSeller.getTotalSold());
    }
}
