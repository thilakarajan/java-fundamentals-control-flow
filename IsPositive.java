
import java.util.*;

class IsPositive {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int u = n.nextInt();
        if (u > 0) {
            System.out.println("Is positive");
        } else if (u < 0) {
            System.out.println("is negative");
        } else {
            System.out.println("is zero");
        }
    }
}