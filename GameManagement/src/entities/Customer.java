package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends  User{
    private int id;
    private String name;
    private String lastName;
    private String nationalNumber;
    private Date birtDate;
    private List<Game> game;


    public Customer() {
    }

    public Customer(String uName, String email, String pswrd, int id, String name, String lastName, String nationalNumber, Date birtDate) {
        super(uName, email, pswrd);
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nationalNumber = nationalNumber;
        this.birtDate = birtDate;
        game=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public Date getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(Date birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalNumber='" + nationalNumber + '\'' +
                ", birtDate=" + birtDate +
                ", game=" + game +
                '}';
    }
}

