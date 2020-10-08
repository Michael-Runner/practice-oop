package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Задание 3
 * <p>
 * Создайте класс «Страна» (Country).
 * <p>
 * Необходимо хранить в полях класса:
 * - название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital - класс City),
 * - города страны (cities - массив City).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода
 * данных, реализуйте доступ к отдельным полям через
 * методы класса.
 * <p>
 * Добавить метод addCity для добавления нового города (города хранятся в массиве cities)
 * <p>
 * Метод getInhabitants должен возвращать количество жителей во всех городах страны (перебрать все города
 * в массиве cities и получить сумму жителей всех городов)
 * <p>
 * Реализовать два конструктора: один по умолчанию, второй с параметрами:
 * - название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital).
 * <p>
 * В этом классе должен быть агрегирован класс Города (City) из предыдущей задачи.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital = new City();
    private City[] cities = new City[0];

    Country()
    {
        name = "null";
        continent = "null";
        code = "null";
        capital.setName("null");
    }

    Country(String name, String continent, String code, City capital)
    {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
    }

    public void fill()
    {
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        continent = scanner.next();
        code = scanner.next();
        capital.fill();

        for(int i = 0; i< cities.length; i++)
        {
            cities[i].fill();
        }
    }

    public void show()
    {
        System.out.println(name);
        System.out.println(continent);
        System.out.println(code);
        capital.show();

        for (int i = 0; i < cities.length; i++)
        {
            System.out.println(cities[i]);
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setContinent(String continent)
    {
        this.continent = continent;
    }

    public String getContinent()
    {
        return continent;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City getCapital() {
        return capital;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public void getCities()
    {
        for(int i = 0; i< cities.length; i++)
        {
            cities[i].show();
        }
    }

    public int getInhabitants()
    {
        int allInhabitants = 0;

        for (int i = 0; i < cities.length; i++)
        {
            allInhabitants = allInhabitants + cities[i].getInhabitants();
        }

        return allInhabitants;
    }

    public void addCity(City city)
    {
        City[] addCity = Arrays.copyOf(cities, cities.length+1);
        this.cities = addCity;
        cities[cities.length-1] = city;
    }
}