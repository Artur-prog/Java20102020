package ru.projects;

public class Examples {

    /* 1. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
       Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte. */

    public static  byte sumByteAndShort(byte x, short y) {

        return (byte) (x + y);
    }



    public static void main(String[] args) {
        byte x = 63;
        short y = 53;


        // 1.
        System.out.println(sumByteAndShort(x,y));
    }
}
