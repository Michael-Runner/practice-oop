package org.itstep.task06;

import java.util.Arrays;

/**
 * Задание
 * Описать  базовый  класс  MainString  (Строка).
 * <p>
 * Обязательные поля класса:
 * - массив символов (chars);
 * - значение типа int хранит длину строки в символах (len).
 * <p>
 * Реализовать обязательные методы следующего назначения:
 * - конструктор без параметров;
 * - конструктор, принимающий в качестве параметра строковый литерал;
 * - конструктор, принимающий в качестве параметра символ и длину строки;
 * - метод получения длины строки (length());
 * - метод очистки строки (делает строку пустой) (clear());
 * - метод конкатенации (соединяет две строки типа MainString) (concat);
 * - метод поиска символа в строке (indexOf()).
 * - метод toString(), который возвращает строковое представление объекта
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class MainString {
    private char[]chars;
    private int len;

    MainString()
    {

    }

    MainString(String string)
    {
        chars = new char[string.length()];
        len = string.length();

        for (int i = 0; i < string.length(); i++)
        {
            chars[i] = string.charAt(i);
        }
    }

    MainString(char symbol, int len)
    {
        chars = new char[len];
        this.len = len;

        for (int i = 0; i < len; i++)
        {
            chars[i] = symbol;
        }
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public char[] getChars() {
        return chars;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getLen() {
        return len;
    }

    public int length()
    {
        int len = chars.length;
        return len;
    }

    public void clean()
    {
        char[] clear = new char[0];

        chars = clear;
    }

    public MainString concat(MainString string)
    {
        MainString str = new MainString();
        str.chars = new char[string.len + len];
        str.len = string.len + len;
        int counter = 0;

        for (int i = 0; i < str.chars.length; i++)
        {
            if(i < len)
            {
                str.chars[i] = chars[i];
            }
            else
            {
                str.chars[i] = string.chars[counter];
                counter++;
            }
        }

        return str;
    }

    public int indexOf(int id)
    {
        char symbol = (char) id;
        id = -1;
        for (int i = 0; i< chars.length; i++)
        {
            if(chars[i] == symbol)
            {
                id = i;
            }
        }
        return id;
    }

    public String toString()
    {
        String str =  new String();

        for (int i = 0; i<chars.length; i++)
        {
            str = str + String.valueOf(chars[i]);
        }

        return str;
    }
}
