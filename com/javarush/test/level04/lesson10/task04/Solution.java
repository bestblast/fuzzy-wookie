package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 0, j = 0;
        while (i < 10) {
            j=0;
            while (j<10)
            {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
        //Напишите тут ваш код

    }
}