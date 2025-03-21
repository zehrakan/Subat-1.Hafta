import java.util.Scanner;

public class Dizi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Girilen sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Eleman " + (i + 1) + ": " + dizi[i]);
        }

        scanner.close();
    }
}