
class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i == 3) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
            i++;
        } while (i < 4);
    }
}