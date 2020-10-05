package org.itstep.task01;

import java.util.Scanner;

public class Human {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String city;
    private String country;
    private String address;

    Human() {
        fullName = "null";
        dateOfBirth = "null";
        phone = "null";
        city = "null";
        country = "null";
        address = "null";
    }

    Human(String fullName, String dateOfBirth, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name:");
        fullName = scanner.nextLine();

        System.out.print("Enter Date of Birth:");
        dateOfBirth = scanner.next();

        System.out.print("Enter Phone:");
        phone = scanner.next();

        System.out.print("Enter City:");
        city = scanner.next();

        System.out.print("Enter Country:");
        country = scanner.next();

        System.out.print("Enter Address:");
        address = scanner.next();
    }

    public void print() {
        System.out.println("Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
