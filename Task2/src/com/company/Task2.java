package com.company;

public class Task2
{
    public static void main(String[] args)
    { }
    //1.Создайте функцию, которая повторяет каждый символ в строке n раз
    public static void repeat(String str, int num)
    {
        int N = str.length();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < num; j++)
            {
                System.out.print(str.charAt(i));
            }
    }

    //2.Создайте функцию, которая принимает массив и возвращает разницу
    // между самыми большими и самыми маленькими числами
    public static void differenceMaxMin(int[] a)
    {
        int max = a[0], min = a[0];
        for (var A: a)
        {
            if(A > max)
                max = A;
            if(A < min)
                min = A;
        }
        System.out.println(max - min);
    }

    //3.Создайте функцию, которая принимает массив в качестве аргумента
    // и возвращает true или false в зависимости от того, является ли
    // среднее значение всех элементов массива целым числом или нет
    public static void isAvgWhole(int[] a, int n)
    {
        int sum = 0;
        for (var A: a)
        {
            sum += A;
        }
        if((sum / n) % 2 == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }

    //4.Создайте метод, который берет массив целых чисел и возвращает
    // массив, в котором каждое целое число является суммой самого
    // себя + всех предыдущих чисел в массиве
    public static void cumulativeSum(int[] a, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                a[i] += a[j];
            }
            System.out.println(a[i]);
        }
    }

    //5.Создайте функцию, которая возвращает число десятичных знаков,
    // которое имеет число (заданное в виде строки). Любые нули после
    // десятичной точки отсчитываются в сторону количества десятичных знаков
    public static void getDecimalPlaces(String str)
    {
        int N = str.length();
        int sum = 0;

        for (int i = 0; i < N; i++)
        {
            if(str.charAt(i) == '.')
            {
                for (int j = i+1; j < N; j++)
                    sum++;
                break;
            }
        }
        System.out.print(sum);
    }

    //6.Создайте функцию, которая при заданном числе возвращает
    // соответствующее число Фибоначчи
    public static void Fibonacci(int num)
    {
        int n1 = 0, n2 = 1, sum = 0;
        for(int i = 0; i < num; i++)
        {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println(sum);
    }

    //7.Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
    //напишите функцию, чтобы определить, является ли вход действительным
    //почтовым индексом
    public static int isValid(String str)
    {
        if(str.length() != 5)
        {
            System.out.print("false");
            return -1;
        }

        for (int i = 0; i < 5; i++)
        {
            if(str.charAt(i) == ' ')
            {
                System.out.print("false");
                return -2;
            }
            if(!Character.isDigit(str.charAt(i)))
            {
                System.out.print("false");
                return -3;
            }
        }
        System.out.print("true");
        return 0;
    }

    //8.Пара строк образует странную пару, если оба из следующих условий истинны:
    //– Первая буква 1-й строки = последняя буква 2-й строки.
    //– Последняя буква 1-й строки = первая буква 2-й строки.
    //– Создайте функцию, которая возвращает true, если пара строк
    // представляет собой странную пару, и false в противном случае
    public static void isStrangePair (String str1, String str2)
    {
        int N1 = str1.length();
        int N2 = str2.length();

        if((str1.charAt(0) == str2.charAt(N2-1)) && (str1.charAt(N1-1) == str2.charAt(0)))
            System.out.print("true");
        else
            System.out.print("false");
    }

    //9.Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
    //– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
    //– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
    //– В противном случае верните false
    public static int isPrefix(String str, String arg)
    {
        int N1 = str.length();
        int N2 = arg.length();

        for(int i = 0; i < N2; i++)
        {
            if(str.charAt(i) != arg.charAt(i))
            {
                System.out.print("isPrefix - false");
                return -1;
            }
        }
        System.out.println("isPrefix - true");
        return 0;
    }

    public static int isSuffix(String str, String arg)
    {
        int N1 = str.length() - 1;
        int N2 = arg.length() - 1;

        for(int i = N1, j = N2; i > N1-N2; i--, j--)
        {
            if(str.charAt(i) != arg.charAt(j))
            {
                System.out.print("isPrefix - false");
                return -2;
            }
        }
        System.out.println("isPrefix - true");
        return 0;
    }

    //10.Создайте функцию, которая принимает число (шаг) в качестве аргумента и возвращает количество полей на этом шаге последовательности.
    //Шаг 0: начните с 0
    //Шаг 1: Добавьте 3
    //Шаг 2: Вычтите 1
    //Повторите Шаги 1 И 2,,,
    public static void boxSeq(int num)
    {
        int rez = 0;

        for(int i = 0; i < num; i+=2)
        {
            rez += 2;
        }
        if(num % 2 == 0)
            System.out.println(rez);
        else
            System.out.println(rez + 1);
    }
}
