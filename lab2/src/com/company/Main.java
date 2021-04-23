package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        point3d P1 = Vvod();
        point3d P2 = Vvod();
        point3d P3 = Vvod();

        double S = new point3d().computeArea(P1, P2, P3);
        if(S != 0)
            System.out.println(S);
        else
            System.out.println("Ошибка при вводе координат");
    }

    public static point3d Vvod()
    {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner z = new Scanner(System.in);

        return new point3d(x.nextDouble(), y.nextDouble(), z.nextDouble());
    }
}
