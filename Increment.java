
import java.util.*;

class Increment {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a positive number:");
        int u = n.nextInt();
        int i = 1;
        while (i <= u) {
            if (i == u) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
            i++;
        }
    }
}