package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {

    private List <Book> books = new ArrayList<>();

    private List <Employee> employees = new ArrayList<>();


    public BooksDataModel() {
        books.add(new Book("Harry Poter", "given out", "Vlad Pak"));
        books.add(new Book("Lerning XML",  "given out", "Igor Alekseevich "));
        books.add(new Book("Code", "given out", "Marina Vladimirovna"));
        employees.add(new Employee("Lena Olegovna"));
        employees.add(new Employee("Danil Nikitin"));
        employees.add(new Employee("Vlad Pak"));
        employees.add(new Employee("Igor Alekseevich"));
        employees.add(new Employee("Marina Vladimirovna"));
    }

    public List<Book> getBooks() {
        return books;
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
