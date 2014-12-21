package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private String color;
    private int high;

    public Dog(String name){
        this.name = name;
    }
    public Dog(String name,int high){
        this.name = name;
        this.high = high;
    }
    public Dog(String name,int high, String color){
        this.name = name;
        this.high = high;
        this.color = color;

    }

    //Напишите тут ваш код

}
