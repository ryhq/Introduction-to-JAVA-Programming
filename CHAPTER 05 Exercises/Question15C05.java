public class Question15C05 {
    public static void main(String[] args) {
        System.out.println("ASCII CODE  |  CHARACTER");
        System.out.println("------------------------");
        for (int i = 33; i < 127; i++) {
            System.out.printf("    %3d     |   %3c\n", i, (char) i);
        }
    }
}
