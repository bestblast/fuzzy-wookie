package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так,
чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human h111 = new Human("Дед",60,true,null,null);
        Human h110 = new Human("Бабка",55,false,null,null);
        Human h101 = new Human("Дед2",66,true,null,null);
        Human h100 = new Human("Бабка2",63,false,null,null);
        Human h11 = new Human("Отец",35,true,h111,h110);
        Human h10 = new Human("Мать",31,false,h101,h100);
        Human h1 = new Human("Дочь 1",3,false,h11,h10);
        Human h2 = new Human("Сын 1",7,true,h11,h10);
        Human h3 = new Human("Сын 2",8,true,h11,h10);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h11);
        System.out.println(h10);
        System.out.println(h110);
        System.out.println(h111);
        System.out.println(h101);
        System.out.println(h100);

        //Написать тут ваш код
    }

    public static class Human
    {
        private String name;
        private int age;
        private boolean sex;
        private Human father;
        private Human mother;

//        public Human(String name)
//        {
//            this.name = name;
//        }

        public Human(String name, int age, boolean sex, Human father, Human mother)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
