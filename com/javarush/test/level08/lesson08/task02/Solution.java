package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(911);
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);
        set.add(27);
        set.add(28);
        set.add(29);
        set.add(20);
        set.add(229);

        return (HashSet)set;

        //Напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> set1 = new HashSet<Integer>();

        for (Integer t : set)
        {
            if (t <= 10)
                set1.add(t);
        }
        return set1;
        //Напишите тут ваш код

    }
}
