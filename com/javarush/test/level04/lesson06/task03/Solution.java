package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
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

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);




        //Напишите тут ваш код

    }
}
