import java.util.Scanner;

public class Random {

    Scanner scanner = new Scanner(System.in);

    public void logic () {
        System.out.println("Введите число a");
        int a = scanner.nextInt();


        System.out.println("Введите число b");
        int b = scanner.nextInt();

        int c = (int) (Math.random() * (b-a) + a);
        System.out.println(c);
    }
}
