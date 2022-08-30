package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {
    private List <Book> books = new ArrayList<>();
    private Book book;
    private List <Employee> employees = new ArrayList<>();



    public BooksDataModel() {
        books.add(new Book("Harry Poter", "given out", "Vlad Pak"));
        books.add(new Book("Lerning XML",  "given out", "Igor Alekseevich "));
        books.add(new Book("Code", "given out", "Marina Vladimirovna"));
        employees.add(new Employee("Lena Olegovna", "Harry Potter", " "));
        employees.add(new Employee("Danil Nikitin", " ", "Code"));
        employees.add(new Employee("Vlad Pak", " ","Harry Potter "));
        employees.add(new Employee("Igor Alekseevich", "Lerning XML", " "));
        employees.add(new Employee("Marina Vladimirovna","Code", "Lerning XML"));
        this.book = new Book("Harry Potter", " J.K.Rowling", "given out","Lena Olegovna", "2015");
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
