package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max,n2,n3,n4;

        max = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        if (n2>max)
            max = n2;
        n3 = Integer.parseInt(br.readLine());
        if (n3>max)
            max = n3;
        n4 = Integer.parseInt(br.readLine());
        if (n4>max)
            max = n4;

        System.out.println(max);

        //Напишите тут ваш код

    }
}
