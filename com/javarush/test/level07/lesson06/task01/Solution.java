package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> sm = new ArrayList<String>();
        sm.add("1");
        sm.add("2");
        sm.add("13");
        sm.add("14");
        sm.add("15");
        System.out.println(sm.size());
        for (int i = 0; i < sm.size(); i++)
        {
            System.out.println(sm.get(i));
        }
        //Напишите тут ваш код

    }
}
