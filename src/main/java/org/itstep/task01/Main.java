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
                            String date;
                            date = scanner.next();
                            man.setDateOfBirth(date);
                            break;
                        }
                        case 4:
                        {
                            String phone;
                            phone = scanner.next();
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

