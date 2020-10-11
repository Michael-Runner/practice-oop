package org.itstep.task07;
/**
 * Задание 7
 * <p>
 * Разработать  программу  для  представления  комплексных  чисел с возможностью задания
 * вещественной и мнимой частей числами типа double.
 * <p>
 * Вещественная часть должна быть представлена приватным полем real, а мнимая - imaginary
 * <p>
 * Реализовать конструктор с параметрами и по умолчанию
 * <p>
 * Обеспечить выполнение операций:
 * - сравнения чисел (equals) - возвращает boolean
 * - сложения (plus);
 * - вычитания (minus);
 * - умножения (times).
 *
 * Методы plus, minus, times должны возвращать экземпляр класса Complex
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Complex {
    private double real;
    private double imaginary;

    Complex()
    {
        real = 0;
        imaginary = 0;
    }

    Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex plus(Complex second)
    {
        Complex result = new Complex();

        result.real = real + second.real;
        result.imaginary = imaginary + second.imaginary;

        return result;
    }

    public Complex minus(Complex second)
    {
        Complex result = new Complex();

        result.real = real - second.real;
        result.imaginary = imaginary - second.imaginary;

        return result;
    }

    public Complex times(Complex second)
    {
        Complex result = new Complex();

        result.real = real * second.real - imaginary * second.imaginary;
        result.imaginary = imaginary * second.real + real * second.imaginary;

        return result;
    }

    public boolean equals(Complex second)
    {
        if(real == second.real && imaginary == second.imaginary)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getImaginary() {
        return imaginary;
    }

    public String toString()
    {
        String str = new String();

        if(real!=0)
        {
            str = String.valueOf(real);
        }

        if(real!=0 && imaginary!=0 && imaginary>0)
        {
            str = str + " + ";
        }
        else if (real!=0 && imaginary!=0 && imaginary<0)
        {
            imaginary = -imaginary;
            str = str + " - ";
        }

        if(imaginary!=0)
        {
            str = str + String.valueOf(imaginary)+"i";
        }

        if(real == 0 && imaginary == 0)
        {
            str = String.valueOf(0.0);
        }

        return str;
    }
}