import java.util.Scanner;
public class WaterUsage {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No of Families: ");
        int number = scanner.nextInt();
        System.out.println("Enter the litres consumed: ");
        double litres = scanner.nextDouble();
         System.out.println("Litres consumed: " + litres);
        System.out.println("Enter your house number: ");
        System.out.println("Number of Families  : " + number);
        System.out.println("Litres consumed: " + litres);
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: ");
        char status = scanner.next().charAt(0);
        System.out.println("Water usage status: " + status);
    }}
