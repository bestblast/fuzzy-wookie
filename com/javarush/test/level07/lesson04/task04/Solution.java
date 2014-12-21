package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] im = new int[10];
        for (int i = 0; i < im.length; i++)
        {
            im[i] = Integer.parseInt(br.readLine());
        }
//        Arrays.sort(im);
        for (int i = im.length - 1 ; i >= 0 ; i--)
        {
            System.out.println(im[i]);
        }
        //Напишите тут ваш код

    }
}
