import java.util.Scanner;

public class trypro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of testcases
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt(); // number of houses in current township
            double totalAccentLiters = 0; // variable to store total liters of accent color used
            double totalRegularLiters = 0; // variable to store total liters of regular color used
            double totalHours = 0; // variable to store total hours spent painting
            for (int j = 0; j < N; j++) {
                int hallWalls = 6; // number of walls in hall
                int bedroomWalls = 3; // number of walls in bedroom on roof
                int kitchenWalls = 4; // number of walls in standard kitchen
                int otherWalls = hallWalls + bedroomWalls + kitchenWalls - 10; // number of walls in other rooms
                int accentWalls = (int) Math.ceil((hallWalls + bedroomWalls) / 3.0) + (int) Math.ceil(otherWalls / 3.0); // number of walls to paint with accent color
                int regularWalls = hallWalls + bedroomWalls + kitchenWalls + otherWalls - accentWalls; // number of walls to paint with regular color
                double accentLiters = accentWalls * 1.5 / 3.0; // liters of accent color used
                double regularLiters = regularWalls * 2.25 / 3.0; // liters of regular color used
                double accentHours = accentWalls * 2.5; // hours spent painting with accent color
                double regularHours = regularWalls * 3.25; // hours spent painting with regular color
                totalAccentLiters += accentLiters;
                totalRegularLiters += regularLiters;
                totalHours += accentHours + regularHours;
            }
            System.out.printf("Township #%d: %.2f liters of accent color, %.2f liters of regular color, %.2f hours\n", i, totalAccentLiters, totalRegularLiters, totalHours);
        }
        sc.close();
    }
}