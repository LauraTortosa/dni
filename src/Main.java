import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dni dn1 = new Dni(53377989, 'a');
        System.out.println(dn1.correctDni());
        System.out.println(dn1.toString());

        Dni dni2 = new Dni(544774, 'l');
        System.out.println( dni2.correctDni());
        System.out.println(dni2.toString());

    }
}
