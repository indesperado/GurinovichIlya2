package geekbrains.lesson_1.ilya;

public class Main {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int number = a + b;
        System.out.println(chekNumber(number));
        numberA(-2);
        System.out.println(trueFalse(2));
        for (int i = 0; i <= 100; i++){
            if (i == 20){
                break;
            }
            System.out.println("Илья");
        }
    }
    private static boolean chekNumber(long number) {
        return number >= 10 && number <= 20;
    }
    public static void numberA (int local){
        if (local >=0) {
            System.out.println("Чисто положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean trueFalse(int balance){
        return balance < 0;
    }


}

