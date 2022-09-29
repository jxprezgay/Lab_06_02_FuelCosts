import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int gallons = 0;
        double mpg = 0;
        double pricePerGallon = 0;
        double range;
        double hundredMiles;
        String trash;

        System.out.print("What is the number of gallons in your tank: ");
        if(in.hasNextInt()){
            gallons = in.nextInt();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
            System.exit(0);
        }
        System.out.print("\nWhat is your fuel efficiency in miles per gallon: ");
        if(in.hasNextDouble()){
            mpg = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
            System.exit(0);
        }
        System.out.print("\nWhat is the price of gas per gallon: ");
        if(in.hasNextDouble()){
            pricePerGallon = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input.");
            System.exit(0);
        }
        hundredMiles = (100/mpg) * pricePerGallon;
        range = gallons * mpg;
        System.out.println("Your cost per 100 miles is $" + hundredMiles + " and you can travel " + range + " miles with your tank.");

    }
}