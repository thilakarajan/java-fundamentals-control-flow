
import java.util.*;

class Decrement {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int u = n.nextInt();
        while (u >= 1) {
            if (u == 1) {
                System.out.print(u);
            } else {
                System.out.print(u + ",");
            }
            u--;
        }
    }
}