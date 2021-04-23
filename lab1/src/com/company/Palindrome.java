package com.company;

public class Palindrome
{
    public static void main(String s1)
    {
        String s2 = reverseString(s1);

        if (isPalindrome(s1, s2))
            System.out.println(s1 + " - палиндром");
        else
            System.out.println(s1 + " - обычное слово");
    }

    public static String reverseString(String s1)
    {
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--)
            s2 += s1.charAt(i);
        return s2;
    }

    public static boolean isPalindrome(String s1, String s2)
    {
        return s1.equals(s2);
    }
}
