public class Question11C01 {
    public static void main(String[] args) {
        double population = 312032486;
        double year = 365.0;
        int secondsPerOneBirth = 7;
        double secondsPerYear = year * 24 * 60 * 60;
        double birthsPerYear = secondsPerYear / secondsPerOneBirth;
        int secondsPerOneDeath = 13;
        double deathsPerYear = secondsPerYear / secondsPerOneDeath;
        int secondsPerOneImmigrant = 45;
        double totalImmigrants = secondsPerYear / secondsPerOneImmigrant;
        System.out.println("Current Population : " + population);
        for (int i = 1; i < 5; i++) {
            population = population + birthsPerYear - deathsPerYear + totalImmigrants;
            System.out.println("The population the " + i + " year will be : " + population );
        }
    }
}
