import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();

        System.out.println("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("Ebob: " + ebob);
            }
            i++;
        }

        System.out.println("Ekok : " + ((n1 * n2) / ebob));
    }
}
