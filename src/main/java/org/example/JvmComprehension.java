package org.example;

public class JvmComprehension {
    public static void main(String[] args) {
        int i = 1;                      // ClassLoader загружает класс JvmComprehension в метаспейс. В стеке создается фрейм для метода Main. В стеке выделяется место для хранения переменной i типа int.
        Object o = new Object();        // ClassLoader загружает класс Object в метаспейс. В куче выделяется место для хранения объекта класса Object. В стеке выделяется место для хранения переменной o, содержащей ссылку.
        Integer ii = 2;                 // ClassLoader загружает класс Integer в метаспейс. В куче выделяется место для хранения объекта класса Integer. В стеке выделяется место для хранения переменной ii, содержащей ссылку.
        printAll(o, i, ii);             // Создается фрейм для метода printAll в стеке. Ссылки на объекты Object и Integer сохраняются в фрейме (параметры o и ii). Значение параметра i сохраняется в фрейме.
        System.out.println("finished"); // Создается фрейм для метода println в стеке. В куче выделяется место для строки "finished". Ссылка на строку помещается в фрейм. Сборщик мусора уничтожает все объекты из кучи, на которые больше нет ссылок.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // В куче выделяется место для хранения объекта класса Integer. В стеке выделяется место для хранения переменной uselessVar, содержащей ссылку.
        System.out.println(o.toString() + i + ii);  // Создается фрейм для метода println в стеке, в него передаются ссылки на ii и значение i.
    }

}
