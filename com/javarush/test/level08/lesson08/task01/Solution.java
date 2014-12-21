package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<String>();
        set.add("Л2");
        set.add("Л1");
        set.add("Лц2");
        set.add("Л3");
        set.add("Л4");
        set.add("Л5");
        set.add("Л6");
        set.add("Л7");
        set.add("Л8");
        set.add("Л9");
        set.add("Л0");
        set.add("Л-");
        set.add("Лйц");
        set.add("Лцй");
        set.add("Лц");
        set.add("Лу");
        set.add("Лк");
        set.add("Ле");
        set.add("Лн");
        set.add("Лг");

        return (HashSet) set;

        //Напишите тут ваш код

    }
}
