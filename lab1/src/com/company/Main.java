package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число слов: ");
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        String name[] = new String[N];
        System.out.println("Введите слова: ");

        Scanner str;
        for (int i = 0; i < N; i++)
        {
            str = new Scanner(System.in);
            name[i] = str.nextLine();

            Palindrome.main(name[i]);
        }
    }
}

