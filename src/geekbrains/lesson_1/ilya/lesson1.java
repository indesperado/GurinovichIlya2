package geekbrains.lesson_1.ilya;

public class lesson1 {
    public static void main(String[] args) {
        printThreeWorlds();
        checkSumSign();
        printColor();
        compareNumber();
    }
    public static void printThreeWorlds() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 10;
        int b = -20;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная" + c);
        }
        else {
            System.out.println("Сумма отрицательная" + c);
        }
    }
    public static void printColor () {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Желтый");
        }
        if (value > 100){
            System.out.println("Зелекный");
        }
    }
    public static void compareNumber() {
        int a = 15;
        int b = 15;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}
