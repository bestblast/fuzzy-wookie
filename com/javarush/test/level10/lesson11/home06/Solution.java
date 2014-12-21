package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        private boolean sex;
        private String name;
        private int age;
        private Human father;
        private Human mother;
        private Human[] child;

        public Human(boolean sex)
        {
            this.sex = sex;
        }

        public Human(String name)
        {
            this.name = name;
        }

        public Human(Human father, Human mother)
        {
            this.father = father;
            this.mother = mother;
        }

        public Human(Human[] child, boolean sex, int age, String name)
        {
            this.child = child;
            this.sex = sex;
            this.age = age;
            this.name = name;
        }

        public Human(boolean sex, int age)
        {
            this.sex = sex;
            this.age = age;
        }

        public Human(Human father, Human mother, Human[] child)
        {
            this.father = father;
            this.mother = mother;
            this.child = child;
        }

        public Human(int age)
        {
            this.age = age;
        }

        public Human(boolean sex, String name, int age)
        {
            this.sex = sex;
            this.name = name;
            this.age = age;
        }

        public Human(boolean sex, String name, int age, Human father, Human mother)
        {
            this.sex = sex;
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(boolean sex, String name, int age, Human father, Human mother, Human[] child)
        {
            this.sex = sex;
            this.name = name;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        //напишите тут ваши переменные и конструкторы
    }
}
