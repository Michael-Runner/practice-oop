package org.itstep.task01;

import java.util.Scanner;

/**
 * Задание 1
 * <p>
 * Создайте класс «Человек» (Human).
 * <p>
 * Необходимо хранить в полях класса:
 * - ФИО (fullName),
 * - дату рождения (dateOfBirth),
 * - контактный телефон (phone),
 * - город (city),
 * - страну (country),
 * - домашний адрес (address).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
 * доступ к отдельным полям через методы аксессоры.
 * <p>
 * Создайте два конструктора: один по умолчанию, другой - со 6 параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human man = new Human();
        int menu;

        do {
            System.out.println("[1]Show");
            System.out.println("[2]Enter");
            System.out.println("[3]Exit");
            menu = scanner.nextByte();

            switch (menu)
            {
                case 1:
                {
                    System.out.println("[1]Show all");
                    System.out.println("[2]Show Name");
                    System.out.println("[3]Show Date of Birth");
                    System.out.println("[4]Show Phone");
                    System.out.println("[5]Show City");
                    System.out.println("[6]Show Country");
                    System.out.println("[7]Show Address");
                    System.out.println("[8]Back");
                    menu = scanner.nextInt();

                    switch(menu)
                    {
                        case 1:
                        {
                            man.print();
                            break;
                        }
                        case 2:
                        {
                            System.out.println(man.getFullName());
                            break;
                        }
                        case 3:
                        {
                            System.out.println(man.getDateOfBirth());
                            break;
                        }
                        case 4:
                        {
                            System.out.println(man.getPhone());
                            break;
                        }
                        case 5:
                        {
                            System.out.println(man.getCity());
                            break;
                        }
                        case 6:
                        {
                            System.out.println(man.getCountry());
                            break;
                        }
                        case 7:
                        {
                            System.out.println(man.getAddress());
                            break;
                        }
                    }

                    break;
                }

                case 2:
                {
                    System.out.println("[1]Enter all");
                    System.out.println("[2]Enter Name");
                    System.out.println("[3]Enter Date of Birth");
                    System.out.println("[4]Enter Phone");
                    System.out.println("[5]Enter City");
                    System.out.println("[6]Enter Country");
                    System.out.println("[7]Enter Address");
                    System.out.println("[8]Back");
                    menu = scanner.nextInt();

                    switch(menu)
                    {
                        case 1:
                        {
                            man.fill();
                            break;
                        }
                        case 2:
                        {
                            String name;
                            name = scanner.next();
                            man.setFullName(name);
                            break;
                        }
                        case 3:
                        {
                            int date;
                            date = scanner.nextInt();
                            man.setDateOfBirth(date);
                            break;
                        }
                        case 4:
                        {
                            int phone;
                            phone = scanner.nextInt();
                            man.setPhone(phone);
                            break;
                        }
                        case 5:
                        {
                            String city;
                            city = scanner.next();
                            man.setCity(city);
                            break;
                        }
                        case 6:
                        {
                            String country;
                            country = scanner.next();
                            man.setCountry(country);
                            break;
                        }
                        case 7:
                        {
                            String address;
                            address = scanner.next();
                            man.setAddress(address);
                            break;
                        }
                    }
                    break;
                }

                case 3:
                {
                    menu = 0;
                    break;
                }
            }


        }while (menu != 0);
    }
}

class Human
{
    private String fullName;
    private int dateOfBirth;
    private int phone;
    private String city;
    private String country;
    private String address;

    Human()
    {
        fullName = "null";
        dateOfBirth = 0;
        phone = 0;
        city = "null";
        country = "null";
        address = "null";
    }

    Human(String fullName, int dateOfBirth, int phone, String city, String country, String address)
    {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public void fill()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name:");
        fullName = scanner.nextLine();

        System.out.print("Enter Date of Birth:");
        dateOfBirth = scanner.nextInt();

        System.out.print("Enter Phone:");
        phone = scanner.nextInt();

        System.out.print("Enter City:");
        city = scanner.next();

        System.out.print("Enter Country:");
        country = scanner.next();

        System.out.print("Enter Address:");
        address = scanner.next();
    }

    public void print()
    {
        System.out.println("Name: " + fullName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Phone: " + phone);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Address: " + address);
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setDateOfBirth(int dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth()
    {
        return  dateOfBirth;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCity()
    {
        return  city;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
}
