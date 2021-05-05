package Entities;

import java.time.LocalDate;

public class Gamer {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String nationalityId;
    private LocalDate dateOfBirth;
    private String password;

    public Gamer() {

    }

    public Gamer(int id,String firstName, String lastName,String userName,String nationalityId,LocalDate dateOfBirth,String password) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setUserName(userName);
        this.setNationalityId(nationalityId);
        this.setDateOfBirth(dateOfBirth);
        this.setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void setPassword(String password) {
        this.password = password;
    }
}
