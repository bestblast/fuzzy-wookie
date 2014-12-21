package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Фамилия9","Имя3");
        map.put("Фамилия8","Имя4");
        map.put("Фамилия7","Имя5");
        map.put("Фамилия1","Имя6");
        map.put("Фамилия2","Имя7");
        map.put("Фамилия3","Имя8");
        map.put("Фамилия3","Имя9");
        map.put("Фамилия5","Имя0");
        map.put("Фамилия4","Имя1");
        map.put("Фамилия3","Имя2");

        return map;
        //Напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> t : map.entrySet())
        {
            if (t.getValue().equals(name))
                count++;
        }
        return count;
        //Напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String,String> t : map.entrySet())
        {
            if (t.getKey().equals(familiya))
                count++;
        }
        return count;
        //Напишите тут ваш код

    }
}
