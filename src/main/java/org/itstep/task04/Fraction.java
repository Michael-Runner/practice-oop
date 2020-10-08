package org.itstep.task04;
/**
 * Задание 4
 * Создайте класс Дробь (Fraction).
 * <p>
 * Необходимо хранить в полях класса: числитель и знаменатель.
 * <p>
 * Реализуйте геттеры/сеттеры для полей класса.
 * <p>
 * Также создайте методы класса для выполнения арифметических операций:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление (division).
 * <p>
 * Методы должны принимать в качестве аргумента вторую дробь (Fraction) и
 * возвращать результат в виде дроби (Fraction).
 * <p>
 * Создайте два конструктора: по умолчанию, и с параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */

public class Fraction {
    private int numerator;
    private int denominator;

    Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addition( Fraction fraction)
    {
        Fraction result = new Fraction();

        if(denominator != fraction.denominator)
        {
            result.numerator = numerator * fraction.denominator + denominator * fraction.numerator;
            result.denominator = denominator * fraction.denominator;
        }
        else
        {
            result.numerator = numerator + fraction.numerator;
            result.denominator = denominator;
        }

        if (result.denominator == result.numerator)
        {
            result.denominator = 1;
            result.numerator = 1;
        }

        return result;
    }

    public Fraction subtraction(Fraction fraction)
    {
        Fraction result = new Fraction();

        if(denominator != fraction.denominator)
        {
            result.numerator = numerator * fraction.denominator - denominator * fraction.numerator;
            result.denominator = denominator * fraction.denominator;
        }
        else
        {
            result.numerator = numerator - fraction.numerator;
            result.denominator = denominator;
        }

        if (result.denominator == result.numerator)
        {
            result.denominator = 1;
            result.numerator = 1;
        }

        return result;
    }

    public Fraction multiplication(Fraction fraction)
    {
        Fraction result = new Fraction();

        result.numerator = numerator * fraction.numerator;
        result.denominator = denominator * fraction.denominator;

        if (result.denominator == result.numerator)
        {
            result.denominator = 1;
            result.numerator = 1;
        }

        return result;
    }

    public Fraction division(Fraction fraction)
    {
        Fraction result = new Fraction();

        if(denominator == fraction.denominator)
        {
            result.denominator = fraction.numerator;
            result.numerator = numerator;
            return result;
        }

        result.numerator = numerator * fraction.denominator;
        result.denominator = denominator * fraction.numerator;

        return result;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }
}