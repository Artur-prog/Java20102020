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

    /* 3. Написать метод getMaxNumber принимающий 2 параметра: int и int.
       Метод должен сравнить переданные параметры между собой и вернуть максимальный.
       Для решения необходимо использовать IF или тернарный оператор ?: */

    public static int getMaxNumber  (int a ,int b){
        if(a > b){
            return a;
        } else if(b > a){
            return b;
        }else{
            return a;
        }

    }

    /* 4. Написать метод isCharA принимающий 1 параметр типа char. Если передана буква 'А',
       то возвращать true, а в остальных случаях false */

    public static boolean isCharA  (char c){
        return  c == 'A';
    }

    /* 5. Написать метод isCharNumber принимающий 1 параметр типа char. Если передано число, то вернуть true,
       а в остальных случаях false */

    public static boolean isCharNumber  (char c){
        return Character.isDigit(c);
    }

    /* 6. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
       Для вывода бинарного представления использовать Integer.toBinaryString().
       Без входных параметров и не возвращающая ничего. */

    public static void printToBinaryString() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    /* 7. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
       Для вывода бинарного представления использовать Integer.toBinaryString().
       Без входных параметров и не возвращающая ничего.
       Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти */

    public static void intMaxValue(){
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE +1));
    }

    /* 8. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление. */

    public static int charToInt (char c){
        return (int) c;
    }

    /* 9. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде
       печатного символа */

    public static char intToChar  (int i){
        return (char) i;
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

        // 3.
        System.out.println(getMaxNumber(350,200));

        // 4.
        System.out.println(isCharA('A'));
        System.out.println(isCharA('B'));

        // 5.
        System.out.println(isCharNumber( '1' ));
        System.out.println(isCharNumber( 'A' ));

        // 6.
        printToBinaryString();

        // 7.
        intMaxValue();

        // 8.
        System.out.println( charToInt( 'H' ));

        // 9.
        System.out.println(intToChar(31));


    }
}
