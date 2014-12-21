package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> sm = new ArrayList<String>();
        sm.add("101");
        sm.add("102");
        sm.add("103");
        sm.add("104");
        sm.add("105");
        sm.remove(0);
        sm.remove(1);
        sm.remove(2);
        for (int i = 0; i < sm.size(); i++)
        {
            System.out.println(sm.get(i));
        }
        System.out.println(sm.size());
        //Напишите тут ваш код

    }
}
