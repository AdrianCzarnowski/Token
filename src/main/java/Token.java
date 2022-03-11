import java.util.Random;
import java.util.Scanner;

public class Token {
    static int length;
    static final int n = 1;
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final String str1 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()";
    static StringBuilder sBuldier = new StringBuilder(length);


    public static void number() {
        System.out.println("Enter code length you require 5, 10 or 15 ");
        length = Integer.parseInt(sc.nextLine());
        if (length % 5 > 0 || length > 15) {
            System.out.println("Wrong number entered, please try again");
            number();
        }
    }

    static String generator() {
        System.out.println("Your tokens :");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < length; j++) {
                sBuldier.append(str1.charAt(random.nextInt(str1.length())));
            }
            System.out.println("  " + sBuldier.toString());
        }
        return sBuldier.toString();

    }
}
