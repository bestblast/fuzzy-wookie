package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5, 3,"we", "erw");
        Cat cat1 = new Cat("Jerry", 12 , 5, 3,"we", "e2rw");
        Dog dog1 = new Dog("Jerry", 123 , 54, 35,"wedec ", "ed2rw");

        System.out.println(jerryMouse.toString());

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;
        int age;
        String color;
        String nose;

//        public Mouse(String name, int height, int tail)
//        {
//            this.name = name;
//            this.height = height;
//            this.tail = tail;
//        }


        public Mouse(String name, int height, int tail, int age, String color, String nose)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.age = age;
            this.color = color;
            this.nose = nose;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;
        int age;
        String color;
        String nose;


        public Dog(String name, int height, int tail, int age, String color, String nose)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.age = age;
            this.color = color;
            this.nose = nose;
        }
    }
    public static class Cat {
        String name;
        int height;
        int tail;
        int age;
        String color;
        String nose;


        public Cat(String name, int height, int tail, int age, String color, String nose)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
            this.age = age;
            this.color = color;
            this.nose = nose;
        }
    }
    //Напишите тут ваши классы

}
