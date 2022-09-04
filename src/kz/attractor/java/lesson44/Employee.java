package kz.attractor.java.lesson44;


import com.sun.net.httpserver.HttpExchange;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

    private Integer id;
    private String fullName;
    public  String mail;
    private String password;

    private transient List<Book> book;
    private transient List<Book> book1;
    private List<Integer> usedBook;
    private List<Integer> readBook;

    public Employee(Integer id, String fullName, String mail, String password) {
        this.id = id;
        this.fullName = fullName;
        this.mail = mail;
        this.password = password;
    }

    public static Employee createEmployee(Integer id, Map<String, String> map) {
        return new Employee(id, map.get("fullName"), map.get("mail"), map.get("password"));
    }

    public static boolean compareEmployee(Employee employee, Employee user) {
        return employee.getMail().equals(user.getMail());
    }

    public void setBook(){
        List<Book> books = FileServiceBook.readFile();
        book = usedBook.stream().map(id -> books.get(id - 1)).collect(Collectors.toList());
        book1 = readBook.stream().map(id -> books.get(id - 1)).collect(Collectors.toList());

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public List<Book> getBook1() {
        return book1;
    }

    public void setBook1(List<Book> book1) {
        this.book1 = book1;
    }

    public List<Integer> getUsedBook() {
        return usedBook;
    }

    public void setUsedBook(List<Integer> usedBook) {
        this.usedBook = usedBook;
    }

    public List<Integer> getReadBook() {
        return readBook;
    }

    public void setReadBook(List<Integer> readBook) {
        this.readBook = readBook;
    }


}
