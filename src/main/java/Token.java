import java.util.Random;
import java.util.Scanner;

public class Token {
    static int lenght;
    static final int n = 1;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";
    static StringBuilder sBuldier = new StringBuilder(lenght);


    public static void number() throws Exception {
        System.out.println("Enter code length you require 5, 10 or 15 ");
        lenght = sc.nextInt();
        if (lenght % 5 > 0 || lenght > 15) {
            throw new Exception("Wrong number entered, please try again");
        }
    }

    static String generator() {
        System.out.println("Your tokens :");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < lenght; j++) {
                sBuldier.append(str1.charAt(random.nextInt(str1.length())));
            }
            System.out.println("  " + sBuldier.toString());
        }
        return sBuldier.toString();

    }
}
