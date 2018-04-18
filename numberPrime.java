import java.util.Scanner;

public class numberPrime {
    public static void main(String[] args) {
        System.out.print("find number prime ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean check = true;
        int i = 2;
        while (i <= Math.sqrt(number)) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        if (check) {
            System.out.println("number prime");
        } else {
            System.out.println("no number prime");
        }
    }
}