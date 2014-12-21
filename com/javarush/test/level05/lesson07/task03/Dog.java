package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private String color;
    private int high;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name,int high){
        this.name = name;
        this.high = high;
    }
    public void initialize(String name,int high, String color){
        this.name = name;
        this.high = high;
        this.color = color;

    }

    //Напишите тут ваш код

}
