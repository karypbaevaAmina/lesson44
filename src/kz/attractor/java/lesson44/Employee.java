package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String fullName;
    private String bookList;

    private  String usedBook;



    public Employee(String fullName, String bookList) {
        this.fullName = fullName;
        this.bookList = bookList;

    }

    public Employee(String fullName, String bookList, String usedBook) {
        this.fullName = fullName;
        this.bookList = bookList;
        this.usedBook = usedBook;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBookList() {
        return bookList;
    }

    public void setBookList(String bookList) {
        this.bookList = bookList;
    }

    public String getUsedBook() {
        return usedBook;
    }

    public void setUsedBook(String usedBook) {
        this.usedBook = usedBook;
    }
}
