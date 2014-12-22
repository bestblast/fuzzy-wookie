package com.javarush.test.level09.lesson11.home09;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> result = new HashMap<String, Cat>();
        result.put("Vask1", new Cat("VaskaCat"));
        result.put("Vaska2", new Cat("Vaska2Cat"));
        result.put("Vaska3", new Cat("Vaska3Cat"));
        result.put("Vaska4", new Cat("Vaska4Cat"));
        result.put("Vas4a5", new Cat("Vaska5Cat"));
        result.put("Vaska6", new Cat("Vaska6Cat"));
        result.put("Vas3a7", new Cat("Vaska7Cat"));
        result.put("Va3a8", new Cat("Vaska8Cat"));
        result.put("Tima", new Cat("TimaCat"));
        result.put("Kot", new Cat("KotCat"));
        return result;
        //Напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> result = new HashSet<Cat>();
        for (Cat value : map.values())
        result.add(value);


            return result;
        //Напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
