import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int disks = scanner.nextInt();

        Towers.solve(disks, "A", "B", "C");
    }
}
