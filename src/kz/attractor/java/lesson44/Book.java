package kz.attractor.java.lesson44;

import java.util.List;

public class Book {

    private String name;
    private String author;
    private  String year;
    private Integer id;
    private boolean busyStatus;
    private transient Employee employee;

//    public Book(String name, String author) {
//        this.name = name;
//        this.author = author;
//    }

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;

        setEmployee();
    }

    private void setEmployee() {
        if (busyStatus){
            List<Employee>emp = FileServiceEmployee.readFile();
            for (Employee employee: emp){
                if(employee.getId().equals(this.id)){
                    this.employee = employee;
                }
            }
        }
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isBusyStatus() {
        return busyStatus;
    }

    public void setBusyStatus(boolean busyStatus) {
        this.busyStatus = busyStatus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}


