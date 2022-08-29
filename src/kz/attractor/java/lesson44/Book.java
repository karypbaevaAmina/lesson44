package kz.attractor.java.lesson44;

public class Book {

    private String name;
    private String author;

    private String status;

    private String employeeName;

    public Book(String name, String author, String status, String employeeName) {
        this.name = name;
        this.author = author;
        this.status = status;
        this.employeeName = employeeName;
    }

    public Book(String name, String status, String employeeName) {
        this.name = name;
        this.status = status;
        this.employeeName = employeeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}


