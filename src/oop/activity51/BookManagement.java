package oop.activity51;

import java.util.List;

public class BookManagement {
    private int n;
    private List<Book> books;

    public BookManagement(List<Book> books) {
        this.books = books;
        this.n = this.books.size();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int demBestSeller() {
        int d = 0;
        for(Book book : books){
            if(book.bestSeller() == true){
                ++d;
            }
        }
        return d;
    }

    public Book topBestSeller() {
        long max = 0;
        Book topBestSeller = null;

        for(Book book:books){
            if(book.bestSeller() == true){
                if(max < book.getTotalSold()){
                    max = book.getTotalSold();
                    topBestSeller = book;
                }
            }
        }
        return topBestSeller;
    }

}