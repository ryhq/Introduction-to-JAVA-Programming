import java.util.Scanner;

public class Question10C04 {
    public static void main(String[] args) {
        char choice;
        String set1 = "\n Y  3  5  7\n 9 11 13 15\n17 19 21 23\n25 27 29 31\n";
        String set2 = "\n 2  3  6  7\n10 11 14 15\n18 19 22 23\n26 27 30 31\n";
        String set3 = "\n 4  5  6  7\n12 13 14 15\n20 21 22 23\n28 29 30 31\n";
        String set4 = "\n 8  9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31\n";
        String set5 = "\n16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31\n";
        int day = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(set1);
            System.out.print("Is your birthday in Set1\nEnter N for No and Y for Yes : ");
            choice = input.nextLine().charAt(0);
            if (choice == 'Y') {
                day += 1;
            }
            System.out.println(set2);
            System.out.print("Is your birthday in Set2\nEnter N for No and Y for Yes : ");
            choice = input.nextLine().charAt(0);
            if (choice == 'Y') {
                day += 2;
            }
            System.out.println(set3);
            System.out.print("Is your birthday in Set3\nEnter N for No and Y for Yes : ");
            choice = input.nextLine().charAt(0);
            if (choice == 'Y') {
                day += 4;
            }
            System.out.println(set4);
            System.out.print("Is your birthday in Set4\nEnter N for No and Y for Yes : ");
            choice = input.nextLine().charAt(0);
            if (choice == 'Y') {
                day += 8;
            }
            System.out.println(set5);
            System.out.print("Is your birthday in Set5\nEnter N for No and Y for Yes : ");
            choice = input.nextLine().charAt(0);
        }
        if (choice == 'Y') {
            day += 16;
        }
        System.out.println("\nYour Birthday is " + day + "!\n");
    }
}
