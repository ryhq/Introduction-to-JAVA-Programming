public class MAC_Address_Generator {
    /**
     * The method to generate random numbers between 1 and 15 inclusively
     */
    public static int randomINT() {
        return (int) (1 + Math.random() * 15);
    }
    /*
     * Method to convert single integer to Hexadecimal number
     */
    public static String integerToHexadecimal(int integer) {
        return Integer.toHexString(integer).toUpperCase();
    }
    /*
     * Method to generate Random MAC address
     */
    public static String generateMAC() {
        String MAC = "";
        for (int i = 1; i <= 12; i++) {
            if (i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
                MAC += ":";
            }
            MAC += integerToHexadecimal(randomINT());
        }
        return MAC;
    }
    public static void main(String[] args) {
        System.out.println("\n20 Random MAC Address");
        System.out.println("_________________________");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("\n%3d\t%s\n", i, generateMAC());
        }
        System.out.println();
    }
}
