package org.itstep.task05;
/**
 * Создать  класс  Money  (Деньги)  для  работы  с  денежными  суммами.
 * <p>
 * Число должно быть представлено двумя полями:
 * - типа long (hryvnia)  – для гривен;
 * - типа byte (kopecks) – для копеек.
 * <p>
 * Добавить сеттеры и геттеры для полей
 * <p>
 * Добавить три конструктора: по умолчанию и два с параметрами (первый принимает только гривны, второй - гривны и копейки)
 * <p>
 * Реализовать вывод значения на экран, при этом дробная часть должна быть отделена от целой части запятой.
 * <p>
 * Реализовать:
 * - сложение (addition).
 * - вычитание (subtraction),
 * - умножение (multiplication),
 * - деление на дробное число (division),
 * - умножение на дробное (метод multiply) число
 * - операции сравнения (метод equals) возвращает boolean.
 * <p>
 * Методы сложения, вычитания, умножения должны принимать другой объект Money
 * <p>
 * Все методы, кроме equals, возвращают результат типа Money
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 *
 * Примечание: не учитывать номиналы купюр и монет
 */
public class Money {

    private long hryvnia;
    private byte kopecks;

    Money()
    {
        hryvnia = 0;
        kopecks = 0;
    }

    Money(long hryvnia)
    {
        setHryvnia(hryvnia);
    }

    Money(long hryvnia, byte kopecks)
    {
        setHryvnia(hryvnia);
        setKopecks(kopecks);
    }

    public void show()
    {
        System.out.println(getHryvnia());
        System.out.println(getKopecks());
    }

    public Money addition(Money sum)
    {
        Money result = new Money();

        result.hryvnia = hryvnia + sum.hryvnia;
        result.kopecks = (byte) (kopecks + sum.kopecks);

        while(result.kopecks > 99)
        {
            result.hryvnia++;
            result.kopecks-=100;
        }
        return result;
    }

    public Money subtraction(Money sum)
    {
        Money result = new Money();

        if(sum.kopecks > 99)
        {
            sum.hryvnia++;
            sum.kopecks-=100;
        }

        result.hryvnia = hryvnia - sum.hryvnia;
        result.kopecks = (byte) (kopecks - sum.kopecks);

        if(result.kopecks < 0)
        {
            result.hryvnia--;
            result.kopecks =(byte) (100 + result.kopecks);
        }

        return result;
    }

    public Money multiplication(Money sum)
    {
        Money result = new Money();

        result.hryvnia = hryvnia * sum.hryvnia;
        result.kopecks = (byte)(kopecks * sum.kopecks);

        while(result.kopecks>99)
        {
            result.kopecks-=100;
            result.hryvnia++;
        }

        return result;
    }

    public Money multiply(double sum)
    {
        Money result = new Money();

        result.hryvnia = hryvnia * (int) sum;
        result.kopecks = (byte)(kopecks * sum);

        while(result.kopecks>99)
        {
            result.kopecks-=100;
            result.hryvnia++;
        }

        return result;
    }

    public Money division(double sum)
    {
        Money result = new Money();

        result.hryvnia = hryvnia / (int) sum;
        result.kopecks = (byte) (kopecks / sum);

        return result;
    }

    public boolean equals(Money sum)
    {
        if(hryvnia == sum.hryvnia && kopecks == sum.kopecks)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setHryvnia(long hryvnia)
    {
        this.hryvnia = hryvnia;
    }

    public long getHryvnia()
    {
        return hryvnia;
    }

    public void setKopecks(byte kopecks)
    {
        this.kopecks = kopecks;
    }

    public byte getKopecks()
    {
        return kopecks;
    }
}
