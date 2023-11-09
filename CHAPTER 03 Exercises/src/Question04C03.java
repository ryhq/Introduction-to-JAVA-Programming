public class Question04C03 {
    public static void main(String[] args) {
        int randomMonth = ((int) (Math.random() * 100)) % 13;
        switch (randomMonth) {
            case 1:
                System.out.println("\nRandom Month : January\n");
                break;
            case 2:
                System.out.println("\nRandom Month : February\n");
                break;
            case 3:
                System.out.println("\nRandom Month : March\n");
                break;
            case 4:
                System.out.println("\nRandom Month : April\n");
                break;
            case 5:
                System.out.println("\nRandom Month : May\n");
                break;
            case 6:
                System.out.println("\nRandom Month : June\n");
                break;
            case 7:
                System.out.println("\nRandom Month : July\n");
                break;
            case 8:
                System.out.println("\nRandom Month : August\n");
                break;
            case 9:
                System.out.println("\nRandom Month : September\n");
                break;
            case 10:
                System.out.println("\nRandom Month : October\n");
                break;
            case 11:
                System.out.println("\nRandom Month : November\n");
                break;
            case 12:
                System.out.println("\nRandom Month : December\n");
                break;
            default:
                System.out.println("\nError! Unable to compute random month\n");
                break;
        }
    }
}
