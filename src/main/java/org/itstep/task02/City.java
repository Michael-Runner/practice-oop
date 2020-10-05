package org.itstep.task02;

import java.util.Scanner;

/**
 * Задание 2
 * <p>
 * Создайте класс «Город» (City).
 * <p>
 * Необходимо хранить в полях класса:
 * - название города (name),
 * - название региона (region),
 * - название страны (country),
 * - количество жителей в городе (inhabitants),
 * - почтовый индекс города (index),
 * - телефонный код города (code).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных,
 * реализуйте конструктор с параметром и по умолчанию, геттеры и сеттеры для полей.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class City {

    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private String index;
    private String code;

    City()
    {
        name = "null";
        region = "null";
        country = "null";
        inhabitants = 0;
        index = "null";
        code = "null";
    }

    City( String name, String region, String country, int inhabitants, String index, String code)
    {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public void fill()
    {
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        region = scanner.next();
        country = scanner.next();
        inhabitants = scanner.nextInt();
        index = scanner.next();
        code = scanner.next();
    }

    public void show()
    {
        System.out.println(name);
        System.out.println(region);
        System.out.println(country);
        System.out.println(inhabitants);
        System.out.println(index);
        System.out.println(code);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public String getRegion()
    {
        return region;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getCountry()
    {
        return country;
    }

    public void setInhabitants(int inhabitants)
    {
        this.inhabitants = inhabitants;
    }

    public int getInhabitants()
    {
        return inhabitants;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    public String getIndex()
    {
        return index;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
}
