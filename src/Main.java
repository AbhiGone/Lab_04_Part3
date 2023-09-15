import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seasonOne;
        int seasonTwo;
        int seasonThree;
        int seasonFour;

        System.out.println("Input values for the maintenance costs for each of the four seasons.");
        seasonOne = scan.nextInt();
        seasonTwo = scan.nextInt();
        seasonThree = scan.nextInt();
        seasonFour = scan.nextInt();

        int total = seasonOne + seasonTwo + seasonThree + seasonFour;
        System.out.println("Your yearly cost for all the season combined is, " + total);
    }
}