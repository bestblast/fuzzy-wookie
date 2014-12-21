package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man m1 = new Man("Stepan",34,"343");
        Man m2 = new Man("Mugik",23," iuyd7, 33");
        System.out.println(m1);
        System.out.println(m2);
        Woman w1 = new Woman("Sveta",34,"343");
        Woman w2 = new Woman("Kolsa",23," iuyd7, 33");
        System.out.println(w1);
        System.out.println(w2);

        // Создай по два объекта каждого класса тут

        // Выведи их на экран тут
    }

    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return "[" + name + " " + age + " " + address + "]";
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return "[" + name + " " + age + " " + address + "]";
        }
    }



    // Напиши тут свои классы
}


