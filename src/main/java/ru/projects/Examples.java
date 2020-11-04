package ru.projects;

public class Examples {

    /* 1. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
       Метод должен возвращать сумму значений параметров. Тип возвращаемого значения должен быть byte. */

    public static  byte sumByteAndShort(byte x, short y) {

        return (byte) (x + y);
    }

     /* 2. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
       Метод должен возвращать произведение значений параметров. Тип возвращаемого значения int. */

    public static int multiplicationByteAndLong(int i, long l) {
        return (int) (i*l);
    }



    public static void main(String[] args) {
        byte x = 63;
        short y = 53;
        int i = 50;
        long l= 616649797L;


        // 1.
        System.out.println(sumByteAndShort(x,y));

        // 2.
        System.out.println(multiplicationByteAndLong(i,l));


    }
}
