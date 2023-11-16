public class Question25C04 {
    public static char generateRandomCharacter() {
        return (char) (int) (65 + Math.random() * 25);
    }
    public static void main(String[] args) {
        String plateLetter = "";
        for (int i = 0; i < 4; i++) {
            plateLetter += generateRandomCharacter();
        }
        int plateDigits= (int)(100 + Math.random() * 899);
        System.out.println("\nPlate Number : " + plateLetter + " " + plateDigits + "\n");
    }
}
