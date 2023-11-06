public class Question18C02 {
    public static void main(String[] args) {
        System.out.println("\na\tb\tpow(a, b)");
        for (int i = 1; i < 6; i++) {
            System.out.println(i +  "\t" + ( i + 1 ) + "\t" + ((int)Math.pow( i, ( i + 1) )) );
        }
        System.out.println();
    }
}
