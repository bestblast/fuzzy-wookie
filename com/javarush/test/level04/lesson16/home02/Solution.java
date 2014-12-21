package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t,n1,n2,n3;
        n1 = Integer.parseInt(br.readLine());
        n2 = Integer.parseInt(br.readLine());
        n3 = Integer.parseInt(br.readLine());
        if (n2>n1){
            t=n1;
            n1=n2;
            n2=t;
        }
        if (n3>n2){
            t=n2;
            n2=n3;
            n3=t;
        }
        if (n2>n1){
            t=n1;
            n1=n2;
            n2=t;
        }

        System.out.println(n2);
        //Напишите тут ваш код
    }
}
