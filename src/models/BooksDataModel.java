package models;

import kz.attractor.java.lesson44.Book;
import kz.attractor.java.lesson44.Employee;
import kz.attractor.java.lesson44.FileServiceEmployee;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {

    private List <Book> books = new ArrayList<>();
    private Book book;



    public BooksDataModel() {
//        books.add(new Book("Harry Poter", "J.K.Rowling"));
//        books.add(new Book("Lerning XML", "E.T.Ray"));
//        books.add(new Book("Code", " C. Petsolt"));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

}
