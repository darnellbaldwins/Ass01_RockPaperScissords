import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PlayerA;
        String PlayerB;
        System.out.println("Player A, what is your move (r, s, p)");
        PlayerA = scanner.nextLine();
        System.out.println("Player B, what is your move (r, s, p");
        PlayerB = scanner.nextLine();
        if (PlayerA.equals(PlayerB)) {
            System.out.println("Player A and B have tied this round");
        } else if
        (PlayerA.equals("r") && PlayerB.equals("s")) {
            System.out.println("Player A wins"); }
        else if (PlayerA.equals("s") && PlayerB.equals("p")) {
            System.out.println("Player B wins"); }
        else if (PlayerA.equals("p") && PlayerB.equals("r")) {
            System.out.println("Player A wins"); }
            else System.out.println("PlayerB wins");
        scanner.close();
    }
}