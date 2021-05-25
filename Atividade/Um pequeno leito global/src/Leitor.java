import java.util.Scanner;

public class Leitor {

    static Scanner leitor = new Scanner(System.in);

    public static String leitorString() {
        String nome;
        nome = leitor.nextLine();
        return nome;
    }

    public static int leitorInt() {
        int num;
        num = leitor.nextInt();
        return num;
    }

    public static double leitorDouble() {
        double num;
        num = leitor.nextDouble();
        return num;
    }

}
