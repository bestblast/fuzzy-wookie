package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] im = new int[20];
        for (int i = 0; i < im.length; i++)
        {
            im[i] = Integer.parseInt(br.readLine());
        }
        int [] i1 = new int[10];
        int [] i2 = new int[10];
        for (int i = 0; i < i1.length; i++)
        {
            i1[i] = im[i];
        }
        for (int i = 0; i < i2.length; i++)
        {
            i2[i] = im[i+10];
        }
        for (int i = 0; i < i2.length; i++)
        {
            System.out.println(i2[i]);
        }
        //Напишите тут ваш код

    }
}
