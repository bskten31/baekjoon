import java.util.Scanner;

public class Hanoi {
    private void HanoiMove(int count, int loc1, int loc2) {
        if (count == 1) System.out.println(loc1 + " " + loc2);
        else {
            HanoiMove(count - 1, 1, 2);
            HanoiMove(1, 1, 3);
            HanoiMove(count- 1, 2, 3);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((int)Math.pow(2, num) - 1);

        new Hanoi().HanoiMove(num, 1, 3);
    }
}
