package com.company;

public class Task1
{
    public static void main(String[] args)
    { }
    //1.Два числа передаются в качестве параметров.
    // Первый параметр, разделенный на второй параметр, будет иметь остаток,
    // возможно, ноль. Верните это значение
    public static int remainder(int a, int b)
    {
        return a % b;
    }
    //2.Напишите функцию, которая принимает основание и высоту
    // треугольника и возвращает его площадь
    public static int triArea(int h, int a)
    {
        return h*a/2;
    }
    //3.В этой задаче фермер просит вас сказать ему, сколько ног можно
    // сосчитать среди всех его животных
    public static int animals(int chickens, int cows, int pigs)
    {
        return chickens*2 + cows*4 + pigs*4;
    }
    //4.Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
    //возвращает true, если prob * prize > pay; в противном случае возвращает false
    public static boolean profitableGamble(float prob, int prize, int pay)
    {
        if(prob * prize > pay)
            return true;
        else
            return false;
    }
    //5.Напишите функцию, которая принимает 3 числа и возвращает,
    // что нужно сделать с a и b: они должны быть сложены, вычитаны,
    // умножены или разделены, чтобы получить N. Если ни одна из
    // операций не может дать N, верните "none"
    public static String operation(int a, int b, int N)
    {
        if (a+b == N)
            return "Сложение";
        if (Math.abs(a-b) == N)
            return "Вычитание";
        if (a*b == N)
            return "Умножение";
        if (a/b == N)
            return "Деление";
        return "Найн";
    }
    //6.Создайте функцию, которая возвращает значение ASCII переданного символа
    public static int ctoa(char symbol)
    {
        return (int)symbol;
    }
    //7.Напишите функцию, которая берет последнее число из последовательного
    //списка чисел и возвращает сумму всех чисел до него и включая его
    public static int addUpTo(int a)
    {
        int sum = 0;
        for(int i = 1; i <= a; i++)
            sum += i;
        return sum;
    }
    //8.Создайте функцию, которая находит максимальное значение третьего
    //ребра треугольника, где длины сторон являются целыми числами
    public static int addUpTo(int a, int b)
    {
        return a + b - 1;
    }
    //9.Создайте функцию, которая принимает массив чисел и возвращает сумму его кубов
    public static int sumOfCubes(int[] a)
    {
        int sum = 0;
        for (var A: a)
        {
            sum += A*A*A;
        }
        return sum;
    }
    //10.Создайте функцию, которая будет для данного a, b, c выполнять следующие действия:
    //– Добавьте A к себе B раз.
    //– Проверьте, делится ли результат на C
    public static boolean abcmath(int A, int B, int C)
    {
        int sum = A;
        for(int i = 0; i < B; i++)
            sum *= 2;
        System.out.println(sum);
        if(sum % C == 0)
            return true;
        else
            return false;
    }
}
