import java.util.Scanner;

public class A_WorldCup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Y = scanner.nextInt();
        int ans = 0;

        while(true) {
            if (Y % 4 == 2) {
                ans = Y;
                break;
            }
            Y++;
        }

        System.out.println(ans);
    }
}
