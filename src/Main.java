import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String anotherWords;
        final int NUM = 312;
        String word = "Hello";
        anotherWords = NUM + word;
        System.out.println(anotherWords + word + NUM);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");

        }else {
            System.out.println("Вы сохранили ноль");

        }
        // while (true){
        System.out.println("Введите ваше имя");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Привет " + name);


    }
}
